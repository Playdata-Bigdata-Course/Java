package view;

import model.domain.Book; //ctrl + shift + o �� �ڵ� �ϼ� ����
public class EndView {
	public static void printBook(Book b) {
		System.out.println(b.toString());
		}
	static void printBooks(Book [] all) {
		for(int i=0 ; i < all.length ; i++) {
			System.out.println(all[i].getIsbn());
		}
	}
}
