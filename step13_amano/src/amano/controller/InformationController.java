package amano.controller;

import java.util.ArrayList;

import amano.exception.DuplicateException;
import amano.exception.NotExistException;
import amano.model.dto.Car;
import amano.model.dto.ParkingInformation;
import amano.model.dto.ParkingLot;
import amano.service.ParkingInformationService;
import amano.view.EndView;
import amano.view.FailView;

public class InformationController {
	private static InformationController instance = new InformationController();
	private ParkingInformationService service = ParkingInformationService.getInstance();
	private InformationController() {}
	public static InformationController getInstance() {
		return instance;
	}
	
	/**
	 * ��� ������Ȳ �˻�
	 */
	public void getInformation() {
		ArrayList<ParkingInformation> information = service.getInformation();
		
		if (information.size() != 0) {
			EndView.projectListView(information);
		}else {
			EndView.messageView("���� �������� ������ �������� �ʽ��ϴ�.");
		}
	}
	
	// TO DO
		/**
		 *������ȣ�� �������� �˻�
		 * 
		 * @param number
		 */
		public void getInformation(String number) {
			
			if (service.getInformation(number)!= null) {
				EndView.informationView(service.getInformation(number));
			} else {
				EndView.messageView("�˻��Ͻ� ������ �������� �ʽ��ϴ�.");
			}
		}
		
		// TO DO
		/**
		 *������������ �����˻�
		 * 
		 * @param no
		 */
		public void getCarInformation(String no) {
			
			if (service.getInformation(no)!= null) {
				EndView.informationView(service.getInformation(no));
			} else {
				EndView.messageView("�˻��Ͻ� ������ ������ �������� �ʽ��ϴ�.");
			}
		}
		
	/**
	 * ���ο� �������� ����
	 */
	public void insertInformation(ParkingInformation newInformation) {
		if(newInformation != null) {
			try {
				service.insertInformation(newInformation);
				System.out.println();
				} catch(DuplicateException e) {
					FailView.failMessageView("�ش� ������ �̹� �������Դϴ�." );
				}
		} else {
			EndView.messageView("���� �����ϰ��� �ϴ� ������ ������ ��ȿ�մϴ�. ��Ȯ�� �� �ּ���");
		}
	}
	
	/**
	 * �������� �������� - ������no ������ �˻� > �ش� no�� ���� ����
	 */
	public void updateCarInformation(String no, Car name) {
		if (no != null) {
			try {
				service.InformationCarUpdate(no, name);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("�����ϰ��� �ϴ� ������ �ڸ��� ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
		}
	}
	
	/**
	 * ������ ������ �������� ���� - ���� number�� �˻� > �ش� ������ no ����
	 */
	public void updateNoInformation(String CarNumber, ParkingLot no) {
		if(CarNumber != null && no != null) {
			try {
				service.ParkingNoUpdate(CarNumber, no);
			} catch (NotExistException e) {
				e.printStackTrace();
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("�����ϰ��� �ϴ� ���������� ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
		}
	}
	
	
	/**
	 * ���� ���� - ���� ��ȣ�� �ش� ���� ������������ + ������� ����
	 */
	public void deleteCar(String CarNumber) {
		if (CarNumber != null) {
			try {
				service.CarDelete(CarNumber);
			} catch (NotExistException e) {
				FailView.failMessageView("���� �ϰ��� �ϴ� ������ �� �����ϴ� ������ �߻��߽��ϴ�.");
			}
		} else {
			EndView.messageView("");
		}
	}
}
