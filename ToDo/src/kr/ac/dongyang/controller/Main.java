package kr.ac.dongyang.controller;
import kr.ac.dongyang.service.TodoAction;
import kr.ac.dongyang.service.TodoActionImpl;
import kr.ac.dongyang.util.Utils;

public class Main extends Utils {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TodoAction todoAction = new TodoActionImpl();
		todoAction.getTodo();

		while (true) {
			System.out.println("============");
			System.out.println("1.���� ��� �߰� \n2.���� ��� ��ȸ\n3.���� ��� ����\n4.���� ��� ����\n5.���α׷� ����");
			System.out.println("============");
			int select = s.nextInt();
			switch(select) {
			case 1:	
				todoAction.addTodo(s);
				break;
			case 2:
				todoAction.getTodo();
				break;
			case 3:
				System.out.print("������ Todo�� ��ȣ�� �Է��ϼ��� : ");
				int num = s.nextInt();
				num-=1;
				todoAction.updateTodo(s, num);
				break;
			case 4:
				System.out.print("������ Todo�� ��ȣ�� �Է��ϼ��� : ");
				int deletenum = s.nextInt();
				deletenum-=1;
				todoAction.deleteTodo(deletenum);
				break;
			case 5:
				System.out.println("���α׷��� �����Ͻðڽ��ϱ�? (y/n)");
				String str = s.next();
				if(str.equals("y")) {
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				}else
					break;
			default :
			}
		}

	}
}
