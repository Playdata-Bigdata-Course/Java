package step09.cafe;
import step09.cafe.Data;
public class Func {
	static int price;
	static int total;
	static int a;
	static int l;
	static int c;
	public static void choice(String pick) {
			if(pick.equals(Data.getMenus()[0].getMenu())) {
				a+=1;
				price = Data.getMenus()[0].getPrice();
				total+= price;
			} else if(pick.equals(Data.getMenus()[1].getMenu())) {
				l+=1;
				price = Data.getMenus()[1].getPrice();
				total+= price;
			} else if(pick.equals(Data.getMenus()[2].getMenu())) {
				c+=1;
				price = Data.getMenus()[2].getPrice();
				total+= price;
			}
			System.out.println(pick+" �ֹ��Ǿ����ϴ�."+" " +price+"���Դϴ�.");
			
	}
	public static void today() {
		System.out.println(Data.getMenus()[0].getMenu()+"�� �� "+a+"�� �ֹ��߽��ϴ�.");
		System.out.println(Data.getMenus()[1].getMenu()+"�� �� "+l+"�� �ֹ��߽��ϴ�.");
		System.out.println(Data.getMenus()[2].getMenu()+"�� �� "+c+"�� �ֹ��߽��ϴ�.");
		System.out.println("���� �� ������"+" " +total+"�� �Դϴ�.");
	}

}
