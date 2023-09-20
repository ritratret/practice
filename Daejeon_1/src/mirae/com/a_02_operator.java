package mirae.com;

public class a_02_operator {

	public static void main(String[] args) { // main도 함수 stack에서 실행
		int i = 5; // 데이터 타입, 변수, 초기화 값
		// 변수명은 데이터를 알아볼 수 있는 단어
		// 영문자로 시작 숫자를 사용 특수문자 ($, _)
		// System 이미 사용되는 키워드 사용
		i++;
		System.out.println(i);
		i = 5;
		++i;
		System.out.println(i);
		// 패키지,클래스, 함수
		System.out.println(i++);
		System.out.println(++i); // 8

		System.out.println("10의 3승" + Math.pow(10, 3));
		int j = 0;
		System.out.println(10 > 1);
		System.out.println(j++ + 10);

		// 데이터 변환
		// 숫자 데이터 타입: byte(1바이트), short(2바이트: 65536), int (4), long(8)
		// 사이즈, 입력되는 데이터의 한계?
		// wrapper class Byte, Short, Integer, long
		// float(4), double(8)
		int babo = 300;
		String s = String.valueOf(babo); // 숫자를 문자로 바꾸고있음
		// 문자열 String. 얘도 class. =멤버변수+멤버함수
		System.out.println(i + 100);
		System.out.println(s + 100); // 문자열로 변환해 넣어줌

		String si = "200";
		int number = Integer.parseInt(si);
		System.out.println(number);
		int number2 = Integer.parseInt(s);
		System.out.println(number2 + 200);

		byte iByte = 10; // 256가지
		short iShort = 10; // 65536
		int iInt = 10;// 4
		long iLong = 10;// 8
		int tmp = iByte; // 바이트를 대입하는거라서 가능
		byte tmp2 = (byte) iInt; // 용량이 맞지않아 대입하기위해서는 casting필요
		float num1 = 10.1f; // 4 : 지수부(10^1), 가수부(0.314)
		double num2 = 10.1d; // 8
		double num3 = 10.1; // 기본은 double 형
		// 문자
		char ch1 = 'a'; // single quatation
		// 문자열
		String st = "대한민국"; // double
		System.out.println(st);

		// 줄정리 ctrl shift F
		char c1 = 'a'; // a 코드값은 97. 연산할땐 코드값. 출력시에는 문자로 출력!char
		int j1 = c1 + 3;
		System.out.println(j1);
		char c3 = (char) (c1 + 1); // 97+1=98을 문자화char함
		System.out.println(c3);

		// 2진수
		System.out.println(Integer.toBinaryString(8)); // 2진수로 표현하니 1 0 0 0 출력
		int temp = 8 >> 2; // 오른쪽으로 두번 보냄 시프트 0 0 1 0
		System.out.println(temp);
		System.out.println(Integer.toBinaryString(temp));

		int x = 123;
		int y = 205;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		int z = x & y; // && and 논리연산자, & 비트 and연산자. x랑 y의 and연산후 값을 z에 저장
		System.out.println(Integer.toBinaryString(z));
		System.out.println(z);

		//3항 연산자
		x = 10;
		y = -10;
		int absX = (x >= 0) ? x : -x; // true. x >= 0일 시 x출력. 아닐시  -x 출력
		int absY = (y >= 0) ? y : -y; // false 
		System.out.println("x= " + absX);
		System.out.println("y= " + absY);

	}

}
