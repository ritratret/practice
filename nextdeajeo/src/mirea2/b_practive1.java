package mirea2;

import java.util.Scanner;

public class b_practive1 {
	//조별과제: 가위바위보 게임에서 판단 부분을 함수화하시오
	//변수: 가위, 바위, 보, 승, 패, 비김, 판 횟수
	public static void main(String[] args) {
		int com = (int) (Math.random() * 100) % 3;
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		int person = Integer.parseInt(scan.nextLine());
		//가위 0 바위 1 보 2
		//파라미터 순서 똑같이
		System.out.println(se(person, com)); // 파라미터 가져와서 함수에 넣는다는 뜻
		String[] judge = { "이겼습니다", "졌습니다", "비겼습니다" };
	}

	public static void se(int person,int com) {
		
		person = 0;
		int count =0;
		count += 1;
		int result = 0;
		int win = 0;
		int lose = 0;
		
		
		
		for (;;) {
			
			if (person >= 9)
				break; // 중지조건
			if (person == com) {
				
				System.out.println("비겼습니다");
				result=2;
				
			}else if ((person > com)   && (com == 0)) {
				System.out.println("이겼습니다");
				result=0;
				win += 1;
			}
			else if ((person < com) && (person < 2)) {
				lose += 1;
				result=1;
				System.out.println("졌습니다");
			}
			else if ((person < com) && (com == 0)) {
				lose += 1;
				result=1;
				System.out.println("졌습니다");
			}
			else {
				win += 1;
				result=0;
				System.out.println("이겼습니다");
			} 
			
			return result;
			
			System.out.println("총 게임 횟수는=" + count + "전:" + win + "승:" + lose + "패 입니다");
		} 
	}
}


