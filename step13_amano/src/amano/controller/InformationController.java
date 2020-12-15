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
	 * 모든 주차현황 검색
	 */
	public void getInformation() {
		ArrayList<ParkingInformation> information = service.getInformation();
		
		if (information.size() != 0) {
			EndView.projectListView(information);
		}else {
			EndView.messageView("현재 주차중인 차량은 존재하지 않습니다.");
		}
	}
	
	// TO DO
		/**
		 *차량번호로 주차구역 검색
		 * 
		 * @param number
		 */
		public void getInformation(String number) {
			
			if (service.getInformation(number)!= null) {
				EndView.informationView(service.getInformation(number));
			} else {
				EndView.messageView("검색하신 차량은 존재하지 않습니다.");
			}
		}
		
		// TO DO
		/**
		 *주차구역으로 차량검색
		 * 
		 * @param no
		 */
		public void getCarInformation(String no) {
			
			if (service.getInformation(no)!= null) {
				EndView.informationView(service.getInformation(no));
			} else {
				EndView.messageView("검색하신 구역엔 차량은 존재하지 않습니다.");
			}
		}
		
	/**
	 * 새로운 주차정보 저장
	 */
	public void insertInformation(ParkingInformation newInformation) {
		if(newInformation != null) {
			try {
				service.insertInformation(newInformation);
				System.out.println();
				} catch(DuplicateException e) {
					FailView.failMessageView("해당 차량은 이미 주차중입니다." );
				}
		} else {
			EndView.messageView("새로 저장하고자 하는 차량의 정보가 무효합니다. 재확인 해 주세요");
		}
	}
	
	/**
	 * 주차장의 차량수정 - 주차장no 명으로 검색 > 해당 no의 차량 수정
	 */
	public void updateCarInformation(String no, Car name) {
		if (no != null) {
			try {
				service.InformationCarUpdate(no, name);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("수정하고자 하는 주차장 자리가 무효합니다, 재 확인 해 주세요");
		}
	}
	
	/**
	 * 주차된 차량의 주차구역 수정 - 차량 number로 검색 > 해당 차량의 no 수정
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
			EndView.messageView("수정하고자 하는 차량정보가 무효합니다, 재 확인 해 주세요");
		}
	}
	
	
	/**
	 * 차량 삭제 - 차량 번호로 해당 차량 주차정보삭제 + 주차요금 띄우기
	 */
	public void deleteCar(String CarNumber) {
		if (CarNumber != null) {
			try {
				service.CarDelete(CarNumber);
			} catch (NotExistException e) {
				FailView.failMessageView("출차 하고자 하는 차량이 미 존재하는 문제가 발생했습니다.");
			}
		} else {
			EndView.messageView("");
		}
	}
}
