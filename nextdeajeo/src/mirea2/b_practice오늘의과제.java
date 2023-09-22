package mirea2;

import java.util.Scanner;

public class b_practice오늘의과제 {

	public static void main(String[] args) {
		// 배열로 가위바위보 해결하기 
		
		int person = 0; // 사용자
		int com[] = {0, 1, 2}; // 배열을 받음
		int count = 0;
		int win =0; int lose = 0; int dues = 0;
		Scanner scan = new Scanner(System.in);
		
		
	}
	public static ve(int person,int com) {
	// 가위바위보
	// 숫자 0 1 2 를 입력받아서 비교해 이겼을 시 출력
		
		//     0 1 2
		// 0  2 1 0
		// 1  0 2 1 
		// 2  1 0 2
	for (;;) { // 무한루프라 중지조건이 필요함
		com = (int) (Math.random() * 3); // 0,1,2
		
		System.out.println("가위0 바위1 보2 중 하나를 선택하시오");
		int person = Integer.parseInt(scan.nextLine());
		if (person >= 9)
			break;
		count += 1;// 게임 시작때마다 카운트
		
		}

}
