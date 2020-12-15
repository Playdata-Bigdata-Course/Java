package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;
/* 객체 생성이란 멤버 변수들이 사용 가능하게 메모리에 생성되는 것을 의미
 * 
 */
class A{
	int no=10;
}
class B{
	A a = new A()  ;
	Car car = new Car("소나타", 77);
}
class C{
	B b = new B()  ;
	Customer c = Customer.builder().car(new Car("그랜저", 77)).name("윤혜").build();
}
//new C()


public class Test {
	public static void main(String[] args) {
		ArrayList<C> all = new ArrayList<>();
		//String 타입도 객체
		all.add(new C()); //new C()로 인해서만 생성되는 객체수는?
	}

}





