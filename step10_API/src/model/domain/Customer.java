/* 학습내용
 * 1. 재사용성을 고려한 설계
 * 2. 객체 생성 관점
 * 	1. 모든 멤버 데이터 초기화 할 수도 있음
 * 	2. name만 초기화 할 수도 있음
 * 	3. age값만 "		"
 *	..발생되는 문제	
 *		생성자의 종류가 무지하게 많아지는 현상
 * 3. 해결책
 * 	- 필요한 시점(호출 시점)에 생성자를 동적으로 생성하는 관점에서 해석
 * 4. 개발방식
 * 	- Builder pattern
 * 
 */ 
 package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Customer {
	
	private String name; 
	private int age;
	private String grade;
	private Car car;
	


}