//database�� ����
package model.db;

import java.util.ArrayList;

import model.domain.Customer;

public class VirtualDatabase {
	private static ArrayList<Customer> all = new ArrayList<>();
	
	//�� ���� ����
	static {
		all.add(new Customer("����", 10, "vvip"));
		all.add(new Customer("����", 10, "vvip"));
		all.add(new Customer("��ȣ", 10, "vvip"));
		all.add(new Customer("����", 10, "silver"));
	}
	
	//�� ����
	public static ArrayList<Customer> getCustomers(){
		return all;
	}
}
