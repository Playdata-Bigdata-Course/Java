package step01.oop;

class Parent{
	String id;
	int age;
	
	void printAll() {
		System.out.println(id);
		System.out.println(age);
	}
}
// ��� ���� ����, Parent�� ����ؼ� Ȯ���ϴ� Child Ŭ����
public class Child extends Parent{
	String job;
	//������ �ϴ� �޼ҵ�
	void printAll() {
		super.printAll();//�θ��� ��� ������ �״�� ����޴� �������� �ڵ�
		System.out.println(job);
	}
	public static void main(String[] args) {
		Child c = new Child();//��ü ���� �� ��� ��� �������� �⺻������ �ʱ�ȭ
		c.id = "�����id";//id������ ����
		c.job = "IT man";
		c.printAll();//printAll() ����
	}

}
