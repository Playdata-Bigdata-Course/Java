/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  RunningEndView.java
 * DESC  : ��� ��� ���� ��� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package amano.view;

import java.util.ArrayList;

import amano.model.dto.ParkingInformation;

public class EndView {

	// �������� Ư�� ������Ʈ ���
	public static void informationView(ParkingInformation information) {
		if (information != null) {
			System.out.println(information);
		} else {
			System.out.println("�ش� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	// �������� ��� ������Ʈ ���
	public static void projectListView(ArrayList<ParkingInformation> allInformation) {
		for (ParkingInformation information : allInformation) {
			System.out.println(information);
		}
	}

	// ���ܰ� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}

}
