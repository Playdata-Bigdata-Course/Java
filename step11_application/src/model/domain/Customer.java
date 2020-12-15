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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString		//��� ��� ������ ���� �ϳ��� ���ڿ��� �����ؼ� ��ȯ
public class Customer {
	private String id; 
	private int age;
	private String grade;	
}