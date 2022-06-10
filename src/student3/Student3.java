package student3;

import java.util.ArrayList;
import java.util.Scanner;

class Info {
	private String name;
	private String studentID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
}


public class Student3 {
	Scanner scan=new Scanner(System.in);
		
	int user;
	String choice;
	
	ArrayList<Info> list=new ArrayList<Info>();
	Info info;
	
	public void start() {
		while(true) {
			System.out.println("===========    학생 관리 프로그램    =========== ");
			System.out.println("1. 등록 2.검색 3.삭제 4.수정 5. 모든학생 출력 6.종료");
			System.out.println("숫자 입력 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			user=scan.nextInt();
			switch(user) {
			case 1:
				insert();
				break;
			case 2:
				search();
				break;
			case 3:
				delete();
				break;
			case 4:
				update();
				break;
			case 5:
				list();
				break;
			case 6:
				System.out.println("시스템을 종료합니다..");
				System.exit(user);
				default :
					System.out.println("잘못된 입력입니다 !");
			}
		}
	}
	
	public void insert() {
		info=new Info();
		System.out.println("등록할 학생의 이름을 입력해주세요>>>");
		String name=scan.next();
		System.out.println("등록할 학생의 학번을 입력해주세요 >>>");
		String studentID=scan.next();
		
		
		int i=0;
		for(;i<list.size();i++) {
			if(list.get(i).getName().equals(name) || 
				list.get(i).getStudentID().equals(studentID)) {
				System.out.println("아이디 또는 학번이 중복입니다!");
				break;
			}
		}
		if(i==list.size()) {
			info.setName(name);
			info.setStudentID(studentID);
			list.add(info);
			System.out.println("등록완료!");
		}
	}
	
	public void search() {
		System.out.println("검색 할 이름을 입력해주세요");
		choice =scan.next();
		int i=0;
		for(; i<list.size();i++) {
			if(list.get(i).getName().equals(choice)) {
				System.out.println(list.get(i).getName());
				System.out.println(list.get(i).getStudentID());
				break;
			}
		}
		if(i==list.size()) {
			System.out.println("존재하지 않는 회원입니다!");
		}
	}
	
	public void delete() {
		System.out.println("삭제시킬 회원의 이름을 입력하세요");
		choice=scan.next();
		int i=0;
		for(; i<list.size();i++) {
			if(list.get(i).getName().equals(choice)) {
				list.remove(i);
				System.out.println("삭제 완료!");
				break;
			}
		}
		if(i==list.size()) {
			System.out.println("존재하지 않는 회원입니다!");
		}
	}
	
	public void update() {
		System.out.println("수정 할 회원의 이름을 입력해주세요");
		choice=scan.next();
		int i=0;
		for( ; i<list.size();i++) {
			if(list.get(i).getName().equals(choice)) {
				System.out.println("변경할 학번을 입력하세요 >>>");
				String choice2=scan.next();
				list.get(i).setStudentID(choice2);
				System.out.println("수정 완료!");
				break;
			}
		}
		if(i==list.size()) {
			System.out.println("존재하지 않는 회원입니다!");
		}
	}
	
	public void list() {
		System.out.println("=========모든 회원 리스트=========");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getStudentID());
		}
	}
}
