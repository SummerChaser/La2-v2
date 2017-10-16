package com.summer.pojo;

import java.util.ArrayList;

public class Book {
	// Book实体类 成员变量对应Book表的item
	private String ISBN;
	private String Title;
	private String Publisher;
	private String PublishDate;
	private int AuthorID;
	private float Price;
	private int age;
	private String country;
	private String name;	
	private ArrayList<Book> bkList;

	public ArrayList<Book> getBkList() {
		return bkList;
	}

	public void setBkList(ArrayList<Book> bkList) {
		this.bkList = bkList;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}
		
		
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
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

	public int getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

}
