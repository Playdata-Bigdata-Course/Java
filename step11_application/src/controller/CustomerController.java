/* client가 1 선택시 - 모든 고객 정보 검색 요청이라 간주
 * 	       2  선택시 - 한명의 고객 정보 검색
 * 		   3  선택 - 수정
 * 		   4  선택 - 삭제
 * 	       5  선택 - 저장
 */

package controller;

import java.util.ArrayList;

import model.CustomerModel;
import model.domain.Customer;
import view.EndView;
public class CustomerController {
	private static CustomerModel cm = new CustomerModel();

	public static void reqProcess(int reqNo) {
		if (reqNo == 1) {// 모든검색
			EndView.viewCustAll(cm.getCustomers());
		} else if (reqNo == 2) {
			Customer cust = cm.getCustomer("성호");
			if (cust != null) {
				EndView.viewCust(cust);
			} else {
				EndView.invalidateReq("해당 고객은 존재하지 않습니다");
			}
		} else if (reqNo == 3) {
			boolean result = cm.update("성호", "브론즈");
			if (result == true) {
				EndView.validateReq("고객 등급 수정 완료");
			} else {
				EndView.invalidateReq("존재하지 않는 고객의 등급 수정을 시도하였습니다");
			}
		} else if (reqNo == 4) {
			String id = "민재";
			int result = cm.delete(id);
			if (result == 1) {
				EndView.validateReq("고객 삭제 완료 " +  id);
			}
		} else if (reqNo == 5) {
			try {
				cm.insert(new Customer("바보", 22, "vvip"));
				EndView.validateReq("고객등록완료");
			} catch (Exception e) {
				e.printStackTrace();// 개발자및 서버 관리자만 확인 가능한 메세지
				EndView.invalidateReq("중복 id가 존재합니다");// client에게 응답 메세지
			}
		} else {
			EndView.invalidateReq("요청에 부합되는 서비스가 없다");
		}
	}
}
