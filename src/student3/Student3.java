package student3;

import java.util.Scanner;

public class Student3 {
	Scanner scan=new Scanner(System.in);
		
	int user;
	
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
		System.out.println("���");
	}
	
	public void search() {
		System.out.println("�˻�");
	}
	
	public void delete() {
		System.out.println("����");
	}
	
	public void update() {
		System.out.println("����");
	}
	
	public void list() {
		System.out.println("��� ���");
	}

	
}


