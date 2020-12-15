//sql�� ���� ����ؼ� DB�� ���� �����ϴ� Ŭ������ ��ȯ
package model;

import java.util.ArrayList;
import model.db.VirtualDatabase;
import model.domain.Customer;

public class CustomerModel {
	 ArrayList<Customer> datas = VirtualDatabase.getCustomers();
	//��� �� �˻� - �� ���� ��ȯ
	public ArrayList<Customer> getCustomers(){
		return VirtualDatabase.getCustomers();
	}
	//�� �˻� - id�� �ش� �� �˻�
	public Customer getCustomer(String id) {
		for(Customer c : datas) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	//�� ���� - 3���� �����Ͱ� �Ѹ��� �� ����
	/*	parameter�� Customer Ÿ��?
	 *	String id, int age, String grade ������? 	
	 *  ������ ��� - ���ܹ߻�(�ߺ��� id��� �޼����� ����)
	 *  �������� ��� - ���� */
	public void insert(Customer c) throws Exception{
		//id�ߺ� ���� ���� �� ������ �� ��쿡�� add
		if(getCustomer(c.getId()) == null) {
			datas.add(c);
		}else {
			throw new Exception("�ߺ��� id�Դϴ�");
		}
	}
	//�� ���� ����
	/* ���� ���� : true/ ������ ���� : false
	 * id������ ��޼��� ����
	 * �߻� ����� ��
	 * 	1. id�� �����Ѵ� - ����  true ��ȭ
	 * 	2. id�� ������ - ���� �Ұ� false ��ȯ
	 */
	public boolean update(String id, String newGrade) {
		boolean result = false;
		Customer c = getCustomer(id);
		if (c != null) { //null�� �ƴ� �� ���� ����
			c.setGrade(newGrade);
			result = true;
		}
		return result;
	}
	//�� ���� - ���� ���� �� 1 ��ȯ, ���� ���� �� 0 ��ȯ
	/*ArrayList�� ����� Customer �� ArrayList�� ������ ���� - remove(int index), remove(Object o)
	 * 
	 */
	public int delete(String id) {
		int result = 0;
		Customer c = getCustomer(id);
		if (c != null) {//null�� �ƴϴ� = Customer ����
			if(datas.remove(c) == true){
				result = 1;
			}
		}
		return result;
	}
//	public static void main(String [] args) {
//		CustomerModel c = new CustomerModel();
//		c.update("��ȣ","vip");
//		c.getCustomers().get(3).setGrade("gold");
//		System.out.println(c.datas);
//		c.delete("����");
//		System.out.println(c.datas);
//		System.out.println(c.getCustomers());
//		System.out.println(c.datas);
//		/*//?	gold �������� d ö�ڸ� ���
//		 * AttayList -> Customer -> grade -> 'd'
//		 */
//		System.out.println(c.getCustomers().get(3).getGrade().charAt(3));
//		System.out.println(c.datas.get(3).getGrade().charAt(3));
//		try {
//			c.insert(new Customer("2222", 10, "vvip"));
//			System.out.println("�������");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(c.getCustomers());
//		System.out.println(c.getCustomer("2222"));
//	
//		
//	}
}
