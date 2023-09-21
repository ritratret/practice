package mirea2;

import java.util.Scanner;

public class b_03_box {

	public static void main(String[] args) { // 클래스는 참조형 변수 new를 해야한다
		//Q: 세로, 가로, 높이를 입력받아 부피를 계산
		//세로: 10, 가로: 20, 높이:30 박스의 부피를 계산
//		
//		Scanner input = new Scanner(System.in);
//		b_03_box mt = new b_03_box(); // 클래스를 메모리에 올리고(1)
//		System.out.println("세로, 가로, 높이를 입력하시오");
//		int l = input.nextInt(); // 입력받는 코드
//		int w = input.nextInt();
//		int h = input.nextInt();
//		System.out.println("부피 계산 결과는?" + mt.V(l,w,h)); // 메모리에서 V를 찾아서 씀(2)
//		
//		System.out.println("삼각형의 밑변과 높이를 입력하시오");
//		int l2 = input.nextInt(); // 입력받는 코드
//		int h2 = input.nextInt();
//		System.out.println("삼각형의 넓이는?" + V2(l2,h2));
		
		System.out.println("직각 삼각형의 밑변과 높이를 입력하면 빗변의 길이를 알려드립니다.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(); // 입력받는 코드
		int b = input.nextInt();
		System.out.println(pita(a,b)); // 피타고라스 정리
	}
	public int V (int l, int w, int h) { // static 없으면 전역변수 아니라 다른공간에서도 쓸 수 없음
		int ret = l * w * h;
		return ret;
	}
	
	//정삼각형의 넓이
	//밑변 높이
	public static int V2 (int l2, int h2) {
		int ret = (int)(l2 * h2/2);
		return ret;
	}
	
	//직각 삼각형의 빗변구하는 공식(피타고라스)
	//a^2 + b^2 한 값에 루트
	public static double pita (int a, int b) {
		double tri = Math.pow(a,2)+ Math.pow(b,2);
		double result = Math.sqrt(tri);
		return result;
	}

}
