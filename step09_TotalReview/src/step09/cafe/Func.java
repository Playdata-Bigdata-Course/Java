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
			System.out.println(pick+" 주문되었습니다."+" " +price+"원입니다.");
			
	}
	public static void today() {
		System.out.println(Data.getMenus()[0].getMenu()+"는 총 "+a+"잔 주문했습니다.");
		System.out.println(Data.getMenus()[1].getMenu()+"는 총 "+l+"잔 주문했습니다.");
		System.out.println(Data.getMenus()[2].getMenu()+"는 총 "+c+"잔 주문했습니다.");
		System.out.println("오늘 총 매출은"+" " +total+"원 입니다.");
	}

}
