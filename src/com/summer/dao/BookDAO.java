package com.summer.dao;


import java.sql.*;
import java.util.*;

import com.summer.pojo.Book;
import com.summer.pojo.Detail;
import com.summer.util.BaseConnection;
//数据库操作类
public class BookDAO {
	//获取所有书籍列表
	public ArrayList<Book> getBookList() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		//连接数据库
		Connection con = BaseConnection.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		// sql查询语句 联表查询
		String sql = "select * from book,author where book.authorid = author.authorid";

		try {
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Book bk = new Book();
				//把获取的数据封装到bk中
				bk.setTitle(rs.getString("title"));
				bk.setISBN(rs.getString("ISBN"));
				bk.setAuthorID(rs.getInt("AuthorID"));
				bk.setPrice(rs.getFloat("price"));
				bk.setPublishDate(rs.getDate("publishDate").toString());
				bk.setPublisher(rs.getString("publisher"));
				bk.setAge(rs.getInt("age"));
				bk.setCountry(rs.getString("country"));
				bk.setName(rs.getString("name"));
				bookList.add(bk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 关闭资源
		closeRes(con, st, rs);
		return bookList;

	}
	// 获取作者书籍列表
	public ArrayList<Book> getAuthorBookList(String name) { 
		ArrayList<Book> bookList = new ArrayList<Book>();
		Connection con = BaseConnection.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		// sql语句 联表查询 通过ahthor id外键联系
		String sql = "select * from book,author where book.authorid = author.authorid "
				+ "and author.`name` = ?";

		try {
			st = con.prepareStatement(sql);
			st.setString(1, name);
			rs = st.executeQuery();
			while (rs.next()) {
				Book bk = new Book();
				bk.setTitle(rs.getString("title"));
				bk.setISBN(rs.getString("ISBN"));
				bk.setAuthorID(rs.getInt("AuthorID"));
				bk.setPrice(rs.getFloat("price"));
				bk.setPublishDate(rs.getDate("publishDate").toString());
				bk.setPublisher(rs.getString("publisher"));
				bk.setAge(rs.getInt("age"));
				bk.setCountry(rs.getString("country"));
				bk.setName(rs.getString("name"));
				bookList.add(bk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeRes(con, st, rs);
		return bookList;

	}
	public ArrayList<Detail> showDetail(String isbn) { 
		
		Connection con = BaseConnection.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * from book,author where book.authorid = author.authorid and book.isbn"
				+ " = ?";
		ArrayList<Detail> dl = new ArrayList<Detail>();
		try {
			st = con.prepareStatement(sql);
			st.setString(1, isbn);
			rs = st.executeQuery();
			while (rs.next()) {
		
				Detail d = new Detail();
				d.setItem("ISBN");
				d.setContent(rs.getString("ISBN"));
				dl.add(d);
				d = new Detail();
				d.setItem("标题");
				d.setContent(rs.getString("title"));
				dl.add(d);
				d = new Detail();
				d.setItem("作者姓名");
				d.setContent(rs.getString("name"));
				dl.add(d);
				d = new Detail();
				d.setItem("作者ID");
				d.setContent(String.valueOf(rs.getInt("AuthorID")));
				dl.add(d);
				d = new Detail();
				d.setItem("出版日期");
				d.setContent(rs.getDate("publishDate").toString());
				dl.add(d);
				d = new Detail();
				d.setItem("出版社");
				d.setContent(rs.getString("publisher"));
				dl.add(d);
				d = new Detail();
				d.setItem("价格");
				d.setContent(rs.getString("price"));
				dl.add(d);
				d = new Detail();
				d.setItem("作者年龄");
				d.setContent(String.valueOf(rs.getInt("age")));
				dl.add(d);
				d = new Detail();
				d.setItem("作者国籍");
				d.setContent(rs.getString("country"));
				dl.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeRes(con, st, rs);
		return dl;

	}
	// 插入书籍
	public void insert(Book bk) {
		Connection con = BaseConnection.getConnection();
		PreparedStatement st = null;
		// 插入基本图书信息
		String sql = "insert into book (ISBN,Title,authorid,publisher,publishdate,price) "
				+ "values (?,?,?,?,?,?)";
		try {
			st = con.prepareStatement(sql);
			st.setString(1, bk.getISBN());
			st.setString(2, bk.getTitle());
			st.setInt(3, bk.getAuthorID());
			st.setString(4, bk.getPublisher());
			st.setString(5, bk.getPublishDate());
			st.setFloat(6, bk.getPrice());
			int cnt = st.executeUpdate();
			int id = bk.getAuthorID();
			// 如果作者不存在，添加作者 （根据author id判断）
			sql = "insert into  author(authorid,`name`,age,country) select distinct ?,?,?,?"
					+ " from author where not exists(select * from author where authorid=?)";

			st = con.prepareStatement(sql);
			st.setInt(1, bk.getAuthorID());
			st.setString(2, bk.getName());
			st.setInt(3, bk.getAge());
			st.setString(4, bk.getCountry());
			st.setInt(5, bk.getAuthorID());
			cnt = st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeRes(con, st);
	}

	public void update(String ISBN,String name,String Publisher,String PublishDate,float Price,int AuthorID) {
		// 更新信息 
		Connection con = BaseConnection.getConnection();
		PreparedStatement st = null;
		// 通过isbn 和 authorid更新相关信息
		String sql = "update book,author set name=?,publisher=?,publishdate=?,price=? "
				+ "where isbn=? and author.authorid=?";
	
		try {
			st = con.prepareStatement(sql);
			st.setString(1, name);
			st.setString(2, Publisher);
			st.setString(3, PublishDate);
			st.setFloat(4, Price);
			st.setString(5,ISBN);
			st.setInt(6, AuthorID);
			int cnt = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeRes(con, st);
	}
	// 删除操作
	public void delete(String ISBN) {
		Connection con = BaseConnection.getConnection();
		PreparedStatement st = null;
		// 根据isbn删除数据
		String sql = "delete from book where isbn=?";

		try {
			st = con.prepareStatement(sql);
			st.setString(1, ISBN);
			int cnt = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeRes(con, st);

	}

	public static void closeRes(Connection con, PreparedStatement st) {
		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	public static void closeRes(Connection con, PreparedStatement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ArrayList<Book> bookList = new BookDAO().getBookList();
		for (Book bk : bookList) {
			System.out.println(bk.getTitle() + " " + bk.getPrice() + " " + bk.getName() + " " + bk.getCountry());
		}

		Book bk = new Book();
		bk.setISBN("1345");
		bk.setTitle("fight");
		bk.setAuthorID(3);
		bk.setPublisher("厦门出版");
		bk.setPublishDate("1966-12-20");
		bk.setPrice(56.6f);
		//insert(bk);
		//update(bk);
		//delete("666");
	}

}
