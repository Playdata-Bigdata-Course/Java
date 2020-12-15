package model;

import model.domain.Car;

public class Data {
	public Car getCar() {
		Car c = new Car(1234, "avante", "white");
		return c;
	}
}
