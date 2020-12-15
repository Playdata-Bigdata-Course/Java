/* client�� 1 ���ý� - ��� �� ���� �˻� ��û�̶� ����
 * 	       2  ���ý� - �Ѹ��� �� ���� �˻�
 * 		   3  ���� - ����
 * 		   4  ���� - ����
 * 	       5  ���� - ����
 */

package controller;

import java.util.ArrayList;

import model.CustomerModel;
import model.domain.Customer;
import view.EndView;
public class CustomerController {
	private static CustomerModel cm = new CustomerModel();

	public static void reqProcess(int reqNo) {
		if (reqNo == 1) {// ���˻�
			EndView.viewCustAll(cm.getCustomers());
		} else if (reqNo == 2) {
			Customer cust = cm.getCustomer("��ȣ");
			if (cust != null) {
				EndView.viewCust(cust);
			} else {
				EndView.invalidateReq("�ش� ���� �������� �ʽ��ϴ�");
			}
		} else if (reqNo == 3) {
			boolean result = cm.update("��ȣ", "�����");
			if (result == true) {
				EndView.validateReq("�� ��� ���� �Ϸ�");
			} else {
				EndView.invalidateReq("�������� �ʴ� ���� ��� ������ �õ��Ͽ����ϴ�");
			}
		} else if (reqNo == 4) {
			String id = "����";
			int result = cm.delete(id);
			if (result == 1) {
				EndView.validateReq("�� ���� �Ϸ� " +  id);
			}
		} else if (reqNo == 5) {
			try {
				cm.insert(new Customer("�ٺ�", 22, "vvip"));
				EndView.validateReq("����ϿϷ�");
			} catch (Exception e) {
				e.printStackTrace();// �����ڹ� ���� �����ڸ� Ȯ�� ������ �޼���
				EndView.invalidateReq("�ߺ� id�� �����մϴ�");// client���� ���� �޼���
			}
		} else {
			EndView.invalidateReq("��û�� ���յǴ� ���񽺰� ����");
		}
	}
}
