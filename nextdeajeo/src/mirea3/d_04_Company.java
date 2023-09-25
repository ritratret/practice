package mirea3;

//회사에서 사원 관리(Employee) (이름name, 나이age, 성별sex, 주소addr, 급여salary) getset
//클래스로 작성하시오
//출력 함수 display
//사원 클래스를 상속받은 Manager class(부서명, 사원 배열)
//부서명 추가 department 

class Employee {
	String name;
	int age;
	String sex;
	String addr;
	long salary; // 다수의 정수
	// Source -> Generate getter and setter -> 체크하면 자동으로 만들어줌

	public Employee() {
	}

	public Employee(String name, int age, String sex, String addr, long salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.addr = addr;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("이름: " + name + "나이: " + age + "성별: " + sex + "주소: " + addr + "급여: " + salary);
	}

}

class Manager extends Employee { // 배열은 넣기전에 초기화 해줘야함
	public String department;
	public Employee sub[]; // 관리하는 직원을 배열로 받음

	public Manager() {
	}

	public Manager(String name, int age, String sex, String addr, long salary, String department) {
		super(name, age, sex, addr, salary); // 부모의 생성자를 호출하는 방법 1
		// this.name = name;this.age = age;this.sex = sex;this.addr = addr;this.salary =
		// salary; // 부모의 생성자를 호출하는 방법 2
		this.department = department;
		this.sub = new Employee[2]; // 초기화
	}

	public void displayEmployee() {
		for (int i = 0; i < sub.length; i++) {
			sub[i].display();
		}
	}

	public void display() {
		System.out.println("담당부서: " + this.department);
		System.out.println("부하직원의 수: " + this.sub.length);
		System.out.println("부서장");
		super.display(); // 자기자신을 찍고
		System.out.println("부서직원"); // 직원 출력
		displayEmployee();

	}
}

public class d_04_Company {

	public static void main(String[] args) {
		Employee el1 = new Employee("대한이", 23, "남", "서울시 강북구", 1500000);
		Employee el2 = new Employee("민국이", 233, "여", "대전 강북구", 2000000);
		Employee el4 = new Employee("희망이", 50, "남", "대구 강북구", 500000);
		Employee el5 = new Employee("어쩔", 45, "여", "인천 강북구", 40000000);

		Manager[] co = new Manager[2];
		Manager ma1 = new Manager("김관리", 40, "여", "서울시 강남구", 500000000, "개발부");
		ma1.sub[0] = el1;
		ma1.sub[1] = el2;
		Manager ma2 = new Manager("이소장", 30, "여", "서울시 강남구", 500000000, "연구부");
		ma2.sub[0] = el4;
		ma2.sub[1] = el5;
		co[0] = ma1;
		co[1] = ma2;
		System.out.println("전체 직원현황");
		for (int i = 0; i < co.length; i++) {
			co[i].display();
		}

	}

}
