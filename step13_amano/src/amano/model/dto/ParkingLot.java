package amano.model.dto;

public class ParkingLot {
	/** 주차자리 번호 */
	private String no;
	
	/** 주차구역 이름 */
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
		builder.append("주차자리 번호 : ");
		builder.append(no);
		builder.append(", 주차구역 이름 : ");
		builder.append(area);
		
		return builder.toString();
	}
}