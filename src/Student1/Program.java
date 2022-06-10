package Student1;

import java.util.ArrayList;
import java.util.Scanner;

import Student1.admin.reg;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 학생등록 2. 학생검색 3. 학생삭제\n4. 수정 5. 모든학생출력 6. 종료");

			switch (scan.nextInt()) {
			case 1:
				System.out.println("학생등록");
				break;
			case 2:
				System.out.println("학생검색");
				break;
			case 3:
				System.out.println("학생삭제");
				break;
			case 4:
				System.out.println("수정");
				break;
			case 5:
				System.out.println("모든 학생을 출력합니다.");
				break;
			case 6:
				System.out.println("시스템 종료");
				break;
			default:
				System.out.println("잘못입력");
				break;
			}
		}
	}
}
