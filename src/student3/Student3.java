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
			System.out.println("===========    �л� ���� ���α׷�    =========== ");
			System.out.println("1. ��� 2.�˻� 3.���� 4.���� 5. ����л� ��� 6.����");
			System.out.println("���� �Է� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
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
				System.out.println("�ý����� �����մϴ�..");
				System.exit(user);
				default :
					System.out.println("�߸��� �Է��Դϴ� !");
			}
		}
	}
	
	public void insert() {
		info=new Info();
		System.out.println("����� �л��� �̸��� �Է����ּ���>>>");
		String name=scan.next();
		System.out.println("����� �л��� �й��� �Է����ּ��� >>>");
		String studentID=scan.next();
		
		
		int i=0;
		for(;i<list.size();i++) {
			if(list.get(i).getName().equals(name) || 
				list.get(i).getStudentID().equals(studentID)) {
				System.out.println("���̵� �Ǵ� �й��� �ߺ��Դϴ�!");
				break;
			}
		}
		if(i==list.size()) {
			info.setName(name);
			info.setStudentID(studentID);
			list.add(info);
			System.out.println("��ϿϷ�!");
		}
	}
	
	public void search() {
		System.out.println("�˻� �� �̸��� �Է����ּ���");
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
			System.out.println("�������� �ʴ� ȸ���Դϴ�!");
		}
	}
	
	public void delete() {
		System.out.println("������ų ȸ���� �̸��� �Է��ϼ���");
		choice=scan.next();
		int i=0;
		for(; i<list.size();i++) {
			if(list.get(i).getName().equals(choice)) {
				list.remove(i);
				System.out.println("���� �Ϸ�!");
				break;
			}
		}
		if(i==list.size()) {
			System.out.println("�������� �ʴ� ȸ���Դϴ�!");
		}
	}
	
	public void update() {
		System.out.println("���� �� ȸ���� �̸��� �Է����ּ���");
		choice=scan.next();
		int i=0;
		for( ; i<list.size();i++) {
			if(list.get(i).getName().equals(choice)) {
				System.out.println("������ �й��� �Է��ϼ��� >>>");
				String choice2=scan.next();
				list.get(i).setStudentID(choice2);
				System.out.println("���� �Ϸ�!");
				break;
			}
		}
		if(i==list.size()) {
			System.out.println("�������� �ʴ� ȸ���Դϴ�!");
		}
	}
	
	public void list() {
		System.out.println("=========��� ȸ�� ����Ʈ=========");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getStudentID());
		}
	}
}
