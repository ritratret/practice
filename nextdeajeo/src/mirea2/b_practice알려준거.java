package mirea2;

import java.util.Scanner;

public class b_practice알려준거 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// 가위바위보
		// 숫자 0 1 2 를 입력받아서 비교해 이겼을 시 출렷
		int person = 0; // 사용자
		int com[] = {0, 1, 2};
		int count = 0;
		int win =0; int lose = 0; int dues = 0;
		for (;;) { // 무한루프라 중지조건이 필요함
			com = (int) (Math.random() * 2); // 0,1

			System.out.println("가위0 바위1 보2");
			int person = Integer.parseInt(scan.nextLine());
			if (person >= 9)
				break;
			count += 1;// 게임 시작때마다 카운트
			if (person > com) {
				win += 1;
				System.out.println("이겼습니다");
			} else if (person = com){
				dues += 1;
				System.out.println("비겼습니다");
			} else {
				lose += 1;
				System.out.println("졌습니다");
			}
		} // 그래픽으로 대체해주면 게임같은 모습이 된다
		System.out.println("총 게임 횟수는=" + count + "전:" + win + "승:" + lose + "패 입니다");

		Scanner input = new Scanner(System.in);
		String[] judge = { "이겼습니다", "졌습니다", "비겼습니다" };

		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		while (true) {
			System.out.println("가위0 바위1 보2");
			int person = Integer.parseInt(input.nextLine());
			if (person == 9) break; // 종료조건
			int com = (int) (Math.random() * 100) % 3;
			count += 1;
			int result = 0;
			// person com (컴퓨터 기준)
			//    0 1 2
			// 0   2 1 0
			// 1   0 2 1
			// 2   1 0 2

			if (person == 0) {
				if (com == 0)
					result = 2;
				else if (com == 1)
					result = 1;
				else
					result = 0;
			} else if (person == 1) {
				if (com == 0)
					result = 0;
				else if (com == 1)
					result = 2;
				else
					result = 1;
			} else if (person == 2) {
				if (com == 0)
					result = 1;
				else if (com == 1)
					result = 0;
				else
					result = 2;
			}
			
			switch(result) {
			case 0: win+= 1; break;
			case 1: lose+= 1; break;
			case 2: draw+= 1; break;
			}
			System.out.println("게임 결과: " + judge[result]);
			
		}
		
		System.out.println("------ 게임 결과: "+ count + "전" + win + "승" + draw + "비김" + lose + "패 ------ \n" );

	}

	}
