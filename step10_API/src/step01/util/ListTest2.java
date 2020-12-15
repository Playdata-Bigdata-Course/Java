
package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;

public class ListTest2 {
	//Customer들을 ArrayList에 저장해서 반환 : db로 부터 select해서 반환
	
	//ArrayList에 저장된 Customer 객체들을  받아서 출력  : 브라우저에 출력 담당
	
	public static void main(String[] args) {
		//jdk1.7부터 new ArrayList<> 즉 <> 내부에 Type 기술하지 않는 문법 허용
		ArrayList<Customer> all = new ArrayList<>();
		
		Customer c = Customer.builder().name("조윤혜").build();
		all.add(c);
		all.add(Customer.builder().name("권희성").build());
		all.add(Customer.builder().name("김창훈").build());
		
		//jdk 1.5 부터 추가된 반복문 - forEach 반복문
		for(Customer v : all) {
			System.out.println(v.getName());
		}
		System.out.println("----------if, 문자열 비교 : equals() ----------");
		for(Customer v : all) {
			//? 윤혜씨 이름에 한해서만 출력되게 조건 비교
			if(v.getName().equals("조윤혜")) {
				System.out.println(v.getName());
			}
		}
		System.out.println("------- Customer가 보유한 Car 객체 초기화 ---");
		Car car = new Car("그랜저", 77);
		
		Customer c3 = Customer.builder().car(car).name("윤혜").build();
		
		//ArrayList에 저장
		all.add(c3); 
		
		//ArrayList에 저장된 데이터 활용
		Customer getCust = all.get(3);//제네릭 문법 적용 따라서 형변환 불필요
		Car myCar = getCust.getCar(); //차이름, 차 번호 보유하고 있는 Car
		int number = myCar.getCarNumber();
		System.out.println(number);  
		
		System.out.println(all.get(3).getCar().getCarNumber());
		
		//제네릭 적용이 안된 ArrayList가 가정한 경우 
		System.out.println( ((Customer)all.get(3)) .getCar().getCarNumber());
		
	}
}






