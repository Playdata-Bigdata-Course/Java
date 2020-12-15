/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  RunningEndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package amano.view;

import java.util.ArrayList;

import amano.model.dto.ParkingInformation;

public class EndView {

	// 진행중인 특정 프로젝트 출력
	public static void informationView(ParkingInformation information) {
		if (information != null) {
			System.out.println(information);
		} else {
			System.out.println("해당 프로젝트는 존재하지 않습니다.");
		}
	}

	// 진행중인 모든 프로젝트 출력
	public static void projectListView(ArrayList<ParkingInformation> allInformation) {
		for (ParkingInformation information : allInformation) {
			System.out.println(information);
		}
	}

	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

}
