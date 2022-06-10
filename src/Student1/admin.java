package Student1;

import java.util.ArrayList;
import java.util.Scanner;

public class admin {
	Scanner scan = new Scanner(System.in);
	ArrayList<admin> arr = new ArrayList<admin>();

	private String name;
	private int age, id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	class reg {
		public reg() {
			admin ad = new admin();
			System.out.println("등록할 학생의 이름을 입력하세요");
			name = scan.next();
			System.out.println("등록할 학생의 아이디를 입력하세요");
			id = scan.nextInt();
			System.out.println("등록할 학생의 나이를 입력하세요");
			age = scan.nextInt();
			if (name == null || id == 0 || age == 0) {
				System.out.println("등록한 정보를 확인하세요");
			} else {
				for (admin adm : arr) {
					if (adm.getName().equals(name)) {
						System.out.println("이름 중복");
					} else if (adm.getId() == id) {
						System.out.println("id 중복");
					} else {
						System.out.println(name + "학생이 등록되었습니다.");
						ad.setName(name);
						ad.setId(id);
						ad.setAge(age);
						arr.add(ad);
					}
				}

			}

		}
	}

}
