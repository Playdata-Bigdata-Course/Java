package step05_miniTeam;

public class score {
	static String a;
	public static String result(String A, String B) {
		
		if (A == "가위") {
			if (B == "가위") {
				a= "무";
			}else if(B == "바위") {
				a = "패";
			}else if(B == "보") {
				a = "승";
			}
		} else if(A == "바위") {
			if (B == "가위") {
				a = "승";
			}else if(B == "바위") {
				a = "패";
			}
		}else if(A == "보") {
			if(B == "가위" ) {
				a =  "패";
			}else if(B == "바위") {
				a =  "승";
			}else if(B == "보") {
				a = "무";
						
			}
		}
		return a;		
						
	}

}
