package com.summer.action;

import java.util.ArrayList;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.summer.dao.BookDAO;
import com.summer.pojo.Book;


public class AddAction extends ActionSupport {
	//添加书籍 
	private static final long serialVersionUID = -5886397397505868503L;
	private Book bk; //利用struts2标签驱动实现数据传输

	public String execute() throws Exception {
		BookDAO dao = new BookDAO();//利用BookDAO辅助类进行数据库插入操作
		dao.insert(bk);
		return "index";//返回添加成功界面
	}
	public Book getBk() { //实现getter setter
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
}
