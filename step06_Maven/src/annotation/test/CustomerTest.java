package annotation.test;
import model.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer c = new Customer("a", 1 , "e");
		//Customer.builder().name("�̼���")
		//new Customer("�̼���")
		Customer c = Customer.builder().name("�̼���").build();
		System.out.println(c.toString());
		
		//new Customer("������", 100)
		Customer c2 = Customer.builder().name("������").age(100).build();
		System.out.println(c2.toString());
	}

}
