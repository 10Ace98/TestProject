package Student1;

import java.util.ArrayList;
import java.util.Scanner;

import Student1.admin.reg;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. �л���� 2. �л��˻� 3. �л�����\n4. ���� 5. ����л���� 6. ����");

			switch (scan.nextInt()) {
			case 1:
				System.out.println("�л����");
				break;
			case 2:
				System.out.println("�л��˻�");
				break;
			case 3:
				System.out.println("�л�����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("��� �л��� ����մϴ�.");
				break;
			case 6:
				System.out.println("�ý��� ����");
				break;
			default:
				System.out.println("�߸��Է�");
				break;
			}
		}
	}
}
