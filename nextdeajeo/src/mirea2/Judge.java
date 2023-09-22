package mirea2;

import java.util.Scanner;

//게임의 승패와 결과
//게임 결과를 출력
public class Judge {
	int totalcount;
	int win;
	int lose;
	int draw;
	public Judge() {
		totalcount = 0; win = 0; lose = 0; draw = 0;
		System.out.println("게임이 초기화 되었습니다");
	}
	
	public static int doif( int com, int person) {
		int result = 0;
		if (person == 0) {
			if (com == 0)
				result =  2;
			else if (com == 1)
				result =  0;
			else
				result =  1;
		} else if (person == 1) {
			if (com == 0)
				result = 0;
			else if (com == 1)
				result =  2;
			else
				result =  1;
		} else  {
			if (com == 0)
				result = 1;
			else if (com == 1)
				result =  0;
			else
				result =  2;
		}
		return result ;
	}
	public static int doarray(int com, int person) {
		int[][] judge = { { 0, 1, 2 }, { 2, 0, 1 }, { 1, 2, 0 } };
		return judge[com][person];
	}
	public static int docalc(int com, int person) {
		if (com == (person % 3)) { // 3������ �ѹ��� ó�� 
			return 0;
		}
		else if ((com + 1) % 3 == (person % 3)) {// 3���� 
			return 1;
		} else { // 3���� 
			return 2;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] judge = { "졌습니다", "이겼습니다", "비겼습니다" };
		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while (true) {
			System.out.println("가위(0)/바위(1)/보(2)를 입력하세요. -1은 종료");
			int person = Integer.parseInt(input.nextLine());
			if ( person == 9) break;
			int com = (int) (Math.random() * 100) % 3;// 0 1 2
			count+=1;
			int result = 0;
			result = docalc(com, person);
			switch(result) { 
			case 0: win+=1;  break;
			case 1: lose+=1; break;
			case 2: draw+=1; break;
		}
			System.out.println("결과는" + judge[result]);
		}
		System.out.println("----- 결과: " + count + "전 " + 
		    win + "승 " + draw + "비김 " + lose + "패.------\n");
	}
	
	
	
	//가위바위보 했던거 if문들 넣기
	
	public void gamedicision(int com, int user) { // 리턴 안해도 되니까 void로 둠
		int result = doif(com,user);
		totalcount += 1;
		if (result == 0) {
			System.out.println("이겼습니다");
		} else if (result ==1 ) {
			System.out.println("졌습니다");
			lose += 1;
		} else {
			System.out.println("비겼습니다");
			draw += 1;
		}
	}
	public void print() { // 선언을 제대로 확인하기@!!!!!!!
		System.out.println("게임 결과:" + totalcount + "전 " + win + " 승" + lose + "패 " + draw + "비김");
	}

}
