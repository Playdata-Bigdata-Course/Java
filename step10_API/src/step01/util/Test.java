package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;
/* ��ü �����̶� ��� �������� ��� �����ϰ� �޸𸮿� �����Ǵ� ���� �ǹ�
 * 
 */
class A{
	int no=10;
}
class B{
	A a = new A()  ;
	Car car = new Car("�ҳ�Ÿ", 77);
}
class C{
	B b = new B()  ;
	Customer c = Customer.builder().car(new Car("�׷���", 77)).name("����").build();
}
//new C()


public class Test {
	public static void main(String[] args) {
		ArrayList<C> all = new ArrayList<>();
		//String Ÿ�Ե� ��ü
		all.add(new C()); //new C()�� ���ؼ��� �����Ǵ� ��ü����?
	}

}





