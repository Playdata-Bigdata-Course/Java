/* ��ü ������ ���� �����ڴ� �����ڰ� ���ڵ� �� �ڵ����� �߰�(�⺻ ������)
 * ������{} ���ο��� ��� ������ ����...
 */

package step04.basic;

class A{
	int no = 10;
	A(){//no ���� ���� ���� 0������ �ڵ����� �ʱ�ȭ -> 10������ �ʱ�ȭ
		System.out.println("A");
	}//���� ����� A��ü �Ϸ�
	int getNo() {
		no=8;
		return no;
	}
}
class B{
	A a = new A();
	B(){
		//��������� ���� �Ϸ� = A a �Ϻ��ϰ� ���� ����
		System.out.println("B");
	}
}
class C{
	B b = new B();
	C(){
		System.out.println("C");
	}//������ ���� ����� �� Ŭ������ ������ ��� ��� ������ �Ϻ��ϰ� �޸𸮿� ������ ��
}
public class Step04Review {

	public static void main(String[] args) {
		/*�̼�1 = A Ŭ������  no ������ ���
		 *�̼�2 = ��ü ���� ����? c>b>a>no or getNo
		 */
		C c = new C();
		System.out.println(c.b.a.no);
		System.out.println(c.b.a.getNo());
		}

}
