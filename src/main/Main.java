package main;
import java.util.Scanner;
import Student1.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("1. ����� �л��� �����̵�");
			System.out.println("2. ������ �л��� �����̵�");
			System.out.println("3. ������ �л��� �����̵�");
			System.out.println("4. ����");
			System.out.println("���ڸ� �Է��ϼ��� >>>");
			int user=scan.nextInt();
			switch(user) {
			case 1:
				Program p = new Program();
				break;
			case 2:
			case 3:
			case 4:
				default :
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}
	}
}
