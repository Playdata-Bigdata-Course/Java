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

@Builder
public class Customer {
	// 멤버 변수
	private String name; // 객체 생성시에 객체의 실제 메모리 내부에 생성 및 구성
	private int age;
	private String grade; // vvip, vip, silver
//
////	public Customer() {}
////	public Customer(String name, int age, String grade) {
////		this.name = name;
////		this.age = age;
////		this.grade = grade;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

//	p.s.v.m(){
//		Customer c = new Customer();
//		c.name = "김혜경";
//		c.age = 10;
//		Customer c2 = new Customer("김혜경", 10, "vvip");
//	}
//	
//

	// age를 수정 할 수 있는 기능
	// newAge는 setAge() 호출시 생성되고 실행 종료시에 자동 소멸
	// local, stack 변수, temporary변수, automatic 변수
//	void setAge(int newAge) { // 호출시 자동 생성
//		age = newAge;
//	}// newAge 종료시 자동 삭제
//
//	// age 변수값 반환하는 메소드 기능
//	int getAge() {
//		return age;
//	}

	// grade를 수정 할 수 있는 기능
}
