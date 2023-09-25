package mirea3;

//인터페이스도 인스턴스는 안되나 부모로서 자식을 가리킬 수는 있음
interface MyInterface {
	public String hello = "인터페이스 변수는 기본으로 public static final" + "접근이 가능";
	//final은 변경이 불가능하다는 뜻 
	public void sayHello(); // 구현부가 없는 것
	//interface가 있으니 astract없어도 된다
}

class MyInterfaceImp1 implements MyInterface { 
	// implements (구현한다) <--interface (다중상속이 가능)
	public void sayHello() {
		System.out.println(MyInterface.hello);
	}
}


public class d_10_interface {
	public static void main(String[ ] args) {
		System.out.println(MyInterface.hello);
		MyInterface myinterface = new MyInterfaceImp1();
		myinterface.sayHello();
		//인터페이스는 인스턴스 불가능, 배열로 자식을 가리킬 수 있음
		MyInterface [] mydim = new MyInterface[2];
		mydim[0] = new MyInterfaceImp1();
		mydim[1] = new MyInterfaceImp1();
	}

}
