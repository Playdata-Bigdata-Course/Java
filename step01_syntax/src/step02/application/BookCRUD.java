package step02.application;

public class BookCRUD {
	Book book;	//모든 메소드에서 공유하는 자원
	//저장
	/* 호출자(사용자) 관점
	 *  - 저장 메소드 호출시마다 새로운 데이터로 책 저장
	 *		: save(String isbn, String name, int birthDay)
	 *	- 메소드 body에 이미 정해진 데이터로 Book를 만들 것인지
	 *		" save(){ .. } 
	 */
	void save(String isbn, String name, int birthDay) {
		book = new Book(isbn, name, birthDay);
	}
	//검색
	void search() {
		//book.toString()
		/* book 변수가 관리하는 주소값의 객체가 보유한 toString
		 * 
		 * 
		 */
		System.out.println(book.toString());
	}
	//수정
	void update(String newName) {
		book.setBookName(newName);
	}
	//삭제
	void delete() {
		book = null;	//주소값을 초기화 하는 키워드, 즉 참조 타입 변수들 기본값
	}
	
	public static void main(String[] args) {
		BookCRUD crud = new BookCRUD();
		//? CRUD 나름 순서대로 호출해서 결과값 확인하기
		//데이터 생성 ->확인(검색)->수정->확인(검색)->삭제->확인(검색)
		crud.save("0001", "하나", 2021);
		crud.search();
		crud.update("둘");
		crud.search();
		crud.search();
		crud.save("0002", "셋", 2020);
		crud.search();
	}

}
