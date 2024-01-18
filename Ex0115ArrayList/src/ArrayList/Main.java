package ArrayList;

import java.util.ArrayList;

import 객체배열.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		// ArrayList
		// : 크기가 가변적인 배열과 같은 형태를 가진 **클래스**
		
		// 1. ArrayList 생성
		// : 레퍼런스 타입의 데이터만 저장할 수 있다.
		// String, Pokemon ... 
		ArrayList<String> list = new ArrayList<String>(); 
		// 제네릭 기법 -> 자바 책 390p
		
		// 2.데이터 추가하기
		list.add("노승우");
		list.add("조은해");
		list.add("정연재");
		
		// 3.데이터가져오기
		System.out.println(list.get(1));
		
		// 4.데이터를 특정위치에 추가하기
		list.add(2, "김상원");
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 5.데이터 삭제하기
		list.remove(2);
		
		System.out.println(list.get(2));
		
		// 6.데이터 크기 알아보기
		list.size();
		System.out.println("list의 크기 : " + list.size());
		
		// 7.데이터 전체 삭제하기
		list.clear();
		System.out.println("list의 크기 : " + list.size());

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
