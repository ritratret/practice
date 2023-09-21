package mirea2;

public class b_02_stack { // 함수 테스트 용
	// 근의 공식도 해보면 좋을듯

	public static void main(String[] args) {
		System.out.println("프로그램 시작 첫 함수 호출");
		staticMethod1();
		staticMethod1(); // 메소드 1을 2번 호출
		System.out.println("메인으로 복귀");
		System.out.println(func(3));
		System.out.println(func(3,1,2,3)); // a b c x
		System.out.println("종료합니다");
		

	}
	public static void staticMethod1 ( ) { // 2번 호출되었으니 2번 반복
		int a = 10;
		System.out.println("첫 함수 진입");
		staticMethod2(); // 메소드 2로 이동해서 진행
		System.out.println("두번째 함수 호출 종료");
	}
	public static void staticMethod2( ) {
		System.out.println("두번째 함수 진입 ");
		System.out.println("두번째 함수 종료 ");
	}
	// 2x^2 + 4x + 1 이 수학함수를 함수로 작성
	public static int func(int x) {
		int ret = (int) (2*Math.pow(x, 2) + (4 * x) + 1); // x의 2승 pow / 정수 ret이므로 식도 int로 받아줘야함
		return ret;
	}
	
	// ax^2 + bx +c
	public static int func( int a, int b, int c, int x) {
		int ret = (int) (a*Math.pow(x, 2) + (b * x) + c);
		return ret;
	}

}
