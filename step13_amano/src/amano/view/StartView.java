/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  StartView.java
 * DESC  : 실행 클래스
 * 
 * @author  
 * @version 1.0
*/

package amano.view;

import amano.controller.InformationController;
import amano.model.dto.Car;
import amano.model.dto.ParkingInformation;
import amano.model.dto.ParkingLot;
import amano.model.dto.Parking;

public class StartView {

	public static void main(String[] args) {

		InformationController controller = InformationController.getInstance();

		System.out.println("\n*** 01. 모든 주차현황 검색 ***");
		controller.getInformation();

		System.out.println("\n*** 02.22가2222로 차량 검색  ***");
		controller.getInformation("22나2222");

		System.out.println("\n*** 03. 미존재하는 차량 검색 ***");
		controller.getInformation("22나1111");

		System.out.println("\n*** 04. 새로운 차량 저장 후  모든 주차현황검색 ***");
		ParkingInformation newInformation = new ParkingInformation(new Car("55라5555", "genesis", "대형"),
				new ParkingLot("B3", "일반"), new Parking("12-20 15:00", "12-20 20:00"));
		System.out.println("\n04-1. 저장 전 주차현황 검색");
		controller.getInformation();

		controller.insertInformation(newInformation);

		System.out.println("\n04-2. 저장 후 검색");
		controller.getInformation();

		System.out.println("\n04-3. 이미 저장된 프로젝트 재저장 시도후 유효성 검증의 적합성 검증");
		controller.insertInformation(newInformation);

		// 저장 로직의 유효성 처리 로직 검증
		System.out.println("\n*** 05. 의미없는 데이터인 null로  주차정보 확인 시도 후 유효성 로직의 적합성 검증 ***");
		controller.insertInformation(null);

		// "11가1111"의 주차 구역 변경 후 검색
		System.out.println("\n*** 06. 존재하는 차량 주차구역 변경 후 수정한 내용 검색 ***");
		System.out.println("06-1. 수정 전 '11가1111'차량 검색");
		controller.getInformation("11가1111");
		controller.updateNoInformation("11가1111", new ParkingLot("A5", "일반"));

		System.out.println("\n06-2. 수정 후 프로젝트 검색");
		controller.getInformation("11가1111");

		System.out.println("\n*** 07. 의미없는 데이터인 null로 Project의 수혜자 정보 수정 시도 후 유효성 로직의 적합성 검증 ***");
		controller.updateNoInformation("11가1111", null);

		// '11가1111' 차량 삭제 후 검색
		System.out.println("\n*** 08. '11가1111' 차량 삭제 후 삭제한 차량 검색 ***");
		System.out.println("08-1. 삭제전 차량 검색");
		controller.getInformation();
		controller.deleteCar("11가1111");

		System.out.println("\n08-2. 삭제 후 차량검색 ");
		controller.getInformation();

		System.out.println("\n08-3. 삭제된 차량 재시도 후 유효성 로직의 적합성 검증");
		controller.deleteCar("11가1111");

	}
}
