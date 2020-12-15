package step01.util;

import java.util.Arrays;
import java.util.HashMap;


class MyBean {
	private String name = "json";
	private int pojoId = 1;
	private char[] options = new char[] { 'a', 'f' };
	private String func1 = "function(i){ return this.options[i]; }";
	//private JSONFunction func2 = new JSONFunction(new String[] { "i" }, "return this.options[i];");
	@Override
	public String toString() {
		return "MyBean [name=" + name + ", pojoId=" + pojoId + ", options=" + Arrays.toString(options) + ", func1="
				+ func1 + "]";
	}
}	
public class JSONTest {
	public static void main(String[] args) {
		HashMap map2 = new HashMap();
		map2.put("p1", new MyBean());
		//json simple�� lib Ư¡ : map���� ��� ��ü���� toString() ������ json �������� ��ȯ�ؼ� ��ȯ
		//String jsonObject = JSONObject.toJSONString(map2);
				
		//System.out.println(jsonObject); // {"p1":step01.util.MyBean@4554617c}

		System.out.println(" ------------------ ");

//		Map map = new HashMap();
//
//		map.put("name", "json");
//		map.put("bool", Boolean.TRUE);
//		map.put("int", new Integer(1));
//		map.put("arr", new String[] { "a", "b" });
//		map.put("func", "function(i){ return this.arr[i]; }");
//
//		jsonObject = JSONObject.fromObject(map);
//		System.out.println(jsonObject);
		// {"arr":["a","b"],"bool":true,"func":function(i){ return this.arr[i];
		// },"name":"json","int":1}

	}

}
