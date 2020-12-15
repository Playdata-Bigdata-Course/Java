package step02.application;

public class BookCRUD {
	Book book;	//��� �޼ҵ忡�� �����ϴ� �ڿ�
	//����
	/* ȣ����(�����) ����
	 *  - ���� �޼ҵ� ȣ��ø��� ���ο� �����ͷ� å ����
	 *		: save(String isbn, String name, int birthDay)
	 *	- �޼ҵ� body�� �̹� ������ �����ͷ� Book�� ���� ������
	 *		" save(){ .. } 
	 */
	void save(String isbn, String name, int birthDay) {
		book = new Book(isbn, name, birthDay);
	}
	//�˻�
	void search() {
		//book.toString()
		/* book ������ �����ϴ� �ּҰ��� ��ü�� ������ toString
		 * 
		 * 
		 */
		System.out.println(book.toString());
	}
	//����
	void update(String newName) {
		book.setBookName(newName);
	}
	//����
	void delete() {
		book = null;	//�ּҰ��� �ʱ�ȭ �ϴ� Ű����, �� ���� Ÿ�� ������ �⺻��
	}
	
	public static void main(String[] args) {
		BookCRUD crud = new BookCRUD();
		//? CRUD ���� ������� ȣ���ؼ� ����� Ȯ���ϱ�
		//������ ���� ->Ȯ��(�˻�)->����->Ȯ��(�˻�)->����->Ȯ��(�˻�)
		crud.save("0001", "�ϳ�", 2021);
		crud.search();
		crud.update("��");
		crud.search();
		crud.search();
		crud.save("0002", "��", 2020);
		crud.search();
	}

}
