/* �н�����
 * 1. ���뼺�� ����� ����
 * 2. ��ü ���� ����
 * 	1. ��� ��� ������ �ʱ�ȭ �� ���� ����
 * 	2. name�� �ʱ�ȭ �� ���� ����
 * 	3. age���� "		"
 *	..�߻��Ǵ� ����	
 *		�������� ������ �����ϰ� �������� ����
 * 3. �ذ�å
 * 	- �ʿ��� ����(ȣ�� ����)�� �����ڸ� �������� �����ϴ� �������� �ؼ�
 * 4. ���߹��
 * 	- Builder pattern
 * 
 */ 
 package model.domain;

import lombok.Builder;

@Builder
public class Customer {
	// ��� ����
	private String name; // ��ü �����ÿ� ��ü�� ���� �޸� ���ο� ���� �� ����
	private int age;
	private String grade; // vvip, vip, silver
//
////	public Customer() {}
////	public Customer(String name, int age, String grade) {
////		this.name = name;
////		this.age = age;
////		this.grade = grade;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

//	p.s.v.m(){
//		Customer c = new Customer();
//		c.name = "������";
//		c.age = 10;
//		Customer c2 = new Customer("������", 10, "vvip");
//	}
//	
//

	// age�� ���� �� �� �ִ� ���
	// newAge�� setAge() ȣ��� �����ǰ� ���� ����ÿ� �ڵ� �Ҹ�
	// local, stack ����, temporary����, automatic ����
//	void setAge(int newAge) { // ȣ��� �ڵ� ����
//		age = newAge;
//	}// newAge ����� �ڵ� ����
//
//	// age ������ ��ȯ�ϴ� �޼ҵ� ���
//	int getAge() {
//		return age;
//	}

	// grade�� ���� �� �� �ִ� ���
}
