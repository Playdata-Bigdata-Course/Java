package step03.my.application;

public class CarCRUD {
	Car Car;
	void save(String carName, String carColor, int carPrice) {
		Car = new Car(carName, carColor, carPrice);
	}
	void search() {
		System.out.println(Car.toString());
	}
	void update(String newName) {
		Car.setCarName(newName);
	}
	void delete() {
		Car = null;
	}
	public static void main(String[] args) {
		CarCRUD crud = new CarCRUD();
		
		crud.save("avante", "red", 2911);
		crud.search();
		crud.update("k3");
		crud.search();
		crud.delete();
		crud.save("k5", "white", 3311);
		crud.search();
	}
}
