package mirea4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Student21 클래스
//int rollno, String name, int age
//arraylist에 3인분을 입력하고 출력해보시오(출력은 3가지 방식: for, 확장for, iterator) forEach(번외)
class Student21 {
	public int rollno;
	public String name;
	public int age;

	public Student21() {
	}

	public Student21(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public String toString() {
		return "번호:" + rollno + " 이름:" + name + " 나이:" + age;
	}
}

public class e_04_Student_ArrayList {
		public static void main(String[] args) {
			List<String> names = new ArrayList<String>();

			for (int i = 0; i < names.size(); i++) { // for문
				String tmp = names.get(i);
				System.out.println(tmp);
			}
			
			for (String tmp:names) { //확장 for문
				System.out.println(tmp);
			}

			Student21 std1 = new Student21(1, "김학생", 55); // 인스턴스
			Student21 std2 = new Student21(2, "", 22);
			Student21 std3 = new Student21(5, "토마토", 2);

			ArrayList<Student21> members = new ArrayList<Student21>();
			members.add(std1);
			members.add(std2);
			members.add(std3);
			
			for(int i=0; i < members.size(); i++) {
				System.out.println(members.get(i));
			}
			System.out.println(members);
			for(Student21 stu:members) {
				System.out.println(stu);
			}
			Iterator itr = members.iterator();  
			while (itr.hasNext()) {
				Student21 st = (Student21) itr.next();
				System.out.println(st.rollno + " " + st.name + " " + st.age);
			}
			members.forEach(a -> {
				System.out.println(a.rollno + " " + a.name + " " + a.age);
			});
			members.forEach(f -> System.out.print(f));
			itr = members.iterator();  
			int totalage =0;

			while (itr.hasNext()) {
				Student21 st = (Student21) itr.next();
				totalage += st.age;
			}
			System.out.println("나이의 총합계:" + totalage);
		}
	}

