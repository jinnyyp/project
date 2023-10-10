package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 123);
		Student student2 = new Student("이몽룡", 890);
		Student student3 = new Student("성춘향", 2354);
		
		//제네릭 타입 아무것도 안넣어도 되나? 와일드 카드 주로 언제 사용? 두개 사용하는 경우는?
		ArrayList<Student> list = new ArrayList<Student>();
		
		//컴파일러가 AutoBoxing에 의해 기본형이 참조형으로 자동 변
		//list.add(new Student("김철수", 945));
		list.add(student1);
		list.add(student2);
		list.add(student3);
	
		//collection은 인터페이스 collections는 유틸 클래스
		//Collections.sort(list); //list 정렬 오류 뜨는데 이유가 뭐지? 값이 두개라 뭐로 정렬할지 정해줘야 하는건가? 

	//처음부터 끝까지 반복하고자 하면 for each문을 사용하는게 좋다
//	for(Student1 stu : list) {
//		System.out.println(stu.getName());
//		System.out.println(stu.getNumber());
//	}
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
	System.out.println("검색하시궛어여?y , 안할래여n");
	String input = sc.next();
	if(input.equals("y")) { //문자열일 경우 equals로 비교 문자열의 value를 비교
		System.out.println("이름을 입력해 주세요");
		String name = sc.next();
		
		boolean flag = false;
		
		for(Student stu : list) {
			if(name.equals(stu.getName())) {
				System.out.println("학번은 " + stu.getNumber());
				flag = true;
			} 
		}
		
		if(!flag) {
			System.out.println("학생이름 없음");
		}
		
	} else if(input.equals("n")) {
		System.out.println("나가줘");
		break;
	}
	}
	
	
	}

}
