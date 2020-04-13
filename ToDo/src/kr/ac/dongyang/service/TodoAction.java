package kr.ac.dongyang.service;
import java.util.Scanner;

public interface TodoAction {
	// TodoAction
	// Todo 기능을 선언
	// CRUD // create // read // update // delete

	public void addTodo(Scanner s);

	public void getTodo();

	public void updateTodo(Scanner s, int num);

	public void deleteTodo(int deletenum);

}
