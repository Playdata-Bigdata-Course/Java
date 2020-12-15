package model;
///model package를 제외하 모든 클래스들 사용시 반드시 import 문장 필수

import model.domain.Book;

public class Data {	
	public static Book getBook() {
		return new Book("001", "java book ", 2020);
	}
	//???? - 두개 이상의 책 정보를 반환하는 메소드 구현
	public static Book [] getBooks(){
		Book [] all = {new Book("001", "java book ", 2020),
					   new Book("002", "sql book", 2021),
					   new Book("003", "python book", 2030)};
		return all;
	}		
}
//???? - 이 메소드의 실행 결과는 콘솔창에 출력
