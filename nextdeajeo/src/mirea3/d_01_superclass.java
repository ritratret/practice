package mirea3;
//inheritance 상속
//부모 클래스(super class) + 자신 클래스 (sub class)d
//공통부분을 정의 한 부모-자식이 공용
//부모는 자식을 가리킬 수 있다(제약사항: 부모에 있는 것만 가리킬 수 있음)
//자식이 추가한 내용을 가리킬때는 downcasting 필요(자식으로 환원)
//overriding 재정의
//함수이름, 매개변수 타입, 개수 같으나 재정의를 통해 다른일을 함

class Super_class { //부모
	int num = 20;
	public void display() {
		System.out.println("슈퍼클래스에서 출력");
	}
}

//부모의 함수를 재정의하면 자식에서만 재정의. 부모가 바뀌는건X
//부모의 멤버변수는 재정의 하지 않는 것으로 한다 --> 프로그램이 복잡해짐
public class d_01_superclass extends Super_class{ // 자식이 상속
	int num = 10; //멤버변수 재정의
	public void display() { //메소드 재정의
		System.out.println("서브클래스에서 출력");
	}
	public void my_method() {//자식에서 하나 추가
		d_01_superclass sub = new d_01_superclass();
		sub.display();
		super.display(); //부모 함수가 호출된다
		display();
		System.out.println("자식의 변수: " + sub.num);
		System.out.println("부모의 변수: " + super.num);
		System.out.println("자식의 변수: " + num);
	}

	public static void main(String[] args) {
		d_01_superclass obj = new d_01_superclass(); // 자식 클래스 인스턴스
		obj.display(); //자식함수가 실행
		obj.my_method();

	}

}
