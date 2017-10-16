package com.summer.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.summer.dao.BookDAO;
import com.summer.pojo.Book;
import com.summer.pojo.Detail;

public class DetailAction extends ActionSupport {
	//  
	private static final long serialVersionUID = -5432988297582678598L;
	// 通过前端传入的isbn进行书籍信息查询
	private String isbn;
	private ArrayList<Detail> dl = new ArrayList<Detail>();
	// 详细信息列表 item content
	@Override
	public String execute() throws Exception {
		dl = new BookDAO().showDetail(isbn);
		// 通过action context传递参数
		ActionContext.getContext().put("dl",dl);
		return "detail"; //返回详细信息页面
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public ArrayList<Detail> getDl() {
		return dl;
	}

	public void setDl(ArrayList<Detail> dl) {
		this.dl = dl;
	}


}
