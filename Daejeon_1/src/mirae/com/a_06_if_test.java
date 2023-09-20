package mirae.com;

import java.util.Scanner;

public class a_06_if_test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner는 클래스니까 인스턴스 new 해야함
		// 클래스는 사용자 정의 데이터 타입(멤버변수(클래스마다 만들어짐), 멤버함수(클래스 정의 시 한번만 정의))

		// in은 표준입력장치(키보드)/input에는 주소 들어있음
		// 필요한 데이터는 heap에 생성
		System.out.println("홀짝 판정위한 숫자 입력하세요");
		int num = input.nextInt(); // nextInt는 정수형 데이터 입력받을때 사용
		if (num % 2 == 0)// %는 나머지 연산자 - 경우의 수를 생성할 때 사용(현재는 0,1) 4일경우:0,1,2,3
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");

		// 홀짝 게임..이미 이 자체로도 충분함
		// 헌혈 18세 이상 체중 50kg이상 - 경우의 수 4개
		// 헌혈 가능/나이미만/체중미만/나이와 체중이 미만
		// 변수: 나이, 체중 / 논리연산자 and (&&, >=)
		// if 경우의 수. for 횟수 조정

		System.out.println("나이를 입력하세요");
		int old = input.nextInt();
		System.out.println("체중을 입력하세요");
		int wet = input.nextInt();

		if (old >= 18 && wet >= 50) {
			System.out.println("헌혈이 가능합니다");
		} else if (old < 18 && wet >= 50) {
			System.out.println("나이가 조건에 맞지 않습니다.");
		} else if (old >= 18 && wet < 50) {
			System.out.println("체중이 조건에 맞지 않습니다.");
		} else {
			System.out.println("나이와 체중이 조건에 맞지 않습니다.");
		}

		// 문제: 주급 40시간 까지는 시간당 100,000
		// 40시간 초과일 경우 150,000으로 계산
		// 주 작업시간을 입력하면 계산된 주급 출력
		// 40시간 미만. 40시간 이상

		System.out.println("작업시간을 입력하시오");
		int money = input.nextInt();

		if (money <= 40) {
			System.out.println(money * 100000 + "원 입니다.");
		} else {
			System.out.println(money * 150000 + "원 입니다.");
		}
		
		
		int hours;
		int pay;
		final int basictime = 40; // 상수를 변수화해서 사용한다
		final int paypertime = 100000;
		final int payovertime = 150000;

		System.out.println("주 근무시간을 입력하세요");
		hours = Integer.parseInt(input.nextLine()); // int가 아닌 line으로 적어줘야 한다

		if (hours > basictime) {
			pay = basictime * paypertime;
			pay += (hours - basictime) * payovertime;
		} else {
			pay = hours * paypertime;
		}
		System.out.printf("당신의 주급은 %d원 입니다 \n", pay);
		input.close();

	}
}
