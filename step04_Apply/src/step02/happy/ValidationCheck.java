package step02.happy;

import model.domain.Car;

/* //? Car �� ������ �ִ� ����
 * �� �ѹ� 5678
 * �˻� �̸��� 5678�̸�  ������  ������ �����ؼ� ��ȯ
 * 		   5678�� �ƴ϶�� "����" ��� ��ȯ
 */
public class ValidationCheck {
	public static String numberCheck(int searchNumber) {
		Car c = new Car(5678, "avante", "white");
		if (c.getNumber() == (searchNumber)) {
			return c.getCarName() + "  " + c.getColor();
		} else {
			return "����";
		}
	}

	public static void main(String[] args) {
		System.out.println(numberCheck(5678));
		System.out.println(numberCheck(1111));
	}

}