package com.summer.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.summer.dao.BookDAO;
import com.summer.pojo.Book;

public class UpdateAction extends ActionSupport {
     //更新书籍
	 private static final long serialVersionUID = 5868754230374844026L;
	 //通过struts2属性驱动数据自动封装特性实现数据传输
	 private String ISBN; 
	 private String name;
	 private String Publisher;
	 private String PublishDate;
	 private float Price;
	 private int AuthorID;

	public String execute() throws Exception {
	
		BookDAO dao = new BookDAO();
		//通过dao类先数据库传递更新的信息并执行
		dao.update(ISBN,name,Publisher,PublishDate,Price,AuthorID);
		return "index";//返回更新成功界面
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public int getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}


	

}