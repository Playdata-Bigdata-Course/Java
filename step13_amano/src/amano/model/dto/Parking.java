/*
 * PROJECT : ��������
 * NAME : AmanoProject.java
 * DESC : ���� �ڸ��� ���εǾ� ���� ������Ȳ ������
 */

package amano.model.dto;

import java.text.SimpleDateFormat;

public class Parking {
	/** ���� ���� */
	SimpleDateFormat f1 = new SimpleDateFormat("MM-dd HH:mm");
	/** ���� ���� */
	SimpleDateFormat f2 = new SimpleDateFormat("MM-dd HH:mm");
	
	SimpleDateFormat transFormat = new SimpleDateFormat("MM-dd HH:mm");
//	String st_F1 = transFormat.format(f1);
//	String st_F2 = transFormat.format(f2);
	
	public Parking(String st_F1, String st_F2){
	super();
//	this.st_F1 = st_F1;
//	this.st_F2 = st_F2;
	}
	
	public SimpleDateFormat getF1() {
		return f1;
	}

	public void setF1(SimpleDateFormat f1) {
		this.f1 = f1;
	}

	public SimpleDateFormat getF2() {
		return f2;
	}

	public void setF2(SimpleDateFormat f2) {
		this.f2 = f2;
	}

	public SimpleDateFormat getTransFormat() {
		return transFormat;
	}

	public void setTransFormat(SimpleDateFormat transFormat) {
		this.transFormat = transFormat;
	}

//	public String getSt_F1() {
//		return st_F1;
//	}
//
//	public void setSt_F1(String st_F1) {
//		this.st_F1 = st_F1;
//	}
//
//	public String getSt_F2() {
//		return st_F2;
//	}
//
//	public void setSt_F2(String st_F2) {
//		this.st_F2 = st_F2;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", [���� �ð�]");
		builder.append(f1);
		builder.append(", [���� �ð�]");
		builder.append(f2);

		return builder.toString();
	}
}