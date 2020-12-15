package Step07.Book;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class check {
	
	public static void checkbook(String a) {
		BookDTO book = new BookDTO();
		book.setName("java book");
		book.setIsbn("001");
		book.setYear(2020);
		if(book.getName().equals(a)) {
			System.out.println(a+"은(는) 대출 가능합니다.");
			log.info(a+"을(를) 조회했습니다.");
		} else {
			System.out.println(a+"은(는) 대출 불가능합니다.");
			log.info(a+"을(를) 조회했습니다.");
		}
	}
}
