package amano.model.dto;

public class ParkingInformation {

	/** ������ */
	private Car InfoCar;
	/** ���� �ڸ� */
	private ParkingLot InfoParkinglot;
	/** ���� ��� */
	private Parking InfoParking;

	public ParkingInformation() {
		super();
	}

	public ParkingInformation(Car InfoCar, ParkingLot InfoParkinglot, Parking InfoParking) {
		super();
		this.InfoCar = InfoCar;
		this.InfoParkinglot = InfoParkinglot;
		this.InfoParking = InfoParking;
	}

	public Car getInfoCar() {
		return InfoCar;
	}

	public void setInfoCar(Car infoCar) {
		InfoCar = infoCar;
	}

	public ParkingLot getInfoParkinglot() {
		return InfoParkinglot;
	}

	public void setInfoParkinglot(ParkingLot infoParkinglot) {
		InfoParkinglot = infoParkinglot;
	}

	public Parking getInfoParking() {
		return InfoParking;
	}

	public void setInfoParking(Parking infoParking) {
		InfoParking = infoParking;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" [����]: ");
		builder.append(InfoCar);
		builder.append(", [���� �ڸ�]: ");
		builder.append(InfoParkinglot);
		builder.append(", [���� ���]: ");
		builder.append(InfoParking);
		return builder.toString();
	}
}