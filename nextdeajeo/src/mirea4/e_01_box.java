package mirea4;
//데이터 타입이 입력되는 자리에 대표 타입으로 대치
class Box<T> { //Generic class ,T가 데이터 타입
	private T t;
	public void add(T t) { // 더할 경우
		this.t = t;
	}
	public T get() { // get으로 들어올경우 리턴
		return t;
	}
}

public class e_01_box {
	public static <E> void printArray(E[] inputArray) {// E가 데이터 타입. String int 이런거랑 같은거임
		// Generic function (C++에서는 Template)
		// () {} [] <데이터 타입>

		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 }; // 배열을 넣음
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		printArray(intArray); // Interger로 바뀜
		printArray(doubleArray); // double
		printArray(charArray); // Character
		
		//구체적인 데이터 타입을 지정: 기본형, 참조형
		//compile time에 T를 지정된 데이터 타입으로 변환
		Box <Integer> integerBox = new Box<Integer>(); //클래스 인스턴스. Integer안에 클래스 들어갈 수 있음
		Box <String> stringBox = new Box<String>();
		integerBox.add(Integer.valueOf(10)); //Box T 클래스 사용
		stringBox.add(new String ("안녕 일반화 프로그램"));
		System.out.printf("정수형 :%d\n", integerBox.get());
		System.out.printf("문자형 :%s\n", stringBox.get());
		

	}

}
