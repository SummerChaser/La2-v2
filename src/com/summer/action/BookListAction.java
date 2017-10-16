package com.summer.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.summer.dao.BookDAO;
import com.summer.pojo.Book;

public class BookListAction extends ActionSupport {
	// 返回书籍列表
	private static final long serialVersionUID = -2974433274351715113L;
	private ArrayList<Book> bkList; //书籍列表
	
	public String execute() throws Exception {
		// 调用BookDAO辅助类，得到所有书籍列表bklist
		// 通过action context传递参数，前端页面可从request中获取数据
		ActionContext.getContext().put("bkList",new BookDAO().getBookList() );
		return "allList"; //返回所有书籍列表界面
	}

	public ArrayList<Book> getBkList() { //实现getter setter
		return bkList;
	}
	public void setBkList(ArrayList<Book> bkList) {
		this.bkList = bkList;
	}




	
	
	
	
}
