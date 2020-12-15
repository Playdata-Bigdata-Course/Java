 package step01.oop;

import java.util.ArrayList;

class Parent3 extends Object{
	String id;
	int age;
	void printAll() {
		System.out.println(id);
		System.out.println(age);
	}


	}
public class Child3 extends Parent3{
	String job;
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	
	static Object m() { //Object ���� = "���ڿ�"; String ��ü�� Object�� �ڵ� ����ȯ
		return "���ڿ�";
	}
	
	static void m2() {
		ArrayList al = new ArrayList();
		al.add("����");				//String -> Object ��ȯ
		al.add(new Integer(20));	//Integer
		al.add("new Child()");		//Child���� toString() ������ ������
		
		//�ݺ��� Ȱ���ؼ� �� ��ü���� ������ toString()�޼ҵ� ȣ���ؼ� ���
		//for / print() or println()
		/*���� 1 : toString()�� Object�� �޼ҵ尡 ȣ���� �ɱ��?
		 * 		String or Integer ��ü��� String or Integer
		 * 			Ŭ������ �����ǵ� toString()�� ȣ��ɱ��??
		 */
		for(int i=0; i < al.size(); i++) {
			System.out.println(al.get(i).toString()); //index�� ������ ��ȯ
		}
		System.out.println("----");
		System.out.println(al.get(0));
		al.remove(0);
		System.out.println(al.get(0));
	}
	public static void main(String[] args) {
		m2();
		String s = (String) m();
		System.out.println(s.charAt(0));
		/*������ �ܰ�
		 * 	- Parent3 ������ �ǰ� �ش� byte code�� �ڽ�Ŭ���� Ȯ��
		 * ����ܰ�
		 * 	- �ڽĳ��ο� ���� ���θ� Ȯ���ؼ� �ڽ��� �޼ҵ带 �����ϰ� �ִٸ� ����
		 * 	Ȥ�� �ڽ�Ŭ������ �ش� �޼ҵ尡 ���ٸ� �θ� Ŭ������ �������� �޼ҵ� ����*/ 
		 Parent3 p = new Child3();
		 p.printAll(); //�����ǵ� �ڽ� Ŭ������ �޼ҵ尡 ����
		 p.id = "Tester";
		 p.age = 10;
		 
		 //p.job = "it man";
		 
		 Child3  c = (Child3)p; // ������� ����ȯ
		 c.job = "it man";
		 System.out.println();
		}
	}
