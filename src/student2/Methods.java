package student2;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

	ArrayList<StudentInfo> list = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	
	String name;
	String studentID;
	int age;

	
	public void Register() {
		
		StudentInfo inf = new StudentInfo();
		
		System.out.print("학생 이름 입력 : ");
		name = scan.next();
//		nameCheck();
		
		
		int i = 0;
		
		for( ; i < list.size(); i ++) {
			
			if(list.get(i).getName().equals(name) ) {
				System.out.println("이미 등록 되어있는 이름입니다");
				break;
			}
			
		}
		
		if(i == list.size()) {
			
			inf.setName(name);
			System.out.print("학번 입력 : ");
			studentID = scan.next();
//			StuIDCheck();
			
		}
		
		
		int j = 0;
		
		for ( ; j < list.size(); j++) {
			
			if(list.get(j).getStudentID().equals(studentID)) {
				System.out.println("이미 등록 되어있는 학번입니다");
				break;
			}
		}
		
		if(j == list.size()) {
			
			inf.setStudentID(studentID);
			System.out.println("나이 입력 : ");
			age = scan.nextInt();
			inf.setAge(age);
			
			list.add(inf);
			System.out.println("등록이 완료되었습니다.");
			
		}
		
	}
	
	
//	public void dupliCheck(String s) {	
//		int i = 0;
//		
//		for( ; i < list.size(); i++) {
//			
//			if(list.get(i))
//			
//		}
//	}
	
//	public void StuIDCheck() {	}
	
	
	public void Search() {
		System.out.print("찾는 학생 이름 입력 : ");
		name = scan.next();
		
		int i = 0;
		
		for( ; i < list.size(); i++) {
			
			if(list.get(i).getName().equals(name)) {
				System.out.println("\n-------------------");
				System.out.println("학생 이름 : " + list.get(i).getName());
				System.out.println("학생 학번 : " + list.get(i).getStudentID());
				System.out.println("학생 나이 : " + list.get(i).getAge());
				System.out.println("-------------------\n");
				break;
				
			}
			
		}
		
		if(i == list.size()) {
			System.err.println("검색하신 학생은 존재하지 않습니다.");
		}
		
	}
	
	
	
	
	public void Remove() {
		System.out.println("목록에서 삭제할 학생 이름 입력 : ");
		name = scan.next();
		
		int i = 0;
		
		for( ; i<list.size(); i++) {
			
			if(list.get(i).getName().equals(name)) {
				
				list.remove(i);
				System.out.println("\n-------------------");
				System.err.println(name + " 학생이 삭제되었습니다");
				System.out.println("-------------------\n");
				
			}
			
		}
		
		if(i == list.size()) {
			System.err.println("해당 학생은 존재하지 않습니다.");
		}
		
	}
	
	
	
	
	public void Edit() {
		System.out.print("수정할 학생 이름 입력 : ");
		name = scan.next();
		
		int i = 0;
		
		for( ; i < list.size(); i++) {
			
			if (list.get(i).getName().equals(name)) {
				
				System.out.println(name + "학생의 정보");
				System.out.println("학번 : " + list.get(i).getStudentID());
				System.out.println("나이 : " + list.get(i).getAge());
				
				System.out.print("수정할 학번 입력 : ");
				studentID = scan.next();
				
				int j = 0;
				
				for( ; j < list.size(); j++) {
					
					if (list.get(j).getStudentID().equals(studentID)) {
						
						System.err.println("이미 등록 되어있는 학번입니다");
						break;
					}
					
				}
				
				
				if (j == list.size()) {
					
					list.get(i).setStudentID(studentID);
					System.out.print("수정할 나이 입력 : ");
					age = scan.nextInt();
					list.get(i).setAge(age);
					
				}
				break;
			}
			
		}
		if(i == list.size()) {
			System.err.println("입력한 학생은 존재하지 않습니다");
		}
		
	}
	
	
	
	
	public void ViewAll() {
		
		if(list.isEmpty()) {
			System.err.println("등록되어있는 학생이 없습니다!");
		}
		
		for(int i = 0; i < list.size() ; i++) {
			
			System.out.println();
			System.out.println(i+1 + "번째 학생 이름 : " + list.get(i).getName());
			System.out.println(i+1 + "번째 학생 학번 : " + list.get(i).getStudentID());
			System.out.println(i+1 + "번째 학생 나이 : " + list.get(i).getAge());
			System.out.println("-------------------");
			
		}
		
	}
	
	public void Exit() {
		System.out.println("현 프로그램에서 나갑니다");
		ProgramStart.flag = false;
	}
	
}
