package student3;

import java.util.Scanner;

public class Student3 {
	Scanner scan=new Scanner(System.in);
		
	int user;
	
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
		System.out.println("등록");
	}
	
	public void search() {
		System.out.println("검색");
	}
	
	public void delete() {
		System.out.println("삭제");
	}
	
	public void update() {
		System.out.println("수정");
	}
	
	public void list() {
		System.out.println("모든 출력");
	}

	
}


