package com.summer.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.summer.dao.BookDAO;
import com.summer.pojo.Book;

public class SearchAuthorAction extends ActionSupport {
	// 查询作者书籍
	private static final long serialVersionUID = -5838522724830469902L;
	private String name;
	private ArrayList<Book> bkList;
	
	public String execute() throws Exception {
		System.out.println(name);
		// 通过action contetx传递参数
		ActionContext.getContext().put("bkList",new BookDAO().getAuthorBookList(name) );
		return "showList";//返回作者书籍列表
	}


	public ArrayList<Book> getBkList() {
		return bkList;
	}


	public void setBkList(ArrayList<Book> bkList) {
		this.bkList = bkList;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	
	
	
	
}
