/* �н�����
 * 	1. �α��� ���� ����
 * 	2. �ʿ� ������
 * 		-client�� �Է��ϴ� id/pw
 * 	3. ���
 * 		-id/pw������ ������ �ؼ� ��ȿ�� ���?("��ȿ�� id")
 * 		��ȿ�� ���("��ȿ��id")
 * 		-id : playdata
 *  4. �ʿ��ڵ�
 *  	1. String �� ����
 *  		- �̹� ����(�����ͺ��̽� ����) �����Ѵ� ����
 *  		- java�� ���ڿ� �񱳽� �޼ҵ�
 *  			public class String{
 *  				public boolean equals(String v){
 * 						�� ���ڿ� ��ü�� �� �����͸� �޾Ƽ� ��
 * 						true or false ��ȯ 
 *				 }
 *  		}
 *  		String id - "playdata";
 *  		boolean r = id.equals("client�� �Է��� ������");
 *  
 * 5. ����
 * 	1. �� ��  == : ����� ������
 * 		�⺻ Ÿ��
 * 			���� �� ��
 * 			int i = 10;
 * 			int i2 = 20;
 * 			i == i2 false
 * 		���� Ÿ��
 * 			��ü�� �ּҰ��� ��
 * 			��ü���� ���밪 �񱳽ÿ��� equals()�� ��
 */

package step01;

import model.domain.Customer;

public class ValidationCheck {
	// ��������
	public static String idCheck(String id) {
		String userId = "playdata";
		if (userId.equals(id)) {
			return "��ȿ�� id�Դϴ�";
		} else {
			return "��ȿ�� id�Դϴ�";
		}
	}

	/*
	 * //? Customer �� ������ �ִ� ���� �̸��� "���ھ�" �˻� �̸��� ���ھ� ��� age�� grade�� �����ؼ� ��ȯ ���ھư�
	 * �ƴ϶�� "�� �ڰ� ����" ��� ��ȯ
	 * 
	 */
	public static String nameCheck(String searchName) {
		Customer user = new Customer("���ھ�", 10, "vvip");
		if (user.getName().equals(searchName)) {
			return user.getAge() + "  " + user.getGrade();
		} else {
			return "�� �ڰ� ����";
		}
	}

	// ?�̸����� �� ���� �˻� ������ test �ڵ� �����ϱ�
	public static void main(String[] args) {
		String message = idCheck("p");
		System.out.println(message);// ��ȿ�� id

		message = idCheck("playdata");
		System.out.println(message);// ��ȿ�� id

		System.out.println(nameCheck("���ھ�"));
		System.out.println(nameCheck("��"));
	}
}
