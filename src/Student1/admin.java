package Student1;

import java.util.ArrayList;
import java.util.Scanner;

public class admin {
	
	public static ArrayList<admin> arr = new ArrayList<admin>();
	private Scanner scan = new Scanner(System.in);

	private String name;
	private int id,age;
	
	public void program() {
		while(true) {
			int num;
			System.out.println("1. �л���� 2. �л��˻� 3. �л�����\n4. ���� 5. ����л���� 6. ����");
			num = scan.nextInt();
			switch (num) {
			case 1:
				reg();
				break;
			case 2:
				search();
				break;
			case 3:
				delete();
				break;
			case 4:
				mod();
				break;
			case 5:
				list();
				break;
			case 6:
				break;
			default:
				System.out.println("�߸��Է�");
				break;
			}
		}
	}
	public void list() {
		for (admin adm : arr) {
			System.out.println("���̵� : "+adm.getId());
			System.out.println("�̸� : "+adm.getName());
			System.out.println("���� : "+adm.getAge());
			System.out.println("========================");
		}
	}
	
	public void mod() {
		System.out.println("������ ���̵� �Է�");
		id = scan.nextInt();
		int i=0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getId()==id) {
				System.out.println("���̵� : "+arr.get(i).getId());
				System.out.println("�̸� : "+arr.get(i).getName());
				System.out.println("���� : "+arr.get(i).getAge());
				System.out.println("������ �̸� : ");
				name = scan.next();
				System.out.println("������ ���� : ");
				age = scan.nextInt();
				admin a = arr.get(i);
				a.setName(name);
				a.setAge(age);
				a.setId(id);
				arr.remove(i);
				arr.add(a);
				System.out.println("�����Ϸ�");
				break;
			}
		}
		if(i==arr.size()) {
			System.out.println("�ش� ���̵� ����.");
		}
	}
	
	public void delete() {
		System.out.println("������ ���̵� �Է�");
		id = scan.nextInt();
		int i=0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getId()==id) {
				System.out.println(arr.get(i).getName()+"�� ������ ���� �����մϱ�?");
				System.out.println("1. YES 2. NO");
				int num = scan.nextInt();
				if(num==1) {
					arr.remove(i);
					System.out.println("���� �մϴ�");
					break;
				}else {
					System.out.println("������ ����մϴ�.");
					break;
				}
			}
		}if(i==arr.size()) {
			System.out.println("������ �ٽ� Ȯ�����ּ���");
		}
	}
	
	public void search() {
		System.out.println("�˻��� ���̵� �Է�");
		id = scan.nextInt();
		int i=0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getId()==id) {
				System.out.println("���̵� : "+arr.get(i).getId());
				System.out.println("�̸� : "+arr.get(i).getName());
				System.out.println("���� : "+arr.get(i).getAge());
				break;
			}
		}
		if(i==arr.size()) {
			System.out.println("�ش� �л� ����");
		}
	}
	
	public void reg() {
		admin ad = new admin();
		while(true) {
			System.out.println("���̵�(�й�)�Է�");
			id = scan.nextInt();
			int i=0;
			for(;i<arr.size();i++) {
				if(arr.get(i).getId()==id) {
					System.out.println("������ ���̵�(�й�) ����");
					break;
				}
			}
			if(i==arr.size()) 
				break;
		}
		System.out.println("�̸� �Է�");
		name = scan.next();
		System.out.println("���� �Է�");
		age = scan.nextInt();
		
		ad.setId(id);
		ad.setName(name);
		ad.setAge(age);
		arr.add(ad);
		System.out.println("��ϿϷ�");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
