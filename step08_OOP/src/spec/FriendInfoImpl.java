package spec;

public class FriendInfoImpl implements FriendInfo{
	
	//재정의 rule - 상위에서 제공한 메소드 선언구를 동일하게 해서 내용만 수정
	public  String getInfo() {
		return "김성호 : " + COMPANY_NAME;
	}
	
	public  String heart() {
		return "띠이용";
	}
	
	public static void main(String[] args) {
		FriendInfo i = new FriendInfoImpl();
		System.out.println(i.getInfo());
		System.out.println(i.heart());
	}

}
