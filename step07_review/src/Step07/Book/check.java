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
			System.out.println(a+"��(��) ���� �����մϴ�.");
			log.info(a+"��(��) ��ȸ�߽��ϴ�.");
		} else {
			System.out.println(a+"��(��) ���� �Ұ����մϴ�.");
			log.info(a+"��(��) ��ȸ�߽��ϴ�.");
		}
	}
}
