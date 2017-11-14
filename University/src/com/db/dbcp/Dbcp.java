package com.db.dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dbcp {
	public static void connClose(Connection conn) {
	      if(conn!=null) {
	         try {
	            conn.close();
	         } catch (Exception e) {
	            System.out.println("connClose 오류="+e);
	         }
	      }
	   }
	   
	   public static void rsClose(ResultSet rs) {
	      if(rs!=null) {
	         try {
	            rs.close();
	         } catch(Exception e) {
	            System.out.println("rsClose 오류="+e);
	         } 
	      }
	   }
	   
	   public static void pstmClose(PreparedStatement pstm) {
	      if(pstm!=null) {
	         try {
	            pstm.close();
	         } catch (Exception e) {
	            System.out.println("pstmClose 오류="+e);
	         }
	      }
	   }
}

