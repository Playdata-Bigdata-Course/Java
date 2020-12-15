/*
 * 
 */

package amano.model.dto;

public class Car {
	// ����ȣ
	private String number;

	// ������
	private String name;

	// �����
	private String grade;

	public Car() {
	}

	public Car(String number, String name, String grade) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("����ȣ : ");
		builder.append(number);
		builder.append(", ���� : ");
		builder.append(name);
		builder.append(", ����� : ");
		builder.append(grade);
		return builder.toString();
	}
}
