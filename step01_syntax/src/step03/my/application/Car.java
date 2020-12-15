package step03.my.application;

public class Car {
	String carName;
	String carColor;
	private int carPrice;
	
	Car(){}
	Car(String N, String C, int B){
		carName = N;
		carColor = C;
		setCarPrice(B);
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice){
		if (carPrice > 0000) {
			this.carPrice = carPrice;
	} else {
		System.out.println("존재하지 않는 차");
		}
	}
	public String toString() {
		return carName + " " + carColor + " " + carPrice;
	}
}	
