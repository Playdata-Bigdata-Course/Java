package amano.model.dto;

public class ParkingLot {
	/** �����ڸ� ��ȣ */
	private String no;
	
	/** �������� �̸� */
	private String area;
			
	public ParkingLot() {}
	public ParkingLot(String no, String area) {
		super();
		this.no = no;
		this.area = area;
	}

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("�����ڸ� ��ȣ : ");
		builder.append(no);
		builder.append(", �������� �̸� : ");
		builder.append(area);
		
		return builder.toString();
	}
}