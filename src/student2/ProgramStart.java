package student2;

import java.util.Scanner;

public class ProgramStart {
	
	
	
	public ProgramStart() {

	
	boolean flag = true;
	Scanner scan = new Scanner(System.in);
	Methods M = new Methods();

	
	while(flag) {
		
		System.out.println("1. �л����  2. �л��˻�  3. �л�����");
		System.out.println("4. ��������  5. ����л� ��� 6. ����");
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1 :
			M.Register();
			break;
			
		case 2 :
			M.Search();
			break;
			
		case 3 :
			M.Remove();
			break;
			
		case 4 :
			M.Edit();
			break;
			
		case 5 :
			M.ViewAll();
			break;
			
		case 6 :
			M.Exit();
			break;
				
		
		}
		
		
	}

}

}
