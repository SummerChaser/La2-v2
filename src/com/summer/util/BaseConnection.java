package com.summer.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseConnection {
	// 数据库连接类
	public static Connection getConnection() {
		Connection con = null;
		try {
			// 获取驱动类 连接数据库
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab2?characterEncoding=utf8&useSSL=false", "root", "uAiqwVwjJ8-i");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
