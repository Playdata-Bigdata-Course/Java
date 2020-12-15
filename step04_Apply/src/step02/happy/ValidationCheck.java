package step02.happy;

import model.domain.Car;

/* //? Car 고객 정보가 있다 가정
 * 차 넘버 5678
 * 검색 이름이 5678이면  차종과  색상이 결합해서 반환
 * 		   5678이 아니라면 "없어" 라고 반환
 */
public class ValidationCheck {
	public static String numberCheck(int searchNumber) {
		Car c = new Car(5678, "avante", "white");
		if (c.getNumber() == (searchNumber)) {
			return c.getCarName() + "  " + c.getColor();
		} else {
			return "없어";
		}
	}

	public static void main(String[] args) {
		System.out.println(numberCheck(5678));
		System.out.println(numberCheck(1111));
	}

}