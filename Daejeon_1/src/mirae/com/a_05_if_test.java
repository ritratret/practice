package mirae.com;

import java.util.Scanner;

public class a_05_if_test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 클래스(함수+변수) 인스턴스. 메모리를 저장할 공간을 heap에 확보하라
		//Scanner는 입력받을때 사용하는 클래스. 표준입력장치:키보드
		System.out.println("월을 입력하시오");
		int month = input.nextInt(); //nextInt는 int 입력. int month는 stack에 저장
		String season = null; // 기억공간이 확보되지 않은 변수. 공간할당이 안되어있다. null출력시 종료
		// 공백이랑은 다른거 ""과 " "는 메모리 공간이 있음
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "데이터 없음";
		}
		System.out.println(month + "월은 " + season + "입니다."); // 경우의 수는 5가지. 모든 경우를 처리하지 못하면 오류난다

		// 기억공간X null / "" 거짓 / " " 공백
		
		System.out.println("월을 입력하시오");
		int month2 = input.nextInt(); // nextString은 문자열
		String season2 = null;
		
		switch (month2) { //switch문. 입력받은 month2값에 해당되는 case를 출력
		case 12: 
		case 1 : 
		case 2: 
			season2 = "겨울"; 
			break; 
		//break가 없을 시 다음 case로 넘어가게된다
		case 3: case 4 : case 5: season2 = "봄"; break;
		case 6: case 7 : case 8: season2 = "여름"; break;
		case 9: case 10 : case 11: season2 = "가을"; break;
		default: season = "없는 계절"; // 범주에 없는것일때 출력하는 부분
		}
		System.out.printf("%d월은 %s 입니다.", month2, season2); //printf(ormat) %d는 정수. %s는 문자
		input.close(); // 자원사용시의 인스턴스는 끝난 뒤 해제
		
		
		
	
	}

}
