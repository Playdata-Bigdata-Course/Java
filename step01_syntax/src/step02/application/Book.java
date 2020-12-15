/* ���� ������ ǥ���� �� �ִ� Ŭ���� - ������ ǥ���� ���� ���� Ŭ����
 * Data Transtfer Object[DTO] pattern
 * Value Object pattern[VO]
 */
package step02.application;

public class Book {
	String isbn;	//��� ������
	String bookName;
	//�ܺο��� ȣ�� �Ұ� �� ���� ����, ������ Book Ŭ���������� ȣ�� ���ɤ��� ����
	private int birthDay;	//2020�� ������ �����Ϳ� ���ؼ��� ��ȿ
	
	Book(){}		//  �⺻ ������
	Book(String i, String b, int d){	//��ü ���� �� ��� �����鰪�� ���ϴ� �����ͷ� �ʱ�ȭ
		isbn = i;
		bookName = b;
		setBirthDay(d);	
	}
	
	public String getIsbn() {
		return isbn;
	}
	//��� ������� ���� �������� ������ ��� ��� ������ this. �ʼ�
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBirthDay() {
		return birthDay;
	}
	/* ����
	 * birthDay ��� ������ �ݵ�� 2020 ���� �����͸� ����
	 * �� ������ �����ʹ� ���� �Ұ����� ��
	 * 
	 * ����(if)�� �Է��Ϸ��� �����Ͱ��� 20���� ���ų� ũ��(>= 2020) ����(=)
	 * �ƴ϶�� ���� �Ұ�
	 */
	public void setBirthDay(int birthDay) {
		if(birthDay >= 2020) {
			//���ǽ��� true�� ��� ����Ǵ� ���
			this.birthDay = birthDay;
		}else {
			System.out.println("��ȿ�� ���ǳ⵵");
		}
	}
	
	//������ ����� ���Ǽ��� ���ؼ� ��� ��� �������� �ѹ��� ��ȯ�ϴ� �޼ҵ� �߰� ����
	//�ڹ��� ��ȯ Ÿ���� �ݵ�� �ϳ��� ����
	//���ڿ� ����, +(���տ�����)
	public String toString(){
		return isbn + " " + bookName + " " + birthDay;
	}
}
