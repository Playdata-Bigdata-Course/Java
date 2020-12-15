package step04.basic;

import step01.basic.Customer;

public class Step05ReferenceArray {
	//Customer 배열 생성해서 데이터 저장
	static Customer [] getCs(){
		Customer [] all = {new Customer("장종욱", 30, "vvip"),
				  		   new Customer("김재웅", 27, "vvip")};
		return all;
	}
	//Customer 배열의 데이터를 반복문 활용해서 출력
	/*all[i].getName()
	 * all - Customer[]
	 * all[0] or all[1] - Customer
	 * all[0].getName() - String 이름값
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

////배열 타입의 활용을 위한 필기
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
