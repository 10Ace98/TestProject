package main;
import java.util.Scanner;

import student2.*;
import student3.Student3;

import Student1.*;
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
			System.out.println("���ڸ� �Է��ϼ��� >>>");
			user = scan.nextInt();
			
			switch(user) {
			
			case 1:	Program p = new Program();
				break;
			case 2: ProgramStart st = new ProgramStart();
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
