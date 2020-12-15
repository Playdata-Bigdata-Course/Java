package amano.model;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import amano.model.dto.Car;
import amano.model.dto.Parking;
import amano.model.dto.ParkingInformation;
import amano.model.dto.ParkingLot;

public class AmanoModelVirtualDB {

	private static AmanoModelVirtualDB instance = new AmanoModelVirtualDB();
	private ArrayList<ParkingInformation> information = new ArrayList<ParkingInformation>();

	private AmanoModelVirtualDB() {
		information.add(new ParkingInformation(new Car("11��1111", "avante", "������"), new ParkingLot("A1", "���������"),
				new Parking("11-17 10:00", "11-17 20:00")));
		information.add(new ParkingInformation(new Car("22��2222", "sonata", "����"), new ParkingLot("A2", "��������"),
				new Parking("11-17 11:00", "11-18 20:00")));
		information.add(new ParkingInformation(new Car("33��3333", "grandure", "����"), new ParkingLot("A1", "�Ϲ�"),
				new Parking("12-18 14:00", "12-20 20:00")));

	}

	public static AmanoModelVirtualDB getInstance() {
		return instance;
	}

	public ArrayList<ParkingInformation> getInformation() {
		return information;
	}

	public void insertInformation(ParkingInformation newInfomation) {
		information.add(newInfomation);
	}
}
////������� ���(Date)
//	SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
//	String st_f1 = transFormat.format(f1);
//	String st_f2 = transFormat.format(f2);
//	int in_f1 = Integer.parseInt(st_f1);
//	int in_f2 = Integer.parseInt(st_f2);
//	
//	//������� ���(String����)
//	int hourDiff = in_f2 / 100 - in_f1 / 100; //�ð��� ����
//	int minDiff = in_f2 % 100 - in_f1 % 100; // ���� ���̸� ����Ѵ�.
////	// �� ���� �ð��� ����ϰ� 30�д� 500������ ����� ��  ����Ѵ�.
//	int totDiff = hourDiff * 60 + minDiff;
//	int rateStd = 500;
//	int rate = totDiff / 30 * rateStd;