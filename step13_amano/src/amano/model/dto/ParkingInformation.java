package amano.model.dto;

public class ParkingInformation {

	/** 차종류 */
	private Car InfoCar;
	/** 주차 자리 */
	private ParkingLot InfoParkinglot;
	/** 주차 요금 */
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
		builder.append(" [차량]: ");
		builder.append(InfoCar);
		builder.append(", [주차 자리]: ");
		builder.append(InfoParkinglot);
		builder.append(", [주차 요금]: ");
		builder.append(InfoParking);
		return builder.toString();
	}
}