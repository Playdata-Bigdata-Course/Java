/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  재능 기부 프로젝트를 자료주고 API를 활용하여 CRUD 처리하는 서비스 로직
 * 
 * @author  
 * @version 1.0
*/

package probono.service;

import java.util.ArrayList;

import probono.exception.DuplicateException;
import probono.exception.NotExistException;
import probono.model.DonationModelVirtualDB;
import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.view.EndView;

public class TalentDonationProjectService {

	private static TalentDonationProjectService instance = new TalentDonationProjectService();
	
	private DonationModelVirtualDB donationProjectsData = DonationModelVirtualDB.getInstance();

	private TalentDonationProjectService() {}

	public static TalentDonationProjectService getInstance() {
		return instance;
	}
	/**
	 * 모든 Project 검색(반환)
	 * 
	 * @return 모든 Project
	 */
	public ArrayList<TalentDonationProject> getProjectsList() {
		return donationProjectsData.getProjectList();
	}

	
	// TO DO
	/** 
	 * Project 이름으로 검색 - Project 반환
	 * 
	 * @param projectName 프로젝트 이름
	 * @return TalentDonationProject 검색된 프로젝트, 검색하고자 하는 프로젝트가 없을 경우 null 반환
	 */
	public TalentDonationProject getProject(String projectName) {
		ArrayList<TalentDonationProject> projects = donationProjectsData.getProjectList();
		
		for(TalentDonationProject p : projects) {
			if(p.getTalentDonationProjectName().equals(projectName)) {
				return p;
			}
		}
		return null;
	}
	

	// TO DO
	/**
	 * 새로운 Project 추가 
	 * 새로 저장하고자 하는 프로젝트가 이미 존재할 경우 DuplicateException 예외 발생
	 * 
	 * @param newProject   저장하고자 하는 새로운 프로젝트
	 * @throws DuplicateException
	 */
	public void projectInsert(TalentDonationProject newProject) throws DuplicateException {
		for(int i = 0;i<getProjectsList().size();i++) {
			if(getProjectsList().get(i).equals(newProject)) {
				throw new DuplicateException();
			}
		}
		donationProjectsData.insertProject(newProject);
	}

	
	/**
	 * Project의 기부자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
	 * 수정하고자 하는 프로젝트가 존재하지 않을 경우 NotExistException 발생
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 기부자 
	 * @throws NotExistException
	 */
	public void projectDonatorUpdate(String projectName, Donator people) throws NotExistException {
		TalentDonationProject project = getProject(projectName);
		
		if(project == null){
			throw new NotExistException("기부자를 업데이트 하고자 하는 Project가 미 존재하는 문제가 발생했습니다.");
		}else {
			project.setProjectDonator(people);
		}
	}

	//TO DO
	/**
	 * Project의 수혜자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
	 * 수정하고자 하는 프로젝트가 존재하지 않을 경우 NotExistException 발생
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 수혜자 
	 * @throws NotExistException
	 */
	public void projectBeneficiaryUpdate(String projectName, Beneficiary people) throws NotExistException {
		TalentDonationProject project = getProject(projectName);
		if(project != null){
			project.setProjectBeneficiary(people);
		}else {
			throw new NotExistException("수혜자를 업데이트 하고자 하는 Project가 미 존재하는 문제가 발생했습니다.");
		}
	}

	
	//TO DO
	/**
	 * Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
	 * 
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
	public void projectDelete(String projectName) throws NotExistException{
		TalentDonationProject project = getProject(projectName);
		if(project == null){
			throw new NotExistException("수혜자를 업데이트 하고자 하는 Project가 미 존재하는 문제가 발생했습니다.");
		}else {
			donationProjectsData.getProjectList().remove(project);
			EndView.messageView(projectName + "삭제성공");
		}
	}

}
