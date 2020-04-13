package kr.ac.dongyang.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kr.ac.dongyang.model.Todo;

public class TodoActionImpl implements TodoAction {

	// ArrayList
	// Generic 
	// MVC 모델
	// CRUD Create Read Update Delete
	// interface new 생성 불가
	// 생성법 2가지 -> 익명객체 , implements한 클래스 생성
	// 제네릭 <> 형지정자 데이터 타입저장지
	// Vector<> - 동기적으로 데이터가 들어감
	// ArrayList<> - 비동기적으로 데이터가 들어감
	
	public static List<Todo> todoList = new ArrayList<>();

	@Override
	public void addTodo(Scanner s) {
		System.out.println("번호를 입력하세요");
		int num = s.nextInt();
		s.nextLine();
		System.out.println("제목을 입력하세요");
		String title = s.nextLine();
		System.out.println("내용를 입력하세요");
		String content = s.nextLine();
		todoList.add(new Todo(num,title,content));
	}

	@Override
	public void getTodo() {
		if(todoList.isEmpty())
			System.out.println("게시물이 존재하지 않습니다.");
		else {
		for (int i = 0; i < todoList.size(); i++) {
			System.out.println(todoList.get(i));
		}
		}
	}

	@Override
	public void updateTodo(Scanner s, int num) {
		//매개변수로 넘어온 todo객체를 가져온다
		Todo todo = todoList.get(num);
		
		s.nextLine();
		System.out.println("제목을 입력하세요");
		String title = s.nextLine();
		System.out.println("내용를 입력하세요");
		String content = s.nextLine();
		
		//스캐너로 입력받은 내용을 todo에 저장 수정
		todo.setTitle(title);
		todo.setContent(content);
		
		//수정했을때 날짜 바꾸기
		todo.setUpdateTimes();
		System.out.println("정상적으로 수정되었습니다.");
	}
	
	//삭제 기능 
	//어떤것을 삭제할지 > main클래스에서 번호를 같이 넘겨줌  
	//어떻게 삭제하는지 > ArrayList가 가지고 있는 remove() 메소드로 삭제함
	@Override
	public void deleteTodo(int deletenum) {
		int arraysize = todoList.size();
		if(arraysize != deletenum) {
			System.out.println("해당 번호의 게시물이 없습니다.");
		}else {
		todoList.remove(deletenum);
		System.out.println("정상적으로 삭제되었습니다.");
		}
	}
}
