package step04.basic;

public class Step01API {

	public static void main(String[] args) {
		/* ���ڿ� ��ü���� ù ������ ����
		 * ��� ���࿡ �ʿ��� ����
		 * 	���ڿ� ��ü/���ڿ��� ù ö�� ��ġ��
		 * 	���ڿ� ��ü(s)/���ڿ��� �� ö�� ��ġ��(0)
		 * 		 char
		 */
		String s = "string";			// s�� string�̶�� ����
		System.out.println(s.length());	// s�� ���̸� ������ ��û
		System.out.println(s.charAt(1));// s�� 2��° ���ڸ� ������ ��û
		
		//? s��� �ҹ��� ö�ڷ� �����ϴ°� �´ٸ� true ���/�ƴ϶�� false ����� �޼ҵ�
		/* ������ - String ��ü
		 * true or false  - ��ȯŸ���� boolean
		 * s �ҹ��ڷ� ����... �ʿ��� �� ������
		 * boolean ?(char c)
		 * boolean ?(String string)
		 * 
		 */
		System.out.println(s.startsWith("s"));
		
		//? ing �� �и��ؼ� ����ϼ���
		/* ���ڿ��� �Ϻθ� ����
		 * string -> ing
		 * �Lȯ ���� ing ���� String
		 * String ?(int index){
		 * 		��ü ���ο��� �Ϻθ� ����...
		 * }
		 * 
		 */
		System.out.println(s.substring(3));
		
		String s2 = "PlayData";	//""String ��ü �ڵ� ����
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		
		System.out.println(Math.random());
		System.out.println(Math.max(4, 7));
	}

}
/* 1. API Ȱ�� ����
 * 2. ���ǹ� & ������
 * 3. �迭 & �ݺ���
 * 
 * 4. mini project(3�� 1�� or 2�� 1��)
 * 	- ��ǥ
 */

