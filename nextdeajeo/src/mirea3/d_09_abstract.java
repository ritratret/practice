package mirea3;
//abstract(일부 함수가 구현이 안된 것)/ interface(모든 함수가 구현이 없는 것)

//자바는 구현이 안된 함수에는 abstract를 붙임
//abstract class: 추상 클래스
//추상 클래스는 인스턴스 할 수 없음. 다만 부모는 가능하다
//추상함수를 만드는 이유?
//**상속받은 자식은 반드시 재정의 하라고

abstract class Weapon {
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}

	public abstract void attack(); // **반드시 재정의 해줘야만 실행할 수 있다. 구현부가 없으면 붙여줘야한다.(추상)
}

class MyWeapon extends Weapon {
	@Override // 재정의한다 @Override (annotation)
	public void attack() {
		System.out.println("김구라를 공격해요");
	}
} // 괄호도 잘 확인해보기
	class YourWeapon extends Weapon {
		@Override // 재정의
		public void attack() {
			System.out.println("원숭이를 공격해요");
		}
	}

	public class d_09_abstract {
		public static void useWeapon(Weapon w) {
			w.prepare();
			w.attack();
		}

		public static void main(String[] args) {
			// Weapon we = new Weapon(); 추상 클래스는 인스턴스가 안되나
			Weapon we = new YourWeapon(); // 부모로서 자식을 가리킬 수는 있음
			MyWeapon w1 = new MyWeapon();
			w1.prepare();
			w1.attack();
			YourWeapon w2 = new YourWeapon();
			w2.prepare();
			w2.attack();

			useWeapon(w1);
			useWeapon(w2);
		}

	}


