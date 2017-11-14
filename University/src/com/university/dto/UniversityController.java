package com.university.dto;
import java.util.Scanner;
import com.university.dao.UniversityDAOImpl;
public class UniversityController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3,d=4,e=5; 
		int choice,choice2; 
		UniversityDAOImpl universityDAO = new UniversityDAOImpl();
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("1.데이터삽입:");
		System.out.println("2.데이터검색:");
		System.out.println("3.데이터삭제:");
		System.out.println("4.데이터수정:");
		System.out.println("5.프로그램종료:");
		System.out.println("선택:");
		choice = sc.nextInt(); //숫자만입력한다.(nextInt)
		if(choice==a){
			System.out.println("데이터 삽입을 시작합니다.");
			System.out.println("1.일반,2.회사,3.대학:");
			sc.nextLine();
			choice2=sc.nextInt();
			if(choice2==2) {
			//sc.reset();
			System.out.println("이름:");
			String insertName=sc.next();
			sc.reset();
			
			System.out.println("전화번호:");
			String insertPhoneNumber=sc.next();
			sc.reset();
			
			System.out.println("학년:");
			sc.nextLine();
			String insertGrade=sc.next();
			sc.reset();
			
			System.out.println("전공:");
			sc.nextLine();
			String insertMajor=sc.next();
			sc.reset();
			
			UniversityDTO universityDTO = new UniversityDTO(
				 insertName, insertPhoneNumber, insertGrade, insertMajor);
			universityDAO.insertUniversity(universityDTO);
			}
		}
	}
}
