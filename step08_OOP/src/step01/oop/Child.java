package step01.oop;

class Parent{
	String id;
	int age;
	
	void printAll() {
		System.out.println(id);
		System.out.println(age);
	}
}
// 상속 관계 형성, Parent를 상속해서 확장하는 Child 클래스
public class Child extends Parent{
	String job;
	//재정의 하는 메소드
	void printAll() {
		super.printAll();//부모의 모든 로직을 그대로 적용받는 절대적인 코드
		System.out.println(job);
	}
	public static void main(String[] args) {
		Child c = new Child();//객체 생성 시 모든 멤버 변수들은 기본값으로 초기화
		c.id = "김민재id";//id변수도 존재
		c.job = "IT man";
		c.printAll();//printAll() 존재
	}

}
