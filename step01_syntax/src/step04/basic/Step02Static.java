/*�н�����
 * 1. static Ű����
 * 2. Ư¡
 * 	- ��ü ���� ���̵� ����� ������ �޼ҵ�� ȣ���ؼ� ����� ����
 * 3. �ʿ伺
 * 	- ��ü ��ü�� �ʿ����� �ʰ� �޼ҵ带 ����� �ʿ��� ��쿡 ��ü �������� �޼ҵ� ���ุ �����ϰ� �ϰ��� �Ҷ�
 *  - ��� ����ڵ��� �����ϴ� ������ �ڿ��� ������ Ȱ���ϰ��� �Ҷ� ������ ����
 *  	: ��ü ���� �����ϰ� ��� ��ü�� �����ϴ� ������ ������ ����ÿ� ���
 *  	�� class ���� �� ��й�ȣ ������ static���� ��� ����
 * 4. ����
 * 	1. ���� : static Ÿ�� ������;
 * 	2. �޼ҵ� : static ����Ÿ�� �޼ҵ��(){}
 * 	3. static{} : 
 * 		byte code�� �޸𸮿� �ε��� �� �ѹ��� ����
 * 		��� user���� �����ϴ� �ڿ��� �� �ѹ� �ʱ�ȭ �ؾ� �� ���
 */

package step04.basic;

public class Step02Static {
	//��� �������� �޸𸮿� ���� ���� �� ������ �ڵ� �ʱ�ȭ(default �ʱ�ȭ)
	int a;			//��ü ���� �Ŀ��� ��� ����
	static int b;	//��ü �������� �ʰ� ��� ����
	Step02Static(){
		a++;//a�� 1 �����ϴ� ���� ������ a = a+1�� ����
		b++;
	}
	public static void main(String[] args) {
//		System.out.println(b); ����
//		System.out.println(a); error
		
		Step02Static s = new Step02Static();		
		System.out.println(s.a + " " + b);		//1 1
		
		Step02Static s2 = new Step02Static();
		System.out.println(s2.a + " " + b);		//1 2
		/* java.lang.System
		 * PrintStream out : System Ŭ������ static ���� ���� ���� Ŭ���� �̸����� ȣ��
		 * 		System.out
		 * println() : ���� ��� ����
		 * 			PrintStream ���� ����
		 */
		System.out.println(Step02Static.b);  
	}

}
