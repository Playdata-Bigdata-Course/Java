
/*
 * Math.random()을 이용하여 0 or 1 or 2를 리턴
 */
package step05_miniTeam;

public class AI  {
	
	public static String random() {
		String[] array = {"가위", "바위", "보"};
		
		return array[(int) (Math.random() * 3)];
	}
}
