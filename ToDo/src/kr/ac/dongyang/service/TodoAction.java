package kr.ac.dongyang.service;
import java.util.Scanner;

public interface TodoAction {
	// TodoAction
	// Todo ����� ����
	// CRUD // create // read // update // delete

	public void addTodo(Scanner s);

	public void getTodo();

	public void updateTodo(Scanner s, int num);

	public void deleteTodo(int deletenum);

}
