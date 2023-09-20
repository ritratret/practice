package mirae.com;

import java.util.Scanner;
public class a_11_while {

	public static void main(String[] args) {
		//0.99999 * 100. 1~100까지의 수가 나옴 => 99.9999...소숫점 없애면 100까지 표현가능
		int answer = (int) (Math.random() * 100) + 1; // 컴퓨터가 랜덤한 수 선택
		int input = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~100사이의 숫자 하나 입력하세요(7회)");
		
		do {
			count++;
			input = sc.nextInt();
			
			if (answer > input) {
				System.out.println("up");
			}else if (answer < input) {
				System.out.println("down");
			}else {
				System.out.println("정답입니다");
				System.out.println("입력하신 횟수는 " +count+"입니다");
				break;
			}
			if (count>7) {
				System.out.println("정해진 횟수를 초과하였습니다(당신은 loser~)");
				break; // 7회 제한
			}
		} while(true); // 무한루프
		
		//문제: 여러번 진행을 원함. 끝날 시 전 승 패 라고 출력
		

	}

}
