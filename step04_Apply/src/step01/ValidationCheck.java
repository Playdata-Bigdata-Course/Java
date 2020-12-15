/* 학습내용
 * 	1. 로그인 로직 구현
 * 	2. 필요 데이터
 * 		-client가 입력하는 id/pw
 * 	3. 기능
 * 		-id/pw값으로 검증을 해서 유효한 경우?("유효한 id")
 * 		무효한 경우("무효한id")
 * 		-id : playdata
 *  4. 필요코드
 *  	1. String 비교 로직
 *  		- 이미 서버(데이터베이스 포함) 존재한다 가정
 *  		- java로 문자열 비교시 메소드
 *  			public class String{
 *  				public boolean equals(String v){
 * 						이 문자열 객체와 비교 데이터를 받아서 비교
 * 						true or false 반환 
 *				 }
 *  		}
 *  		String id - "playdata";
 *  		boolean r = id.equals("client가 입력한 데이터");
 *  
 * 5. 참고
 * 	1. 값 비교  == : 동등비교 연산자
 * 		기본 타입
 * 			순수 값 비교
 * 			int i = 10;
 * 			int i2 = 20;
 * 			i == i2 false
 * 		참조 타입
 * 			객체의 주소값을 비교
 * 			객체들의 내용값 비교시에는 equals()로 비교
 */

package step01;

import model.domain.Customer;

public class ValidationCheck {
	// 검증로직
	public static String idCheck(String id) {
		String userId = "playdata";
		if (userId.equals(id)) {
			return "유효한 id입니다";
		} else {
			return "무효한 id입니다";
		}
	}

	/*
	 * //? Customer 고객 정보가 있다 가정 이름이 "엔코아" 검색 이름이 엔코아 라면 age와 grade가 결합해서 반환 엔코아가
	 * 아니라면 "넌 자격 없어" 라고 반환
	 * 
	 */
	public static String nameCheck(String searchName) {
		Customer user = new Customer("엔코아", 10, "vvip");
		if (user.getName().equals(searchName)) {
			return user.getAge() + "  " + user.getGrade();
		} else {
			return "넌 자격 없어";
		}
	}

	// ?이름으로 고객 정보 검색 로직의 test 코드 구현하기
	public static void main(String[] args) {
		String message = idCheck("p");
		System.out.println(message);// 무효한 id

		message = idCheck("playdata");
		System.out.println(message);// 유효한 id

		System.out.println(nameCheck("엔코아"));
		System.out.println(nameCheck("엔"));
	}
}
