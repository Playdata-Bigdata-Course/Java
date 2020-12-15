package model.domain;

public class Car {
	int number;
	String carName;
	String color;
	
	Car(){}

	public Car(int n, String N, String C) {
		number = n;
		carName = N;
		color = C;
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number >= 0000) {
			this.number = number;
			
		}else {
			System.out.println("존재하지않는 번호");
		}
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return number + " " + carName + " " + color;
	}
	
}
