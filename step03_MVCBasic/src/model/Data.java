package model;
///model package�� ������ ��� Ŭ������ ���� �ݵ�� import ���� �ʼ�

import model.domain.Book;

public class Data {	
	public static Book getBook() {
		return new Book("001", "java book ", 2020);
	}
	//???? - �ΰ� �̻��� å ������ ��ȯ�ϴ� �޼ҵ� ����
	public static Book [] getBooks(){
		Book [] all = {new Book("001", "java book ", 2020),
					   new Book("002", "sql book", 2021),
					   new Book("003", "python book", 2030)};
		return all;
	}		
}
//???? - �� �޼ҵ��� ���� ����� �ܼ�â�� ���
