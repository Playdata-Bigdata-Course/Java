package view;
import controller.CustomerController;
public class StartView {

	public static void main(String[] args) {
		System.out.println("-- 1. 모든 고객 정보 검색--");
		CustomerController.reqProcess(1);
		System.out.println("\n-- 2. 저장 후 검색 --");
		CustomerController.reqProcess(5);
		CustomerController.reqProcess(1);
		System.out.println("\n-- 3. 수정 후 검색--");
		CustomerController.reqProcess(3);
		CustomerController.reqProcess(1);
		System.out.println("\n-- 4. 삭제 후 검색--");
		CustomerController.reqProcess(4);
		CustomerController.reqProcess(1);
		System.out.println("\n-- 5. 한명의 고객 정보 검색--");
		CustomerController.reqProcess(2);

	}

}
