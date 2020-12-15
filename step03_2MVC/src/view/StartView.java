package view;

import model.Data;

public class StartView {
	public StartView() {}
	public static void main(String[] args) {
		Data data = new Data();
		EndView view = new EndView();
		view.printCar(data.getCar());
	}
}
