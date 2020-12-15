/* 도서 정보를 표현할 수 있는 클래스 - 데이터 표현을 위한 전용 클래스
 * Data Transtfer Object[DTO] pattern
 * Value Object pattern[VO]
 */
package step02.application;

public class Book {
	String isbn;	//멤버 변수들
	String bookName;
	//외부에서 호출 불가 즉 접근 제한, 동일한 Book 클래스에서만 호출 가능ㅇ한 변수
	private int birthDay;	//2020년 이후의 데이터에 한해서만 유효
	
	Book(){}		//  기본 생성자
	Book(String i, String b, int d){	//객체 생성 및 멤버 변수들값을 원하는 데이터로 초기화
		isbn = i;
		bookName = b;
		setBirthDay(d);	
	}
	
	public String getIsbn() {
		return isbn;
	}
	//멤버 변수명과 로컬 변수명이 동일한 경우 멤버 변수엔 this. 필수
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBirthDay() {
		return birthDay;
	}
	/* 로직
	 * birthDay 멤버 변수는 반드시 2020 이후 데이터만 저장
	 * 그 이하의 데이터는 대입 불가여야 함
	 * 
	 * 만약(if)에 입력하려는 데이터값이 20보다 같거나 크면(>= 2020) 대입(=)
	 * 아니라면 대입 불가
	 */
	public void setBirthDay(int birthDay) {
		if(birthDay >= 2020) {
			//조건식이 true인 경우 실행되는 블록
			this.birthDay = birthDay;
		}else {
			System.out.println("무효인 출판년도");
		}
	}
	
	//데이터 사용의 편의성을 위해서 모든 멤버 변수값을 한번에 변환하는 메소드 추가 구현
	//자바의 반환 타입은 반드시 하나만 가능
	//문자열 조합, +(결합연산자)
	public String toString(){
		return isbn + " " + bookName + " " + birthDay;
	}
}
