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
	 * 모든 Project 검색(반환)
	 * 
	 * @return 모든 Project
	 */
	public ArrayList<ParkingInformation> getInformation() {
		return Data.getInformation();
	}

	// TO DO
	/**
	 * number로 검색 - Project 반환
	 * 
	 * @param projectName 프로젝트 이름
	 * @return TalentDonationProject 검색된 프로젝트, 검색하고자 하는 프로젝트가 없을 경우 null 반환
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
	 * 새로운 ParkingInfomation 추가 새로 저장하고자 하는 주차정보가 이미 존재할 경우 DuplicateException 예외 발생
	 * 
	 * @param newInformation 저장하고자 하는 새로운 프로젝트
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
	 * 주차장의 차량 수정 - 주차장No 명으로 검색해서 해당 No의 차량 수정 수정하고자 하는 No가 존재하지 않을 경우
	 * NotExistException 발생
	 * 
	 * @param no  주차장No
	 * @param car 차량
	 * @throws NotExistException
	 */
	public void InformationCarUpdate(String no, Car name) throws NotExistException {
		ParkingInformation ParkingLot = getInformation(no);

		if (ParkingLot == null) {
			throw new NotExistException("차량 업데이트 하고자 하는 주차장 자리가 미 존재하는 문제가 발생했습니다.");
		} else {
			ParkingLot.setInfoCar(name);
		}
	}

	// TO DO
	/**
	 * 차량의 주차장No 수정 - 차량번호로 검색해서 해당 차량의 주차장 No 수정 수정하고자 하는 차량이 존재하지 않을 경우
	 * NotExistException 발생
	 * 
	 * 
	 */
	public void ParkingNoUpdate(String CarNumber, ParkingLot no) throws NotExistException {
		ParkingInformation Car = getInformation(CarNumber);
		if (CarNumber != null) {
			Car.setInfoParkinglot(no);
			;
		} else {
			throw new NotExistException("자리를 업데이트 하고자 하는 차량이 미 존재하는 문제가 발생했습니다.");
		}
	}

	// TO DO
	/**
	 * 차량 삭제 - 차량 번호으로 해당 차량 주차no삭제
	 * 
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
	public void CarDelete(String CarNumber) throws NotExistException {
		ParkingInformation Car = getInformation(CarNumber);
		if (CarNumber == null) {
			throw new NotExistException("자리를 업데이트 하고자 하는 차량이 미 존재하는 문제가 발생했습니다.");
		} else {
			Data.getInformation().remove(Car);
			EndView.messageView(CarNumber + "차량은 출차 되었습니다.");
		}
	}

}
