/*
 * 3. 정리
 * 		- index, key 개념이 적용
 * 4. 개별 데이터값을 어떻게 하나씩 하나씩 뽑아서 사용
 * 		- 순차적으로 데이터를 사용가능하게 열거(Iterator)
 * 5. Iterator
 *		Object next() - 존재한다는 가정하에 데이터 반화
 *		boolean hashNext() - 데이터 존재 여부 확인 
 */




package step01.util;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		System.out.println(set);
	}

}
