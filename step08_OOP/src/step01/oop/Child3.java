 package step01.oop;

import java.util.ArrayList;

class Parent3 extends Object{
	String id;
	int age;
	void printAll() {
		System.out.println(id);
		System.out.println(age);
	}


	}
public class Child3 extends Parent3{
	String job;
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	
	static Object m() { //Object 변수 = "문자열"; String 객체가 Object로 자동 형변환
		return "문자열";
	}
	
	static void m2() {
		ArrayList al = new ArrayList();
		al.add("혜성");				//String -> Object 변환
		al.add(new Integer(20));	//Integer
		al.add("new Child()");		//Child에는 toString() 재정의 안했음
		
		//반복문 활용해서 각 객체들이 보유한 toString()메소드 호출해서 출력
		//for / print() or println()
		/*질문 1 : toString()는 Object의 메소드가 호출이 될까요?
		 * 		String or Integer 객체라면 String or Integer
		 * 			클래스의 재정의된 toString()가 호출될까요??
		 */
		for(int i=0; i < al.size(); i++) {
			System.out.println(al.get(i).toString()); //index로 데이터 반환
		}
		System.out.println("----");
		System.out.println(al.get(0));
		al.remove(0);
		System.out.println(al.get(0));
	}
	public static void main(String[] args) {
		m2();
		String s = (String) m();
		System.out.println(s.charAt(0));
		/*컴파일 단계
		 * 	- Parent3 컴파일 되고 해당 byte code로 자식클래스 확장
		 * 실행단계
		 * 	- 자식내부에 존재 여부를 확인해서 자식이 메소드를 보유하고 있다면 실행
		 * 	혹여 자식클래스에 해당 메소드가 없다면 부모 클래스의 오리지널 메소드 실행*/ 
		 Parent3 p = new Child3();
		 p.printAll(); //재정의된 자식 클래스의 메소드가 실행
		 p.id = "Tester";
		 p.age = 10;
		 
		 //p.job = "it man";
		 
		 Child3  c = (Child3)p; // 명시적인 형변환
		 c.job = "it man";
		 System.out.println();
		}
	}
