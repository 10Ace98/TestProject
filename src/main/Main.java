package main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >>>");
		int user=scan.nextInt();
		while(true) {
			System.out.println("1. 김수영 학생의 관리이동");
			System.out.println("2. 정광재 학생의 관리이동");
			System.out.println("3. 유병현 학생의 관리이동");
			System.out.println("4. 종료");
			switch(user) {
			case 1:
			case 2:
			case 3:
			case 4:
				default :
				System.out.println("잘못된 입력입니다");
			}
		}
	}
}
