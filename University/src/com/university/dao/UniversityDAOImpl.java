package com.university.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.db.connection.DBconnection;
import com.db.dbcp.Dbcp;
import com.university.dto.UniversityDTO;

public class UniversityDAOImpl implements UniversityDAO{
	private Connection conn = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null; 
	private DBconnection dbc;
	private UniversityDTO universityDTO = null;
	private String sql = "";
	private Dbcp dbcp; 
	
	//UniversiyDAO에서 정의한 인터페이스를 구현하기위해 implements를 해준다. 
	@Override
	public void insertUniversity(UniversityDTO universityDTO) {
		// TODO Auto-generated method stub
		sql ="insert into University values(?,?,?,?)";
	
		try {
			conn=dbc.getInstance();
			pstm=conn.prepareStatement(sql);	
			// cmd창에서 값을 가져온것을 파라미터에 저장을 해준다. 
			// console에 값을 넣어준걸 가져오는 형식이 get이다. 
			pstm.setString(1, universityDTO.getName());
			pstm.setString(2, universityDTO.getPhonenumber());
			pstm.setString(3, universityDTO.getMajor());
			pstm.setString(4, universityDTO.getGrade());
			// 실제로 쿼리문의 값을 반영한다. insert, delete, update 반영한다.라는뜻 
			pstm.executeUpdate();
			System.out.println("insertUniversity()성공");
			// 메모리해제 
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			// 닫아주기 
			dbcp.pstmClose(pstm);
			dbcp.connClose(conn);
		}
	}
	
	@Override
	public UniversityDTO selectUniversity(String hamburger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUniversity(String hamburger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUniversity(UniversityDTO universityDTO) {
		// TODO Auto-generated method stub
		
	}
	
}
