package annotation.test;

import lombok.Data;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
@Data //기본생성자 + get/setXxx 자동 생성
public class PeopleDTO {
	private String id;
	private int pw;
	
	
//	public PeopleDTO() {}//@NoArgsConstructor
//
//	//@AllArgsConstructor
//	public PeopleDTO(String id, int pw) {
//		super();
//		this.id = id;
//		this.pw = pw;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public int getPw() {
//		return pw;
//	}
//	public void setPw(int pw) {
//		this.pw = pw;
//	}

	
	
}
