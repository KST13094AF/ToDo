package kr.ac.dongyang.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Todo {
	// ��¥
	// �ð�
	// ����
	// ����
	private int bno;
	private String title;
	private String content;
	private String create_at;// ���� ����
	private String updated_at;// ���� ����

	@Override
	public String toString() {
		return "TodoList ��ȣ=" + bno + ", ����=" + title + ", ����=" + content + ", ����=" + create_at
				+ ", ������Ʈ=" + updated_at;
	}

	public Todo() {
		super();
	}

	public Todo(int bno, String title, String content) {
		super();
		this.setCreateTimes();
		this.bno = bno;
		this.title = title;
		this.content = content;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreate_at() {
		return create_at;
	}

	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	//��ü�� �����ɶ� ��¥�� �־� �ִ� �޼ҵ�
	public void setCreateTimes() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormattor = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		this.create_at = now.format(dateTimeFormattor);
		this.updated_at = now.format(dateTimeFormattor);
	}
	
	public void setUpdateTimes() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormattor = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		this.updated_at = now.format(dateTimeFormattor);
	}
}
