package mirae.com;

import java.util.Scanner;

public class a_12_while_game {
	
	// 문제: 여러번 진행을 원함. 끝날 시 전 승 패 라고 출력
	//중지하는것, 승리, 패배 end win lose

	public static void main(String[] args) {
		// 0.99999 * 100. 1~100까지의 수가 나옴 => 99.9999...소숫점 없애면 100까지 표현가능
		 // 컴퓨터가 랜덤한 수 선택
		int input = 0;
		String temp = "";
		int end = 0; //전
		int win = 0; // 승
		//패 는 플레이한 판의 횟수에 이긴횟수를 제외한 값
		Scanner sc = new Scanner(System.in);

		

		while (true) { // while이 무한정 반복되어짐. 그래서 종료조건을 만들어야함
			
			System.out.println("게임을 하시겠습니까? Y/N");
			temp=sc.nextLine(); // 문자
			if(temp.isEmpty() || temp.equals("N")) { // 빈칸이거나, N을 누르면 break된다
				break;
			}
			
			
			int answer = (int) (Math.random() * 100) + 1; // 문제하나가 생기면서 판 횟수 증가
			end += 1;
			int count = 0; // 카운트 초기화시 
			
			do {
				count++;
				System.out.println("1~100사이의 숫자 하나 입력하세요(10회)"); // 숫자 입력
				input = Integer.parseInt(sc.nextLine());

				
				if (answer > input) {
				System.out.println("더 큰 숫자 입니다");
				}else if (answer < input) {
				System.out.println("더 작은 숫자입니다");
				}else {
				System.out.println("정답입니다");
				System.out.println("입력하신 횟수는 " +count+"입니다");
				win += 1;
				break;
				}
				
				if (count>10) {
				System.out.println("정해진 횟수를 초과하였습니다(당신은 loser~)");// 7회 제한
				break;
				}

				
				
			} while (true);
		} 
		System.out.printf("%d전 %d승 %d패 입니다", end, win, end-win);
}}
