package Student1;

import java.util.ArrayList;
import java.util.Scanner;

public class admin {
	
	public static ArrayList<admin> arr = new ArrayList<admin>();
	private Scanner scan = new Scanner(System.in);

	private String name;
	private int id,age;
	
	public void program() {
		while(true) {
			int num;
			System.out.println("1. 학생등록 2. 학생검색 3. 학생삭제\n4. 수정 5. 모든학생출력 6. 종료");
			num = scan.nextInt();
			switch (num) {
			case 1:
				reg();
				break;
			case 2:
				search();
				break;
			case 3:
				delete();
				break;
			case 4:
				mod();
				break;
			case 5:
				list();
				break;
			case 6:
				break;
			default:
				System.out.println("잘못입력");
				break;
			}
		}
	}
	public void list() {
		for (admin adm : arr) {
			System.out.println("아이디 : "+adm.getId());
			System.out.println("이름 : "+adm.getName());
			System.out.println("나이 : "+adm.getAge());
			System.out.println("========================");
		}
	}
	
	public void mod() {
		System.out.println("수정할 아이디 입력");
		id = scan.nextInt();
		int i=0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getId()==id) {
				System.out.println("아이디 : "+arr.get(i).getId());
				System.out.println("이름 : "+arr.get(i).getName());
				System.out.println("나이 : "+arr.get(i).getAge());
				System.out.println("수정할 이름 : ");
				name = scan.next();
				System.out.println("수정할 나이 : ");
				age = scan.nextInt();
				admin a = arr.get(i);
				a.setName(name);
				a.setAge(age);
				a.setId(id);
				arr.remove(i);
				arr.add(a);
				System.out.println("수정완료");
				break;
			}
		}
		if(i==arr.size()) {
			System.out.println("해당 아이디 없음.");
		}
	}
	
	public void delete() {
		System.out.println("삭제할 아이디 입력");
		id = scan.nextInt();
		int i=0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getId()==id) {
				System.out.println(arr.get(i).getName()+"의 정보를 정말 삭제합니까?");
				System.out.println("1. YES 2. NO");
				int num = scan.nextInt();
				if(num==1) {
					arr.remove(i);
					System.out.println("삭제 합니다");
					break;
				}else {
					System.out.println("삭제를 취소합니다.");
					break;
				}
			}
		}if(i==arr.size()) {
			System.out.println("정보를 다시 확인해주세요");
		}
	}
	
	public void search() {
		System.out.println("검색할 아이디 입력");
		id = scan.nextInt();
		int i=0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getId()==id) {
				System.out.println("아이디 : "+arr.get(i).getId());
				System.out.println("이름 : "+arr.get(i).getName());
				System.out.println("나이 : "+arr.get(i).getAge());
				break;
			}
		}
		if(i==arr.size()) {
			System.out.println("해당 학생 없음");
		}
	}
	
	public void reg() {
		admin ad = new admin();
		while(true) {
			System.out.println("아이디(학번)입력");
			id = scan.nextInt();
			int i=0;
			for(;i<arr.size();i++) {
				if(arr.get(i).getId()==id) {
					System.out.println("동일한 아이디(학번) 존재");
					break;
				}
			}
			if(i==arr.size()) 
				break;
		}
		System.out.println("이름 입력");
		name = scan.next();
		System.out.println("나이 입력");
		age = scan.nextInt();
		
		ad.setId(id);
		ad.setName(name);
		ad.setAge(age);
		arr.add(ad);
		System.out.println("등록완료");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
