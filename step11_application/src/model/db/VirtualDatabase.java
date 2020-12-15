//database로 간주
package model.db;

import java.util.ArrayList;

import model.domain.Customer;

public class VirtualDatabase {
	private static ArrayList<Customer> all = new ArrayList<>();
	
	//고객 정보 저장
	static {
		all.add(new Customer("지원", 10, "vvip"));
		all.add(new Customer("오민", 10, "vvip"));
		all.add(new Customer("성호", 10, "vvip"));
		all.add(new Customer("민재", 10, "silver"));
	}
	
	//고객 제공
	public static ArrayList<Customer> getCustomers(){
		return all;
	}
}
