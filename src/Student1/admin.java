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
			System.out.println("����� �л��� �̸��� �Է��ϼ���");
			name = scan.next();
			System.out.println("����� �л��� ���̵� �Է��ϼ���");
			id = scan.nextInt();
			System.out.println("����� �л��� ���̸� �Է��ϼ���");
			age = scan.nextInt();
			if (name == null || id == 0 || age == 0) {
				System.out.println("����� ������ Ȯ���ϼ���");
			} else {
				for (admin adm : arr) {
					if (adm.getName().equals(name)) {
						System.out.println("�̸� �ߺ�");
					} else if (adm.getId() == id) {
						System.out.println("id �ߺ�");
					} else {
						System.out.println(name + "�л��� ��ϵǾ����ϴ�.");
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
