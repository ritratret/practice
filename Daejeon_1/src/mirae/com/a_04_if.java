package mirae.com;

import java.util.Scanner;

public class a_04_if {

	public static void main(String[] args) {
		boolean c = true; // boolean 결과는 true, false
		c = !c; // c의 반대. true(1)의 반대 false(0)
		System.out.println(c);
		c = !c;
		System.out.println(c);

		int a = 10;
		int b = 10;
		b = 5;
		int d = 20;
		System.out.println(a < b && a < d); // false and true --> false
		System.out.println(a < b & a < d); // false bit연산자and true --> false
		System.out.println(a < b || a < d); // false or true --> true

		// 경우의 수가 3가지
		int number = -13;
		if (number > 0) { // number이 0보다 클 때 true
			System.out.println("긍정 POSITIVE");
		} else if (number < 0) { // 0보다 작을 때 true
			System.out.println("부정 NEGATIVE");
		} else { // 아무것도 아닐때 조건식 없음.
			System.out.println("ZERO");
		}
		
		int day = 3;
		switch (day) { //switch문. day값에 해당되는 case를 출력
		case 1: System.out.println("Monday"); break; //break가 없을 시 다음 case로 넘어가게된다
		case 2: System.out.println("Thusday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		}
		

	}

}
