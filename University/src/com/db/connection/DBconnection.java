package com.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	private static Connection conn=null;
	private static String url = "jdbc:mysql://localhost:3306/UniversityProject?useUnicode=true&characterEncoding=utf8";
	public static Connection getInstance() {
		if(conn==null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection(url,"root","1234");
				System.out.println("DB 연결 성공");
			}catch(Exception e) { // 오류를 잡아주는 최상위 클래스 
				System.out.println("DB 연결 실패"+e);ㅁㄴㅇㅁ
			}
		}
		return conn;
	}
}
