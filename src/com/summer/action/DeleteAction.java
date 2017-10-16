package com.summer.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.summer.dao.BookDAO;


public class DeleteAction extends ActionSupport {
	// 
	private static final long serialVersionUID = 5868754230374844026L;
	private String isbn;
	// 通过struts2数据自动封装机制 获取前端传来的isbn数据
	public String execute() throws Exception {
		BookDAO dao = new BookDAO();
		dao.delete(isbn);//通过dao删除isbn对应的书籍信息
		return "index"; //返回删除成功界面
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
