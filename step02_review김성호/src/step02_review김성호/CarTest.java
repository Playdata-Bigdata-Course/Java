package step02_review±è¼ºÈ£;

public class CarTest {

	private static final String String = null;

	public static void main(String[] args) {
	Car c1 = new Car();
	Car c2 = new Car();
	
	c1.name = "¾Æ¹ÝÅ×";
	c2.name = "¼Ò³ªÅ¸";
	c1.number = 4321;
	c2.number = 8765;
	c1.color = "»¡°­";
	c2.color = "ÆÄ¶û";
	
	System.out.println(c1.name);	
	System.out.println(c1.number);
	System.out.println(c1.color);
	
	c1.setName("k3");
	c2.setName("k5");
	c1.setNumber(1234);
	c2.setNumber(5678);
	c1.setColor("Èò");
	c2.setColor("°ËÁ¤");
	
	System.out.println(c1.name);
	System.out.println(c1.number);
	System.out.println(c1.color);
	
	c1.getName();
	c2.getName();
	c1.getNumber();
	c2.getNumber();
	c1.getColor();
	c2.getColor();
	
	System.out.println(c1.getName());
	System.out.println(c1.getNumber());
	System.out.println(c1.getColor());
	}
	
	
	
}


