/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  ��� ��� ������Ʈ�� �ڷ��ְ� API�� Ȱ���Ͽ� CRUD ó���ϴ� ���� ����
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
	 * ��� Project �˻�(��ȯ)
	 * 
	 * @return ��� Project
	 */
	public ArrayList<TalentDonationProject> getProjectsList() {
		return donationProjectsData.getProjectList();
	}

	
	// TO DO
	/** 
	 * Project �̸����� �˻� - Project ��ȯ
	 * 
	 * @param projectName ������Ʈ �̸�
	 * @return TalentDonationProject �˻��� ������Ʈ, �˻��ϰ��� �ϴ� ������Ʈ�� ���� ��� null ��ȯ
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
	 * ���ο� Project �߰� 
	 * ���� �����ϰ��� �ϴ� ������Ʈ�� �̹� ������ ��� DuplicateException ���� �߻�
	 * 
	 * @param newProject   �����ϰ��� �ϴ� ���ο� ������Ʈ
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
	 * Project�� ����� ���� - ������Ʈ ������ �˻��ؼ� �ش� ������Ʈ�� ����� ����
	 * �����ϰ��� �ϴ� ������Ʈ�� �������� ���� ��� NotExistException �߻�
	 * 
	 * @param projectName ������Ʈ �̸�
	 * @param people ����� 
	 * @throws NotExistException
	 */
	public void projectDonatorUpdate(String projectName, Donator people) throws NotExistException {
		TalentDonationProject project = getProject(projectName);
		
		if(project == null){
			throw new NotExistException("����ڸ� ������Ʈ �ϰ��� �ϴ� Project�� �� �����ϴ� ������ �߻��߽��ϴ�.");
		}else {
			project.setProjectDonator(people);
		}
	}

	//TO DO
	/**
	 * Project�� ������ ���� - ������Ʈ ������ �˻��ؼ� �ش� ������Ʈ�� ������ ����
	 * �����ϰ��� �ϴ� ������Ʈ�� �������� ���� ��� NotExistException �߻�
	 * 
	 * @param projectName ������Ʈ �̸�
	 * @param people ������ 
	 * @throws NotExistException
	 */
	public void projectBeneficiaryUpdate(String projectName, Beneficiary people) throws NotExistException {
		TalentDonationProject project = getProject(projectName);
		if(project != null){
			project.setProjectBeneficiary(people);
		}else {
			throw new NotExistException("�����ڸ� ������Ʈ �ϰ��� �ϴ� Project�� �� �����ϴ� ������ �߻��߽��ϴ�.");
		}
	}

	
	//TO DO
	/**
	 * Project ���� - ������Ʈ ������ �ش� ������Ʈ ����
	 * 
	 * @param projectName �����ϰ��� �ϴ� ������Ʈ �̸�
	 */
	public void projectDelete(String projectName) throws NotExistException{
		TalentDonationProject project = getProject(projectName);
		if(project == null){
			throw new NotExistException("�����ڸ� ������Ʈ �ϰ��� �ϴ� Project�� �� �����ϴ� ������ �߻��߽��ϴ�.");
		}else {
			donationProjectsData.getProjectList().remove(project);
			EndView.messageView(projectName + "��������");
		}
	}

}
