package mirea2;
//자바는 하나의 파일에 하나의 클래스만 존재하여야 한다
//클래스 이름과 파일 이름이 동일해야한다
//public class의 경우 하나만 존재 가능

//이 클래스는 이 파일 내에서만 사용 가능하다
//class Person { // public이 없으면 자동 private // 기본 꼴 모양
	// 멤버 변수, 멤버 함수, 생성자(초기화 용)으로 만드는게 클래스
	/*	public String name;
		public int age;
		
		public Person(String name, int age) { // 클래스와 이름을 동일하게 줌(생성자)
			this.name = name; // this name은 public의 name. this는 인스턴스 하고 나서의 자기 자신
			this.age = age;
		}
		
		//get / set
		public void setName(String name) { // 이름만 바꿈. 매개변수 있음 가져옴
			//void는 리턴할 곳이 없는 경우. 비어있다
			this.name = name;
		}
		
		public String getName() { // 이름만 가져감. getName은 매개변수가 없음
			//리턴값이 String. 
			return name;
		}
		
		public void setAge(int age) { // 나이 바꿈
			if (age > 200) age = 200; // 데이터 보호를 위해 함수로 제한함
			this.age = age;
		}
		
		public int getAge() { // 나이 가져가는 함수
			return age;
		}
		
		public void print() {
			System.out.println("이름은" + this.name + "나이는" + this.age);
		}
	}*/

//사용자 정의 데이터 타입
//함수는 한번만 정의되고, 데이터는 인스턴스 할때마다 공간을 확보하게 됨
public class c_01_class { // 파일명과 동일해야함
	public static void main(String[] args) {
		Person pe1 = new Person("대한", 21); // 데이터타입 Person. 대한이를 21로 초기화해라 인스턴스
		Person pe2 = new Person("민국", 19);
		Person pe3 = new Person("만세", 21);
		pe1.print();
		pe2.print();
		pe3.print();
		
		Person[] pe_dim = new Person[4]; // 배열. 입력될 공간이 3개 확보된다
		pe_dim[0] = new Person("대한이",10);
		pe_dim[1] = new Person("민국이",20);
		pe_dim[2] = new Person("만세야",150);
		pe_dim[3] = new Person("양명",12);
		for (Person pe : pe_dim) {
			pe.print();
		}
		
		String st_arr[] = {"대한2", "민국2", "만세3"};
		int age_arr[] = {10,20,30};
		
		Person pe_arr[] = new Person[st_arr.length]; // 주소공간확보
		for (int i = 0; i < st_arr.length; i ++) {
			pe_arr[i] = new Person(st_arr[i], age_arr[i]); // 데이터 공간 확보
		}
		for (Person pe: pe_arr) {
			pe.print();
		}

	}

}
