package kr.ac.dongyang.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Todo {
	// 날짜
	// 시간
	// 내용
	// 제목
	private int bno;
	private String title;
	private String content;
	private String create_at;// 생성 날자
	private String updated_at;// 수정 날자

	@Override
	public String toString() {
		return "TodoList 번호=" + bno + ", 제목=" + title + ", 내용=" + content + ", 수정=" + create_at
				+ ", 업데이트=" + updated_at;
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
	
	//객체가 생성될때 날짜를 넣어 주는 메소드
	public void setCreateTimes() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormattor = DateTimeFormatter.ofPattern("yyyy년 M월 d시 a h시 m분");
		this.create_at = now.format(dateTimeFormattor);
		this.updated_at = now.format(dateTimeFormattor);
	}
	
	public void setUpdateTimes() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormattor = DateTimeFormatter.ofPattern("yyyy년 M월 d시 a h시 m분");
		this.updated_at = now.format(dateTimeFormattor);
	}
}
