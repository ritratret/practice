package mirea3;

class Parent {
	int x = 100;

	public void setvalue(int x) {
		this.x = x;
	}

	void method() {
		System.out.println("부모함수");
	}
}

//Parent를 상속한 자식
class Child extends Parent { // 자식1
	int x = 200;

	Child() {
		x = 1000;
	}

	public void setvalue(int x) {
		this.x = x;
	}

	void method() {
		System.out.println("자식 제 1-1 함수: " + x);
	} // 재정의

	void method2() { // 메소드 추가
		System.out.println("자식 제 1-2 함수: " + x);
	}
}

class Child2 extends Parent { // 자식2
	int x = 300;

	Child2() {
		x = 2000;
	}

	public void setvalue(int x) {
		this.x = x;
	}

	void method() {
		System.out.println("자식 제 2-1 함수: " + x);
	} // 재정의

	void method3() {
		System.out.println("자식 제 2-2 함수: " + x);
	}

	public class d_02_inheritance {

		public static void main(String[] args) {
			Child c = new Child();
			Parent p = new Child(); // 부모의 이름으로 인스턴스가 가능하다
			c.method(); // 자식 메소드 실행
			p.method(); // 부모이름이지만 자식이 인스턴스해서 자식 메소드가 실행된다
			c.method2(); // 실행가능
			// p.method2(); <-- 부모가 자식 가리킬 수 O. 부모에 없는건 가리킬 수 없다 그러므로 downcasting해야함 ↓
			Child d = (Child) p; // p를 자식1 으로 downcasting
			d.method2();

			// 배열에서 new 2번 하는 이유
			// 배열이름은 배열의 최선두번지 하나만 가리킨다
			Child ch[] = new Child[3]; // <-- 클래스 배열을 가리킬 주소를 만드는 것 (포인터 공간)
			for (int i = 0; i < 3; i++) {
				ch[i] = new Child(); // <-- 실제 클래스가 데이터를 저장할 공간
			}
			ch[0].setvalue(100);
			ch[1].setvalue(10);
			ch[2].setvalue(20);
			for (int i = 0; i < 3; i++) {
				ch[i].method();
			}
			Parent chp[] = new Parent[6];
			for (int i = 0; i < 3; i++) {
				chp[i] = new Child();
			}
			for (int i = 3; i < 6; i++) {
				chp[i] = new Child2();
			}
			for (int i = 0; i < 6; i++) {
				chp[i].method();
			}
			// Q. 1번 자식의 method2, 2번 자식의 method3을 chp에서 호풀
			// 이를 해결해 보시오?
			Child ch1[] = new Child[3]; // 0,1,2
			Child2 ch2[] = new Child2[3]; // 0,1,2
			for (int i = 0; i < 3; i++) {
				ch1[i] = (Child) chp[i];
				ch1[i].method2();

			}
			for (int i = 3; i < 6; i++) { // 3,4,5
				ch2[i - 3] = (Child2) chp[i];
				ch2[i - 3].method3(); // **ch1이 아닌 ch2에 method3과 Child2가 있음 확인요망

			}
			//자식에 추가된 메소드는 부모에서 자식으로 downcasting 하고 호출해야 됨
		}
	}
}
