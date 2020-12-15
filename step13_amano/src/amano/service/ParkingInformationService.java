package amano.service;

import java.util.ArrayList;

import amano.exception.DuplicateException;
import amano.exception.NotExistException;
import amano.model.AmanoModelVirtualDB;
import amano.model.dto.ParkingInformation;
import amano.model.dto.Car;
import amano.model.dto.ParkingLot;

import amano.view.EndView;

public class ParkingInformationService {

	private static ParkingInformationService instance = new ParkingInformationService();

	private AmanoModelVirtualDB Data = AmanoModelVirtualDB.getInstance();

	private ParkingInformationService() {
	}

	public static ParkingInformationService getInstance() {
		return instance;
	}

	/**
	 * ��� Project �˻�(��ȯ)
	 * 
	 * @return ��� Project
	 */
	public ArrayList<ParkingInformation> getInformation() {
		return Data.getInformation();
	}

	// TO DO
	/**
	 * number�� �˻� - Project ��ȯ
	 * 
	 * @param projectName ������Ʈ �̸�
	 * @return TalentDonationProject �˻��� ������Ʈ, �˻��ϰ��� �ϴ� ������Ʈ�� ���� ��� null ��ȯ
	 */
	public ParkingInformation getInformation(String number) {
		ArrayList<ParkingInformation> informations = Data.getInformation();

		for (ParkingInformation i : informations) {
			if (i.getInfoCar().getNumber().equals(number)) {
				return i;
			}
		}
		return null;
	}

	// TO DO
	/**
	 * ���ο� ParkingInfomation �߰� ���� �����ϰ��� �ϴ� ���������� �̹� ������ ��� DuplicateException ���� �߻�
	 * 
	 * @param newInformation �����ϰ��� �ϴ� ���ο� ������Ʈ
	 * @throws DuplicateException
	 */
	public void insertInformation(ParkingInformation newInformation) throws DuplicateException {
		for (int i = 0; i < getInformation().size(); i++) {
			if (getInformation().get(i).equals(newInformation)) {
				throw new DuplicateException();
			}
		}
		Data.insertInformation(newInformation);
	}

	/**
	 * �������� ���� ���� - ������No ������ �˻��ؼ� �ش� No�� ���� ���� �����ϰ��� �ϴ� No�� �������� ���� ���
	 * NotExistException �߻�
	 * 
	 * @param no  ������No
	 * @param car ����
	 * @throws NotExistException
	 */
	public void InformationCarUpdate(String no, Car name) throws NotExistException {
		ParkingInformation ParkingLot = getInformation(no);

		if (ParkingLot == null) {
			throw new NotExistException("���� ������Ʈ �ϰ��� �ϴ� ������ �ڸ��� �� �����ϴ� ������ �߻��߽��ϴ�.");
		} else {
			ParkingLot.setInfoCar(name);
		}
	}

	// TO DO
	/**
	 * ������ ������No ���� - ������ȣ�� �˻��ؼ� �ش� ������ ������ No ���� �����ϰ��� �ϴ� ������ �������� ���� ���
	 * NotExistException �߻�
	 * 
	 * 
	 */
	public void ParkingNoUpdate(String CarNumber, ParkingLot no) throws NotExistException {
		ParkingInformation Car = getInformation(CarNumber);
		if (CarNumber != null) {
			Car.setInfoParkinglot(no);
			;
		} else {
			throw new NotExistException("�ڸ��� ������Ʈ �ϰ��� �ϴ� ������ �� �����ϴ� ������ �߻��߽��ϴ�.");
		}
	}

	// TO DO
	/**
	 * ���� ���� - ���� ��ȣ���� �ش� ���� ����no����
	 * 
	 * @param projectName �����ϰ��� �ϴ� ������Ʈ �̸�
	 */
	public void CarDelete(String CarNumber) throws NotExistException {
		ParkingInformation Car = getInformation(CarNumber);
		if (CarNumber == null) {
			throw new NotExistException("�ڸ��� ������Ʈ �ϰ��� �ϴ� ������ �� �����ϴ� ������ �߻��߽��ϴ�.");
		} else {
			Data.getInformation().remove(Car);
			EndView.messageView(CarNumber + "������ ���� �Ǿ����ϴ�.");
		}
	}

}
