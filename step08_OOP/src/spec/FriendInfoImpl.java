package spec;

public class FriendInfoImpl implements FriendInfo{
	
	//������ rule - �������� ������ �޼ҵ� ���𱸸� �����ϰ� �ؼ� ���븸 ����
	public  String getInfo() {
		return "�輺ȣ : " + COMPANY_NAME;
	}
	
	public  String heart() {
		return "���̿�";
	}
	
	public static void main(String[] args) {
		FriendInfo i = new FriendInfoImpl();
		System.out.println(i.getInfo());
		System.out.println(i.heart());
	}

}
