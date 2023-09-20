package mirae.com;

import java.util.Scanner;

public class a_08_윤달 {

	public static void main(String[] args) {
		//년도와 월일 입력하면 말일이 몇일인지
		//2월:4로 나누어 떨어짐. 100으로 나누어 떨어지지 않고 400으로 나눠 떨어지면 윤달(29?)
		//1 3 5 7 홀수 31일. 2 4 6 짝수 30일
		
		int year;
		int month;
		String lastday = " ";
		Scanner input = new Scanner(System.in);
		System.out.println("연도와 달을 입력하시오"); //연도  year 달 month
		year = input.nextInt();
		month = input.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 9: case 11:
			lastday = "31일";
		case 4: case 6: case 8: case 12:
			lastday = "30일";
		case 2:
			// true/false        // true/false 100으로나눠 떨어지지않음
			if (((year % 4 == 0)&& !(year % 100 == 0)) || (year % 400 ==0)) { //완전이해안되고있음
				lastday = "29일";
			} else {
				lastday = "28일";
				break;
			}
			default: System.out.println("해당 월이 없습니다");
			
			System.out.println(lastday);
			
		}

		// 월 별 케이스를 나눠 분리-> 2월달에서만 if 조건별로 나누기
	}

}
