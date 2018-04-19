package com.kwon.ihwac.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBManager {

	// 미리 연결을 몇개 만들어 놓고
	// DB서버와 연결 해달라고 하면 만들어 놓은 연결을 주는 시스템
	// ConnectionPool
	public static Connection connect() throws NamingException, SQLException {

		// context.xml
		Context ctx = new InitialContext();

		// 튜브 대여소(Connection 대여소)
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/lhwPool");

		return ds.getConnection();
	}

	// DB서버와 연결 해달라고 하면 그 때 연결을 맺어주는 시스템
	public static Connection oldConnect() throws ClassNotFoundException, SQLException {
		// OracleDriver클래스 지정
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// DB서버 주소
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		return DriverManager.getConnection(url, "lhw", "lhw");
	}

	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {

		try {
			rs.close();
		} catch (Exception e) {

		}

		try {
			pstmt.close();
		} catch (Exception e) {

		}

		try {
			con.close();
		} catch (Exception e) {

		}

	}

}
