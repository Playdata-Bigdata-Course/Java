/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationController.java
 * DESC  :  ����ڷ� ���� ���� ��û�� ó���ϴ� Ŭ����
 * 			Model ���� �� View ����
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
	 * ��� ������Ʈ �˻�
	 */
	public void getProjectList() {
		ArrayList<TalentDonationProject> projectList = service.getProjectsList();

		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
		} else {
			EndView.messageView("���� �������� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	// TO DO
	/**
	 * ������Ʈ �̸����� Ư�� ������Ʈ �˻�
	 * 
	 * @param projectName
	 */
	public void getProject(String projectName) {
		
		if (service.getProject(projectName) != null) {
			EndView.projectView(service.getProject(projectName));
		} else {
			EndView.messageView("�˻��ϴ� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	// TO DO
	/**
	 * ���ο� ������Ʈ ����
	 * 
	 * @param newProject
	 */
	public void insertProject(TalentDonationProject newProject) {
		if (newProject != null) {
			try {
				service.projectInsert(newProject);
				System.out.println();
			} catch (DuplicateException e) {
				FailView.failMessageView("�ش� Project��� ������ �̸��� Project�� �̹� �����ϴ� ������ �߻��߽��ϴ�.");
			}
		} else {
			EndView.messageView("���� �����ϰ��� �ϴ� ������Ʈ�� �Է� ������ ��ȿ�մϴ�. ��Ȯ�� �� �ּ���");
		}
	}

	/**
	 * �����ϴ� ������Ʈ�� ����� ���� ������Ʈ �̸����� �˻��ؼ� �ش��ϴ� ������Ʈ�� ����� ����
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
			EndView.messageView("�����ϰ��� �ϴ� ����� ������ ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
		}
	}

	// TO DO
	/**
	 * �����ϴ� ������Ʈ ������ ���� ������Ʈ �̸����� �˻��ؼ� �ش��ϴ� ������Ʈ�� ������ ����
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
			EndView.messageView("�����ϰ��� �ϴ� ������ ������ ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
		}
	}

	// TO DO
	/**
	 * ������Ʈ ������ �ش��ϴ� ������Ʈ ����
	 * 
	 * @param projectName
	 */
	public void deleteProject(String projectName) {
		if (projectName != null) {
			try {
				service.projectDelete(projectName);
				//?
			} catch (NotExistException e) {
				FailView.failMessageView("�����ϰ��� �ϴ� Project�� �� �����ϴ� ������ �߻��߽��ϴ�");
			}
		} else {
			EndView.messageView("�˻��ϴ� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}
}
