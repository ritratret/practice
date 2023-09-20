package mirae.com;

import java.util.Random; //java.util.Random; 이 경로로 클래스 가져오기

public class a_03_random {

	public static void main(String[] args) {
		// 1은 seed 값 1번째 난수부터 출력해라(숫자 고정)
		Random rand = new Random(1); // 의사난수(가짜난수): 난수가 임의로 정해져있다
		// new : 동적메모리 할당 < 주소값이 들어감(rand)  
		// Random은 class. 사용자가 만든 데이터 타입. 만들어둔거 갖다쓰는거라서 편함
		System.out.println("= rand = ");
		rand.nextInt();
		// nextInt 호출

		// for 반복문. (초기값; 끝나는조건; 증감값)
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand.nextInt());

		// 대한민국을 10번 출력하시오
		for (int i = 1; i < 10; i++)
			System.out.println("대한민국");

		// 1~10까지의 합 55
		// 홀수의 합 i에 2씩 더하면 홀수
		// 0에 2씩 더하면 짝수
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println("짝수의 합:" + sum);

		// 숫자 여러개 저장 시 배열 사용
		// ():함수 {}:블록단위 []:배열 컴퓨터의 괄호
		int[] counter = new int[10]; 
		// int형 10개 저장가능한 메모리 만듦
		
		for (int i = 0; i < 10; i++) {
			//counter[i] = i+1; counter[i]에 대입
			System.out.println(counter[i]);	//출력
		}
	}
}
