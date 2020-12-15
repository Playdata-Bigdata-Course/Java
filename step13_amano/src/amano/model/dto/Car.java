/*
 * 
 */

package amano.model.dto;

public class Car {
	// 차번호
	private String number;

	// 차종류
	private String name;

	// 차등급
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
		builder.append("차번호 : ");
		builder.append(number);
		builder.append(", 차종 : ");
		builder.append(name);
		builder.append(", 차등급 : ");
		builder.append(grade);
		return builder.toString();
	}
}
