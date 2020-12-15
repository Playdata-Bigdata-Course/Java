package step05_miniTeam;
import step05_miniTeam.score;
import step05_miniTeam.AI;
import step05_miniTeam.model;
public class game {
	static int point;
	public static void game(String a, String b) {
		String r = score.result(a, b);
		System.out.print(r+ " : ");
		if(r == "승") {
			point++;
		} else if(r == "무") {
			point = point + 0;
		} else if(r == "패") {
			point--;
		}
	}
	public static void main(String[] args) {
		System.out.println("승부   나   ai");
		String [] array = {"가위", "가위", "바위", "보", "바위"};
		for(int i = 0; i<5; i++) {
			String t = AI.random();
			game(array[i], t);
			System.out.println(array[i]+ " "+t);
		}
		if(point<0) {
			point = 0;
		}
		System.out.println(point+"점");
		System.out.println(model.getTier()[point].getTier()+"입니다");

	}

}