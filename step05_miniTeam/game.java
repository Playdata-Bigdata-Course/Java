package step05_miniTeam;
import step05_miniTeam.score;
import step05_miniTeam.AI;
import step05_miniTeam.model;
public class game {
	static int point;
	public static void game(String a, String b) {
		String r = score.result(a, b);
		System.out.print(r+ " : ");
		if(r == "��") {
			point++;
		} else if(r == "��") {
			point = point + 0;
		} else if(r == "��") {
			point--;
		}
	}
	public static void main(String[] args) {
		System.out.println("�º�   ��   ai");
		String [] array = {"����", "����", "����", "��", "����"};
		for(int i = 0; i<5; i++) {
			String t = AI.random();
			game(array[i], t);
			System.out.println(array[i]+ " "+t);
		}
		if(point<0) {
			point = 0;
		}
		System.out.println(point+"��");
		System.out.println(model.getTier()[point].getTier()+"�Դϴ�");

	}

}