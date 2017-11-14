package com.university.dao;

import com.university.dto.UniversityDTO;

public interface UniversityDAO {
	// 카멜형 변수표기법 두번째 단어에서 바뀔때 대문자 
	public void insertUniversity(UniversityDTO universityDTO);
	public UniversityDTO selectUniversity(String hamburger);
	// delete는 필드명을 기준으로 삭제한다.
	public void deleteUniversity(String hamburger);
	// update, delete 모두 값을 바꿔서 가져오는 것이 아닌 값을 넣어주고 끝내는 형식 
	public void updateUniversity(UniversityDTO universityDTO);
}
