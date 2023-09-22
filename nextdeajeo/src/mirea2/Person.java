package mirea2;

public class Person {
	
		public String name;
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

	
}
