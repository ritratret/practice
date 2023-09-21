package mirea2;

	//기본형 데이터를 값을 복사하고(별도의 공간에 값이 존재)
	//참조형 변수는 데이터의 주소를 복사한다
public class b_04_parameter {
		// 함수 이름은 같은데 매개 변수 타입, 혹은 갯수가 다른걸 오버로딩이라 한다
		public static void m( ) {}
		public static void m( int i) {i=99;}
		public static void m( Integer i ) {i=99;}
		public static void m(int[] arr ) {arr[0] = 99;}
		public static void main( String[] args) {
			m();
			int i=10;
			m(i); // 복사(값만) 10
			System.out.println(i);
			Integer val =10; // wrapper 과도기적 언어(다 클래스로 작동)
			m(val); // 10
			System.out.println(val);
			int [] arr = {10,20,30}; // 참조형 -- > 주소를 저장함
			m(arr);// 99
			System.out.println(arr[0]);
			System.out.println(arr.length); 
		} 
		// 참조형은 주소를 기반으로 찾아가기 때문에 본래의 값이 바뀜
		// 기본형은 당시의 값만 바뀌기 때문에 본래의 값에 영향을 미치지 않음 
	}
