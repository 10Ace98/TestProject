package main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� >>>");
		int user=scan.nextInt();
		while(true) {
			System.out.println("1. ����� �л��� �����̵�");
			System.out.println("2. ������ �л��� �����̵�");
			System.out.println("3. ������ �л��� �����̵�");
			System.out.println("4. ����");
			switch(user) {
			case 1:
			case 2:
			case 3:
			case 4:
				default :
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}
	}
}
