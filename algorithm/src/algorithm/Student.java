package algorithm;

import java.util.Random;
import java.util.Scanner;

public class Student {
	private String name;
	private int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	//생성자가 있으면 setter가 없ㅇ어도 되는거 아닌가?
	//생성자는 불변의 객체를 생성할 때 사용한
	//setter는 객체의 속성값을 업데이
	
	public Student(String name, int number) {
		super(); //상속인가?
		this.name = name;
		this.number = number;
	}
	

	Scanner sc = new Scanner(System.in);
	
	
	Random r = new Random();
	int num = r.nextInt(10) + 1;
	
	
	//접근 제한자 : public, default(생략), private, protected
	//static, final, 인스턴스 멤
	//static (정적 멤버)는 객체지향의 특징 캡슐화를 위해서 사용하나?
	//heap, call stack(jvm), method area
}