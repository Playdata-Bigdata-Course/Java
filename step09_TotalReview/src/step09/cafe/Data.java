package step09.cafe;
import step09.cafe.Menu;

public class Data {
	public static Menu [] getMenus() {
		Menu [] all = {new Menu("아메리카노", 2000),
				       new Menu("까페라테", 2500),
				       new Menu("카라멜마키아토", 3000)
		};
		return all;
	}
}
