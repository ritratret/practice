package mirae.com;

import java.util.Scanner;

public class a_07_switch_case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day;
		System.out.println("날짜를 입력하시오(1~31)");
		day = input.nextInt();
		day = day % 7 + 1;
		String weekday = ""; // 변수선언하며 값 비워줌
		
		switch (day) {
		case 1: weekday = "월요일"; break;
		case 2: weekday = "화요일"; break;
		case 3: weekday = "수요일"; break;
		case 4: weekday = "목요일"; break;
		case 5: weekday = "금요일"; break;
		case 6: weekday = "토요일"; break;
		case 7: weekday = "일요일"; break;
		default : weekday = "없는 요일입니다"; break;
		}
		System.out.println("오늘은" + weekday + "입니다");
		
		
		int score;
		System.out.println("점수를 입력하시오");
		score = input.nextInt();
		score= score / 10;
		char jumsu = ' ';
		
		//문제: 점수를 입력받아 학점으로 변환해 출력하시오
		//100~90 A 89~80 B 79~70 C 69~60 D 그 외는 F
		// 값에 10으로 나누면 몫이 남는다
		
		switch (score) {
		case 10: case 9: jumsu = 'A'; break;
		case 8: jumsu = 'B'; break;
		case 7: jumsu = 'C'; break;
		case 6: jumsu = 'D'; break;
		default : jumsu = 'F';
		}
		System.out.printf("당신은 %c 등급 입니다", jumsu);
		
		//년도와 월일 입력하면 말일이 몇일인지
		//2월:4로 나누어 떨어짐. 100으로 나누어 떨어지지 않고 400으로 나눠 떨어지면 윤달(29?)
		//1 3 5 7 홀수 31일. 2 4 6 짝수 30일
		
	
		
	}
	
	
	
	
		
	
	

}
