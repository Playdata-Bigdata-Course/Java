/*�н� ����
 * 1. �迭
 * 	- �ϳ��� ������ ������ Ÿ���� �ټ��� �����͸� Ȱ�� �����ϰ� �ϴ� Ÿ��
 * 	- �⺻ Ÿ���� �ƴ� ���� ����(reference, object , class Ÿ��)
 * 
 * 2. ����
 * 	- ���� 3���� �����ؼ� Ȱ���ϴ� ���α׷��̶� ������ 3���� �����͸� ���������� ����
 * 	- int Ÿ���� ���� 3�� �ʿ�
 * 	- ���� ���� : �������� ���� �Ұ�
 * 
 * 3. �迭 ����
 * 	[] - �迭�� ǥ����
 * 		Ÿ��[] ������;
 * 		Ÿ�� ������[];
 * 
 * 
 * 4. ����
 * 	(parameter) - �޼ҵ� ����, ������ �����ÿ� ���,
 *		- �޼ҵ�, ������ ȣ�Ⱚ ������ �ޱ� ���� ���� ����
 * 		- void a(int no){} - ���� / a(3); - ȣ��;
 * 		- ȣ��� ���� �����ϱ� ���� ǥ��
 * 
 *	{������ �����ϴ� ����} - �޼ҵ� ����, ������ �����ÿ� ���
 *
 *	�����ɾ�>java Step05Array
 *	����ȯ���� ���� ���
 *		Step05Array.main([..]);
 */
package step04.basic;

import step01.basic.Customer;

public class Step05Array {

	public static void main(String[] args) {
		//int�� 3���� �ϳ��� �迭�� ���� �� Ȱ��
		int [] i = new int[3];//3���� int�� ���� ������ �޸� ����
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		System.out.println(i[0]);
		System.out.println(i[2] + " " + i.length);
		
		//���� ���� �ʱ�ȭ�� �ϳ��� �������� ���
		//��ü ���� ����
		// new ������([..]) & " " & �迭{}������ �ڵ����� ��ü�� ��
		int [] i2 = {1, 2, 3};
		System.out.println(i2[2]+ " " + i.length);
		
		//String �迭 ���� �� Ȱ��
		String [] s = {"A", "B", "C"};
		System.out.println(s[0]);
		
		Customer [] c2 = {new Customer("������", 30, "vvip"),
						  new Customer("�����", 27, "vvip")};
		System.out.println(c2.length);
		// �迭���� index 0��°�� ����� Customer ��ü�� ã�Ƽ� �� ��ü�� ������ 3���� ������ �߿� �̸��� ��ȯ�ؼ� ���
		Customer c1 = c2[0];
		String name = c1.getName();
		System.out.println(name);
		
		System.out.println(c2[0].getName());
		}
	}


