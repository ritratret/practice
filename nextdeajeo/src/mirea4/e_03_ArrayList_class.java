package mirea4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class MemberDto { //클래스는 Object로 상속받음 : clone, equals(== 주소비교), toStirng:참조형으로 클래스를 관리
	public static int hab = 0; //public static함수 하나 만듦 forEach
	//static은 딱 한 번만 만들어지는 변수. (공용변수)
	//성적프로그램에서는 학교나 학생 수
	public int num;
	public String name;
	public String addr;
	public MemberDto() {}
	public MemberDto(int num, String name, String addr) {
		super(); //부모생성자 호출을 습관적으로
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString () {
		return "번호: " + num + " 이름: " + name + " 주소: " + addr;
	}
}



public class e_03_ArrayList_class {
	public static void main(String[] args) {
		//List != ArrayList
		//부모 자식 관계
		//부모가 대신 가리킬 때는 부모에 있는 내용만 가능하다
		List<String> names = new ArrayList<String>();
		names.add("김구리");
		names.add("해골");
		names.add("우끼끼");
		for (int i=0; i<names.size(); i++) {
			String tmp = names.get(i);
			System.out.println(tmp);
		}
		for (String tmp:names) { //확장 for문. tmp에 실제 객체가 나옴
			System.out.println(tmp);
		}
		
		MemberDto dto1 = new MemberDto(1,"김일","둔산동");
		MemberDto dto2 = new MemberDto(2,"김이","행신동");
		MemberDto dto3 = new MemberDto(3,"","둔산동");
		//자료구조 준비
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		System.out.println("ArrayList 출력");
		System.out.println("\t" + members); // MemberDto의 String 형태로 출력된다
		
		for(int i =0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}
		//첫번 째 데이터를 가리키는 포인터를 알려줌 
		//listIterator import
		ListIterator<MemberDto> listIterator2 = members.listIterator(); // 2를 만듦. members에 있는 처음 데이터를 가리킴
		while (listIterator2.hasNext()) { // 다음이 있는지 묻고 다음을 호출. 마지막까지 출력한 뒤라 그 다음 출력할수가 없음 dto1->dto2->dto3
			System.out.println(listIterator2.next()); // 데이터를 선택함
		}
		System.out.println("이터레이터를 거꾸로 출력");
		while (listIterator2.hasPrevious()) { // 이전것이 있는지? 거슬러 올라가듯이. dto3->dto2->dto1
			System.out.println(listIterator2.previous());
		}
		listIterator2 = members.listIterator(); // 처음을 가리킨다
		while (listIterator2.hasNext()) { // 처음으로 갔으니 다시 차례대로 출력함
			System.out.println(listIterator2.next()); 
		}
		
		System.out.println("아래는 람다 함수를 사용한 문장이다");
		//구조적 프로그래밍 -> 객체 지향 프로그래밍 -> 일반화(Generic) 프로그래밍 -> 함수화(forEach) 프로그래밍(for 문 없음)
		//함수화 프로그래밍의 매개변수는 함수가 온다
		//자바에서는 함수 하나를 만들려고해도 class를 만들어야 함.
		//C#에서는 화살표 함수라고 함
		members.forEach(a1 -> {System.out.println(a1.num + " " + a1.name + " " + a1.addr);});// <--클래스 없는데도 함수가 옴. == 람다 함수
		//클래스에서 정의되지않는 간단 함수이자 무명 함수. 일회용. 파이썬 문법임
		//a1가 매개변수. -> 화살표 뒤의 것이 본문 함수내용이다
		
		int hab = 0;
		for(int i =0; i < members.size(); i++) {
			hab += members.get(i).num;
		}
		System.out.println("인덱스를 이용한 번호의 합은 =" + hab);
		//static 변수가 필요
		//forEach문을 이용해 num의 합계를 출력하시오
		MemberDto.hab = 0;
		//클래스 내부의 변수가 static 변수를 사용해서 누적처리함
		members.forEach(a1 -> {MemberDto.hab += a1.num;});
		System.out.println("반복자?를 이용한 번호의 합은  = " +MemberDto.hab);
	}

}
