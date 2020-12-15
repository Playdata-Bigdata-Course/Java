package annotation.test;
import model.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer c = new Customer("a", 1 , "e");
		//Customer.builder().name("이순신")
		//new Customer("이순신")
		Customer c = Customer.builder().name("이순신").build();
		System.out.println(c.toString());
		
		//new Customer("전지현", 100)
		Customer c2 = Customer.builder().name("전지현").age(100).build();
		System.out.println(c2.toString());
	}

}
