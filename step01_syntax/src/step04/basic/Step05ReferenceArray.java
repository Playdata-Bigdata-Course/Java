package step04.basic;

import step01.basic.Customer;

public class Step05ReferenceArray {
	//Customer �迭 �����ؼ� ������ ����
	static Customer [] getCs(){
		Customer [] all = {new Customer("������", 30, "vvip"),
				  		   new Customer("�����", 27, "vvip")};
		return all;
	}
	//Customer �迭�� �����͸� �ݺ��� Ȱ���ؼ� ���
	/*all[i].getName()
	 * all - Customer[]
	 * all[0] or all[1] - Customer
	 * all[0].getName() - String �̸���
	 */
	static void printall(Customer [] all) {
		for(int i=0 ; i < all.length ; i++ ) {
			System.out.println(all[i].getName());
		}
	}
	public static void main(String[] args) {
		Customer [] c = getCs();
		System.out.println(c.length);
	}

}

////�迭 Ÿ���� Ȱ���� ���� �ʱ�
//int i = 1;
//int getInt() {
//	return 3;
//}
//
//int [] ii = {1, 2};
//int[] getInt() {
//	int [] ii = {1, 2};
//	return ii;
//}
//
//
//String s = "23";
//String getString() {
//	return "Ew";
//}
//
//
//String [] s = {"23", "ew"};
//String [] getString() {
//	String [] s = {"23", "ew"};
//	return s;
//}
//
//
//Customer c = new Customer();
//Customer getC() {
//	return new Customer();
//}
//
//Customer [] c = {new Customer(), new Customer()};
//Customer[] getC() {
//	Customer [] c = {new Customer(), new Customer()};
//	return c;
//}
//
//void a(int i) {} / a(3);
//void a(String i) {} / a("3");
//
//
//
//void a(int[] i) {}
//int [] ii = {1, 2};
//a(ii);
//
//
//void a(String[] i) {}
//String [] s = {"23", "ew"};
//a(s);
//
//void a(Customer[] i) {} 
//Customer [] c = {new Customer(), new Customer()};
//a(c);
//Customer c2 = new Customer();
//a(c2);
//
//
//
