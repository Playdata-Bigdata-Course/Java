/* 학습 내용
 * 1. 메소드 구현, 호출 문법 익히기
 * 2. 다중 클래스들 간에 메소드 호출 문법 익숙해지기 
 * 
 */
package step01.basic;

public class Customer {
	// 멤버 변수
	private String name; // 객체 생성시에 객체의 실제 메모리 내부에 생성 및 구성
	private int age;
	private String grade; // vvip, vip, silver

	public Customer() {}
	public Customer(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
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
