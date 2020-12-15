/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  StartView.java
 * DESC  : ���� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package amano.view;

import amano.controller.InformationController;
import amano.model.dto.Car;
import amano.model.dto.ParkingInformation;
import amano.model.dto.ParkingLot;
import amano.model.dto.Parking;

public class StartView {

	public static void main(String[] args) {

		InformationController controller = InformationController.getInstance();

		System.out.println("\n*** 01. ��� ������Ȳ �˻� ***");
		controller.getInformation();

		System.out.println("\n*** 02.22��2222�� ���� �˻�  ***");
		controller.getInformation("22��2222");

		System.out.println("\n*** 03. �������ϴ� ���� �˻� ***");
		controller.getInformation("22��1111");

		System.out.println("\n*** 04. ���ο� ���� ���� ��  ��� ������Ȳ�˻� ***");
		ParkingInformation newInformation = new ParkingInformation(new Car("55��5555", "genesis", "����"),
				new ParkingLot("B3", "�Ϲ�"), new Parking("12-20 15:00", "12-20 20:00"));
		System.out.println("\n04-1. ���� �� ������Ȳ �˻�");
		controller.getInformation();

		controller.insertInformation(newInformation);

		System.out.println("\n04-2. ���� �� �˻�");
		controller.getInformation();

		System.out.println("\n04-3. �̹� ����� ������Ʈ ������ �õ��� ��ȿ�� ������ ���ռ� ����");
		controller.insertInformation(newInformation);

		// ���� ������ ��ȿ�� ó�� ���� ����
		System.out.println("\n*** 05. �ǹ̾��� �������� null��  �������� Ȯ�� �õ� �� ��ȿ�� ������ ���ռ� ���� ***");
		controller.insertInformation(null);

		// "11��1111"�� ���� ���� ���� �� �˻�
		System.out.println("\n*** 06. �����ϴ� ���� �������� ���� �� ������ ���� �˻� ***");
		System.out.println("06-1. ���� �� '11��1111'���� �˻�");
		controller.getInformation("11��1111");
		controller.updateNoInformation("11��1111", new ParkingLot("A5", "�Ϲ�"));

		System.out.println("\n06-2. ���� �� ������Ʈ �˻�");
		controller.getInformation("11��1111");

		System.out.println("\n*** 07. �ǹ̾��� �������� null�� Project�� ������ ���� ���� �õ� �� ��ȿ�� ������ ���ռ� ���� ***");
		controller.updateNoInformation("11��1111", null);

		// '11��1111' ���� ���� �� �˻�
		System.out.println("\n*** 08. '11��1111' ���� ���� �� ������ ���� �˻� ***");
		System.out.println("08-1. ������ ���� �˻�");
		controller.getInformation();
		controller.deleteCar("11��1111");

		System.out.println("\n08-2. ���� �� �����˻� ");
		controller.getInformation();

		System.out.println("\n08-3. ������ ���� ��õ� �� ��ȿ�� ������ ���ռ� ����");
		controller.deleteCar("11��1111");

	}
}
