package kr.ac.dongyang.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kr.ac.dongyang.model.Todo;

public class TodoActionImpl implements TodoAction {

	// ArrayList
	// Generic 
	// MVC ��
	// CRUD Create Read Update Delete
	// interface new ���� �Ұ�
	// ������ 2���� -> �͸�ü , implements�� Ŭ���� ����
	// ���׸� <> �������� ������ Ÿ��������
	// Vector<> - ���������� �����Ͱ� ��
	// ArrayList<> - �񵿱������� �����Ͱ� ��
	
	public static List<Todo> todoList = new ArrayList<>();

	@Override
	public void addTodo(Scanner s) {
		System.out.println("��ȣ�� �Է��ϼ���");
		int num = s.nextInt();
		s.nextLine();
		System.out.println("������ �Է��ϼ���");
		String title = s.nextLine();
		System.out.println("���븦 �Է��ϼ���");
		String content = s.nextLine();
		todoList.add(new Todo(num,title,content));
	}

	@Override
	public void getTodo() {
		if(todoList.isEmpty())
			System.out.println("�Խù��� �������� �ʽ��ϴ�.");
		else {
		for (int i = 0; i < todoList.size(); i++) {
			System.out.println(todoList.get(i));
		}
		}
	}

	@Override
	public void updateTodo(Scanner s, int num) {
		//�Ű������� �Ѿ�� todo��ü�� �����´�
		Todo todo = todoList.get(num);
		
		s.nextLine();
		System.out.println("������ �Է��ϼ���");
		String title = s.nextLine();
		System.out.println("���븦 �Է��ϼ���");
		String content = s.nextLine();
		
		//��ĳ�ʷ� �Է¹��� ������ todo�� ���� ����
		todo.setTitle(title);
		todo.setContent(content);
		
		//���������� ��¥ �ٲٱ�
		todo.setUpdateTimes();
		System.out.println("���������� �����Ǿ����ϴ�.");
	}
	
	//���� ��� 
	//����� �������� > mainŬ�������� ��ȣ�� ���� �Ѱ���  
	//��� �����ϴ��� > ArrayList�� ������ �ִ� remove() �޼ҵ�� ������
	@Override
	public void deleteTodo(int deletenum) {
		int arraysize = todoList.size();
		if(arraysize != deletenum) {
			System.out.println("�ش� ��ȣ�� �Խù��� �����ϴ�.");
		}else {
		todoList.remove(deletenum);
		System.out.println("���������� �����Ǿ����ϴ�.");
		}
	}
}
