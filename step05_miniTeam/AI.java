
/*
 * Math.random()�� �̿��Ͽ� 0 or 1 or 2�� ����
 */
package step05_miniTeam;

public class AI  {
	
	public static String random() {
		String[] array = {"����", "����", "��"};
		
		return array[(int) (Math.random() * 3)];
	}
}
