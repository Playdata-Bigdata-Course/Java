package step05_miniTeam;

public class score {
	static String a;
	public static String result(String A, String B) {
		
		if (A == "����") {
			if (B == "����") {
				a= "��";
			}else if(B == "����") {
				a = "��";
			}else if(B == "��") {
				a = "��";
			}
		} else if(A == "����") {
			if (B == "����") {
				a = "��";
			}else if(B == "����") {
				a = "��";
			}
		}else if(A == "��") {
			if(B == "����" ) {
				a =  "��";
			}else if(B == "����") {
				a =  "��";
			}else if(B == "��") {
				a = "��";
						
			}
		}
		return a;		
						
	}

}
