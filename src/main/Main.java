package main;
import java.util.Scanner;

import student3.Student3;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� >>>");
		int user=scan.nextInt();
		Student3 s3=new Student3();
		
		while(true) {
			System.out.println("1. ����� �л��� �����̵�");
			System.out.println("2. ������ �л��� �����̵�");
			System.out.println("3. ������ �л��� �����̵�");
			System.out.println("4. ����");
			switch(user) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				s3.start();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�");
				System.exit(user);
				default :
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}
	}
}
