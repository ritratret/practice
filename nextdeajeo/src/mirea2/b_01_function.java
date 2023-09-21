package mirea2;

public class b_01_function {

	public static void main(String[] args) {
		// 함수란? 중복을 방지하고 알고리즘을 재사용 하기 위함
		// 입력과 출력을 매핑
		// method(=함수): 클래스의 정의되어야 함, static
//		System.out.println(100+300); // 메모리에 정보가 남지 않음 오로지 결과만
//		int num1 = 100;
//		int num2 = 200;
//		int result = num1+num2;
//		System.out.println("더한 결과:" + result + "입니다");
//		
//		num1 = 200;
//		num2 = 400;
//		result = num1+num2;

		
		int result = miu(200,400);
		System.out.println(div(100,3));
		System.out.println(result);
		

		// 반복을 줄이기 위해 같은 것은 함수로 바꿔 반복을 줄인다 ↓
	}

	// 사용자 정의 함수
	// static : 함수는 클래스 내에서 선언, 클래스 인스턴스하고 사용
	// static은 인스턴스 하지않고 사용이 가능함(정적메소드)
	// public: 클래스 밖에서도 사용 가능한 메소드
	public static int add(int n1, int n2) { // 사용자가 함수를 정의
		// int n1, int n2는 입력받는 형식임(a, b)
		int result = n1 + n2;
		return result;
	}

	public static double add(double n1, double n2) {
		// 데이터 타입이 다르거나, 매개변수 갯수가 다르면 다르게 인식해 여러개 만들 수 있음!!!!! overloading
		// int n1, int n2는 입력받는 형식임(a, b)
		double result = n1 + n2;
		return result;
	}

	// 문제: 두 수를 입력받아 곱해서 리턴하는 함수
	public static int gob(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	// 빼서 리턴
	public static int miu(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	// 나누기
	public static double div(double n1, double n2) {
		double result = Math.round(n1) / n2;
		return result;
	}

}
