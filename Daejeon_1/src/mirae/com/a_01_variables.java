package mirae.com;

public class a_01_variables {

//	자바는 클래스로 시작
	public static void main(String[] args) {
//		대입연산자
//		변수 -> 메모리 주소로 변환
		int korea = 90;
		korea = 75;
		int english = 76;
		int math = 67;
//		연산의 우선순위 ( 우선순위 바꾸기 = 괄호 사용 )
		int result = korea + english + math;
//		부동소수점인 경우 float의 약자
//		float형 데이터 4bite
//		자수부 (1) + 가수부 (3bite)로 저장
//		3.14 => 0.314 * 10^2
//		double형 = 8bite => 더 정밀하게 (4bite를 더 써야함.낭비)
//		정수 나눗셈, 부동소수숫점 나눗셈
		float average = result / 3.0f;
//		문자열 >>> 숫자열
		System.out.println("평균은" + average);
//		소수점 1번째 반올림 = Math(수학함수 / static class).round
		System.out.println("평균은" + Math.round(average));
//		포맷 문자열 %.f = float 부동소수점
		System.out.println(String.format("%.2f", average));
		
//		상수
		final float pi =3.141592f;
//		pi =2.13; 
		System.out.println(pi);
		
//		문제 Math.round를 이용해 소수점 4째 자리에서 반올림하고
//		3째 짜리까지 표현 해 보세요
		System.out.println(Math.round(pi*1000)/1000f);
	
		
		
	}

}
