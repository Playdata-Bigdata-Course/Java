/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationController.java
 * DESC  :  사용자로 부터 받은 요청을 처리하는 클래스
 * 			Model 갱신 및 View 제어
 * 
 * @author  
 * @version 1.0
*/

package probono.controller;

import java.util.ArrayList;

import probono.exception.DuplicateException;
import probono.exception.NotExistException;
import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.service.TalentDonationProjectService;
import probono.view.EndView;
import probono.view.FailView;

public class TalentDonationController {

	private static TalentDonationController instance = new TalentDonationController();
	private TalentDonationProjectService service = TalentDonationProjectService.getInstance();

	private TalentDonationController() {
	}

	public static TalentDonationController getInstance() {
		return instance;
	}

	/**
	 * 모든 프로젝트 검색
	 */
	public void getProjectList() {
		ArrayList<TalentDonationProject> projectList = service.getProjectsList();

		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
		} else {
			EndView.messageView("현재 진행중인 프로젝트는 존재하지 않습니다.");
		}
	}

	// TO DO
	/**
	 * 프로젝트 이름으로 특정 프로젝트 검색
	 * 
	 * @param projectName
	 */
	public void getProject(String projectName) {
		
		if (service.getProject(projectName) != null) {
			EndView.projectView(service.getProject(projectName));
		} else {
			EndView.messageView("검색하는 프로젝트는 존재하지 않습니다.");
		}
	}

	// TO DO
	/**
	 * 새로운 프로젝트 저장
	 * 
	 * @param newProject
	 */
	public void insertProject(TalentDonationProject newProject) {
		if (newProject != null) {
			try {
				service.projectInsert(newProject);
				System.out.println();
			} catch (DuplicateException e) {
				FailView.failMessageView("해당 Project명과 동일한 이름의 Project가 이미 존재하는 문제가 발생했습니다.");
			}
		} else {
			EndView.messageView("새로 저장하고자 하는 프로젝트의 입력 정보가 무효합니다. 재확인 해 주세요");
		}
	}

	/**
	 * 존재하는 프로젝트의 기부자 수정 프로젝트 이름으로 검색해서 해당하는 프로젝트의 기부자 수정
	 * 
	 * @param projectName
	 * @param people
	 */
	public void updateProjectDonator(String projectName, Donator people) {
		if (projectName != null) {
			try {
				service.projectDonatorUpdate(projectName, people);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("수정하고자 하는 기부자 정보가 무효합니다, 재 확인 해 주세요");
		}
	}

	// TO DO
	/**
	 * 존재하는 프로젝트 수혜자 수정 프로젝트 이름으로 검색해서 해당하는 프로젝트의 수혜자 수정
	 * 
	 * @param projectName
	 * @param people
	 */
	public void updateProjectBeneficiary(String projectName, Beneficiary people) {
		if (projectName != null && people != null) {
			try {
				service.projectBeneficiaryUpdate(projectName, people);
			} catch (NotExistException e) {
				e.printStackTrace();
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("수정하고자 하는 수혜자 정보가 무효합니다, 재 확인 해 주세요");
		}
	}

	// TO DO
	/**
	 * 프로젝트 명으로 해당하는 프로젝트 삭제
	 * 
	 * @param projectName
	 */
	public void deleteProject(String projectName) {
		if (projectName != null) {
			try {
				service.projectDelete(projectName);
				//?
			} catch (NotExistException e) {
				FailView.failMessageView("삭제하고자 하는 Project가 미 존재하는 문제가 발생했습니다");
			}
		} else {
			EndView.messageView("검색하는 프로젝트는 존재하지 않습니다.");
		}
	}
}
