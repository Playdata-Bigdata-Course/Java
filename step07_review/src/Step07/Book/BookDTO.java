package Step07.Book;

import lombok.Data;

@Data //기본생성자 + get/setXxx 자동생성 

public class BookDTO {
	private String name;
	private String isbn;
	private int year;
}
