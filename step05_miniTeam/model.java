package step05_miniTeam;

import step05_miniTeam.tier;

public class model {
	public static tier[] getTier() {
		tier[] a = {
				new tier(0, "브론즈"), 
				new tier(1, "실버"), 
				new tier(2, "골드"), 
				new tier(3, "플레티넘"), 
				new tier(4, "다이아"),
				new tier(5, "챌린저")
				};
		return a;
	}

}