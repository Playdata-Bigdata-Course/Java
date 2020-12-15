//sql을 실제 사용해서 DB와 직접 연동하는 클래스로 변환
package model;

import java.util.ArrayList;
import model.db.VirtualDatabase;
import model.domain.Customer;

public class CustomerModel {
	 ArrayList<Customer> datas = VirtualDatabase.getCustomers();
	//모든 고객 검색 - 고객 정보 반환
	public ArrayList<Customer> getCustomers(){
		return VirtualDatabase.getCustomers();
	}
	//고객 검색 - id로 해당 고객 검색
	public Customer getCustomer(String id) {
		for(Customer c : datas) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	//고객 저장 - 3개의 데이터가 한명의 고객 정보
	/*	parameter는 Customer 타입?
	 *	String id, int age, String grade 데이터? 	
	 *  존재할 경우 - 예외발생(중복된 id라는 메세지로 생성)
	 *  미존재할 경우 - 저장 */
	public void insert(Customer c) throws Exception{
		//id중복 여부 검증 후 미존재 할 경우에만 add
		if(getCustomer(c.getId()) == null) {
			datas.add(c);
		}else {
			throw new Exception("중복된 id입니다");
		}
	}
	//고객 정보 수정
	/* 정상 수정 : true/ 비정상 수정 : false
	 * id값으로 등급수정 로직
	 * 발생 경우의 수
	 * 	1. id가 존재한다 - 수정  true 반화
	 * 	2. id가 미존재 - 수정 불가 false 반환
	 */
	public boolean update(String id, String newGrade) {
		boolean result = false;
		Customer c = getCustomer(id);
		if (c != null) { //null이 아님 즉 고객이 있음
			c.setGrade(newGrade);
			result = true;
		}
		return result;
	}
	//고객 삭제 - 삭제 성공 시 1 반환, 삭제 실패 시 0 반환
	/*ArrayList에 저장된 Customer 즉 ArrayList의 데이터 삭제 - remove(int index), remove(Object o)
	 * 
	 */
	public int delete(String id) {
		int result = 0;
		Customer c = getCustomer(id);
		if (c != null) {//null이 아니다 = Customer 존재
			if(datas.remove(c) == true){
				result = 1;
			}
		}
		return result;
	}
//	public static void main(String [] args) {
//		CustomerModel c = new CustomerModel();
//		c.update("성호","vip");
//		c.getCustomers().get(3).setGrade("gold");
//		System.out.println(c.datas);
//		c.delete("민재");
//		System.out.println(c.datas);
//		System.out.println(c.getCustomers());
//		System.out.println(c.datas);
//		/*//?	gold 데이터의 d 철자만 출력
//		 * AttayList -> Customer -> grade -> 'd'
//		 */
//		System.out.println(c.getCustomers().get(3).getGrade().charAt(3));
//		System.out.println(c.datas.get(3).getGrade().charAt(3));
//		try {
//			c.insert(new Customer("2222", 10, "vvip"));
//			System.out.println("정상실행");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(c.getCustomers());
//		System.out.println(c.getCustomer("2222"));
//	
//		
//	}
}
