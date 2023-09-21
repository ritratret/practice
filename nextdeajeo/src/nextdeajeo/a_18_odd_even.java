package nextdeajeo;

import java.util.Scanner;

public class a_18_odd_even {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count =0; int win = 0; int lose =0;
		for(;;) { // 무한루프라 중지조건이 필요함
			int com = (int) (Math.random() * 2); // 0,1
			
			System.out.println("짝 0 , 홀 1을 입력하시오"); 
			int person = Integer.parseInt(scan.nextLine());
			if (person >= 9) break;
			count += 1;// 게임 시작때마다 카운트
			if (person%2 == com)
			{
				win += 1;
				System.out.println("맞추었습니다");
			}
			else {
				lose += 1;
				System.out.println("틀렸습니다(오백원)");
			}
		} // 그래픽으로 대체해주면 게임같은 모습이 된다
		System.out.println("총 게임 횟수는=" + count + "전:" + win + "승:" + lose + "패 입니다");
		
		scan.close();
	}

}
