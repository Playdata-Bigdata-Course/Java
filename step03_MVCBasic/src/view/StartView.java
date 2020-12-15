package view;

import model.Data;

public class StartView {
	public StartView() {}
	public static void main(String[] args) {
		
		EndView.printBook(Data.getBook());
		EndView.printBooks(Data.getBooks());
	}
}
