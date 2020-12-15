/*�н�����
 * 1. ���� ó�� ���� ����
 * 2. ���� ����
 * 	1.������ �迭
 * 		- try~catch ���� ó�� ���� �ʼ�
 * 	2. ��Ÿ�� �迭
 * 		- try~catch ���� ó�� ���� �ɼ�
 * 		- java.lang.RuntimeException�̶�� Ŭ������ ������ �ִ� ��� ~ Exception��
 * 3. ����
 * 	1. try~catch
 * 	2. try~catch~finally
 * 	3. ���� �߻� �������� ó���� �ƴ϶� �� ������ ��û�� ������ ���� ó�� ����(�˸�)
 * 		- throws ~����
 * 		- �޼ҵ� ����
 * 
 */



package step05.exception;
class B {
	static {
		System.out.println("B byte code �ε�");
	}
}
public class Step02Exception {
	static void m1() {
		try {
			Class.forName("step05.exception.B");
			System.out.println("���� �� �߻��ÿ��� ����Ǵ� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	//���� �߻� �� ��� history ���
		}
		System.out.println("m1() ����Ϸ�");
	}
	//�ý��� �ڿ��� ������� �� �ڿ� ��ȯ�ڵ尡 �ʼ�
	//�ڿ� ��ȯ ������ 100%�����ϴ� ����
	static void m2() {
		try {
			Class.forName("step05.exception.B");
			System.out.println("���� �� �߻��ÿ��� ����Ǵ� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	//���� �߻� �� ��� history ���
		}finally {
			System.out.println("100%���� ����");
		}
		System.out.println("m1() ����Ϸ�");
	}
	
	//������ ����� �� �޼ҵ带 ȣ���� ������ ���� ó�� ����
	static void m3() throws ClassNotFoundException{
		Class.forName("step05.exception.B");
	}
	public static String idCheck(String id) throws Exception{
		String userId = "playdata";
		if (userId.equals(id)) {
			return "��ȿ�� id�Դϴ�";
		} else {
			throw new Exception("��ȿ�� id.. �� ��Ŀ �ƴϴ�?");
		}
	}
	//id�� ��ȿ�� ��� String������ ��ȯ
	/* ��ȿ�� id��� ���ܸ� �߻� ���Ѽ� ȣ���� ������ ���ܸ� ����
	 * java.lang.Exception Ŭ���� ���
	 */
	public static void main(String[] args) {
		m1();
		try {
			System.out.println(idCheck("pla1a"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

