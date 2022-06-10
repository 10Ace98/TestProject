package main;
import java.util.Scanner;

import student2.*;
import student3.Student3;

import Student1.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Student3 s3=new Student3();
		
		while(true) {
			System.out.println("1. 김수영 학생의 관리이동");
			System.out.println("2. 정광재 학생의 관리이동");
			System.out.println("3. 유병현 학생의 관리이동");
			System.out.println("4. 종료");
			System.out.println("숫자를 입력하세요 >>>");
			int user = scan.nextInt();
			
			switch(user) {
			
			case 1:	admin a = new admin();
			a.program();
				break;
			case 2: ProgramStart st = new ProgramStart();
				break;
			case 3:
				s3.start();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				System.exit(user);
				
				default :
				System.out.println("잘못된 입력입니다");
			}
		}
	}
}