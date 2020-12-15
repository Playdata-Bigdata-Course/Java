/* �н�����
 * 1. properties ������ ������ �ڹ� �ڵ�� ����ϴ� ��� �н�
 * 2. ���� �ܰ�
 * 	1. Properties ��ü ����
 *  	- properties ������ ������ Ȱ�� �� �� �ִ� ��� ����
 *  2. properties ������ ������ �ڹ� �ڵ�� read�ؼ� ��� �����ϰ�  �޸𸮿� ����(�ε�)
 *  	- properties ������ ������ Properties ��ü�� ��� �����ϰ� ����
 *  3. key�� value�� �����ؼ� Ȱ��
 * 
 */
package step01.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties pro = new Properties();
		//properties ������ ������ Properties ���� �����ؼ� �ε�
		/* ���� �б�
		 * 	- ������ ������ read �� �� �ִ� API
		 * 	- File�� ���� read(input) - FileInputStream
		 * �о���� ���� ������ Properties�� ����(�ε�)�ϱ�  */
		try {
			pro.load(new FileInputStream("info.properties"));
			System.out.println(pro); //{address=seoul, age=10, name=kim}
			System.out.println(pro.get("age")); //10
			System.out.println(pro.getProperty("age")); //get() ���� ��ȣ

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
