/*
 * 3. ����
 * 		- index, key ������ ����
 * 4. ���� �����Ͱ��� ��� �ϳ��� �ϳ��� �̾Ƽ� ���
 * 		- ���������� �����͸� ��밡���ϰ� ����(Iterator)
 * 5. Iterator
 *		Object next() - �����Ѵٴ� �����Ͽ� ������ ��ȭ
 *		boolean hashNext() - ������ ���� ���� Ȯ�� 
 */




package step01.util;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		System.out.println(set);
	}

}
