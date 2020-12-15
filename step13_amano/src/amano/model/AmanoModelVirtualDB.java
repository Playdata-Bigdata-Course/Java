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
		information.add(new ParkingInformation(new Car("11가1111", "avante", "준중형"), new ParkingLot("A1", "장애인전용"),
				new Parking("11-17 10:00", "11-17 20:00")));
		information.add(new ParkingInformation(new Car("22나2222", "sonata", "중형"), new ParkingLot("A2", "여성전용"),
				new Parking("11-17 11:00", "11-18 20:00")));
		information.add(new ParkingInformation(new Car("33다3333", "grandure", "대형"), new ParkingLot("A1", "일반"),
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
////주차비용 계산(Date)
//	SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
//	String st_f1 = transFormat.format(f1);
//	String st_f2 = transFormat.format(f2);
//	int in_f1 = Integer.parseInt(st_f1);
//	int in_f2 = Integer.parseInt(st_f2);
//	
//	//주차비용 계산(String으로)
//	int hourDiff = in_f2 / 100 - in_f1 / 100; //시간의 차이
//	int minDiff = in_f2 % 100 - in_f1 % 100; // 분의 차이를 계산한다.
////	// 총 분의 시간을 계산하고 30분당 500원으로 계산한 후  출력한다.
//	int totDiff = hourDiff * 60 + minDiff;
//	int rateStd = 500;
//	int rate = totDiff / 30 * rateStd;