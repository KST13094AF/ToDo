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
			System.out.println("1.할일 목록 추가 \n2.할일 목록 조회\n3.할일 목록 수정\n4.할일 목록 삭제\n5.프로그램 종료");
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
				System.out.print("수정할 Todo의 번호를 입력하세요 : ");
				int num = s.nextInt();
				num-=1;
				todoAction.updateTodo(s, num);
				break;
			case 4:
				System.out.print("삭제할 Todo의 번호를 입력하세요 : ");
				int deletenum = s.nextInt();
				deletenum-=1;
				todoAction.deleteTodo(deletenum);
				break;
			case 5:
				System.out.println("프로그램을 종료하시겠습니까? (y/n)");
				String str = s.next();
				if(str.equals("y")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}else
					break;
			default :
			}
		}

	}
}
