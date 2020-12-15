
package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;

public class ListTest2 {
	//Customer���� ArrayList�� �����ؼ� ��ȯ : db�� ���� select�ؼ� ��ȯ
	
	//ArrayList�� ����� Customer ��ü����  �޾Ƽ� ���  : �������� ��� ���
	
	public static void main(String[] args) {
		//jdk1.7���� new ArrayList<> �� <> ���ο� Type ������� �ʴ� ���� ���
		ArrayList<Customer> all = new ArrayList<>();
		
		Customer c = Customer.builder().name("������").build();
		all.add(c);
		all.add(Customer.builder().name("����").build());
		all.add(Customer.builder().name("��â��").build());
		
		//jdk 1.5 ���� �߰��� �ݺ��� - forEach �ݺ���
		for(Customer v : all) {
			System.out.println(v.getName());
		}
		System.out.println("----------if, ���ڿ� �� : equals() ----------");
		for(Customer v : all) {
			//? ������ �̸��� ���ؼ��� ��µǰ� ���� ��
			if(v.getName().equals("������")) {
				System.out.println(v.getName());
			}
		}
		System.out.println("------- Customer�� ������ Car ��ü �ʱ�ȭ ---");
		Car car = new Car("�׷���", 77);
		
		Customer c3 = Customer.builder().car(car).name("����").build();
		
		//ArrayList�� ����
		all.add(c3); 
		
		//ArrayList�� ����� ������ Ȱ��
		Customer getCust = all.get(3);//���׸� ���� ���� ���� ����ȯ ���ʿ�
		Car myCar = getCust.getCar(); //���̸�, �� ��ȣ �����ϰ� �ִ� Car
		int number = myCar.getCarNumber();
		System.out.println(number);  
		
		System.out.println(all.get(3).getCar().getCarNumber());
		
		//���׸� ������ �ȵ� ArrayList�� ������ ��� 
		System.out.println( ((Customer)all.get(3)) .getCar().getCarNumber());
		
	}
}






