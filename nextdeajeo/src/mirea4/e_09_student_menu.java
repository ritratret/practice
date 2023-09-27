package mirea4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//***********************************************CRUD(오늘 했던거 123456) 클래스로 만들기 - 개인과제
//총점기준 내림차순 정렬. 등수매기기 rank


class Student {
	public int no;
	public String name;
	public int kor;
	public int mat;
	public int eng;
	public int total; // 총점
	public double average; // 평균
	public int rank;

	public Student() {
	} // 디폴트 생성자

	public Student(int no, String name, int kor, int mat, int eng) { // 생성자
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		calcTotal();
		calcAverage();
	}

	public void setNo(int no) { this.no = no;} // 데이터 받을때는 반환할 필요가 없다. return X
	public Integer getNo() { return Integer.valueOf(no); } // 자료구조에서 기본데이터타입은 안된다
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor; calcTotal(); calcAverage();}
	public int getMat() {return mat;}
	public void setMat(int mat) {this.mat = mat;calcTotal();calcAverage();}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;calcTotal();calcAverage();}
	public Integer getTotal() {return Integer.valueOf(total);}
	public double getAverage() {return average;}

	public void calcTotal() {total = kor + mat + eng;}// 값이 바뀔때마다 다시 계산
	public void calcAverage() { // math round는 static인 공용함수
		average = Math.round(total / 3.0 *100)/100; 
		}

	public String toString() { // 최상위 부모에 Object가 있음. 문자열 들어가는 함수있으면 자동리턴
		return no + " " + name + " " + kor + " " + mat + " " + eng + " " + total + " " + average+ " " + rank;
	}
	public Comparator<Student> stdcompare() {
		Comparator<Student> comp = new Comparator<Student>() {
			public int compare(Student stu1, Student stu2) {
				return stu1.getNo().compareTo(stu2.getNo()); //오름차순 정렬
			}
		};
		return comp;
	};
	
	public Comparator<Student> totalcompare() { //total로 내림차순 정렬
		Comparator<Student> comp = new Comparator<Student>() {
			public int compare(Student stu1, Student stu2) {
				return stu2.getTotal().compareTo(stu1.getTotal()); //오름차순 정렬
			}
		};
		return comp;
	};
}

public class e_09_student_menu {
	static Scanner in = new Scanner(System.in); // 공용으로 선언(static) 인스턴스없이 사용가능
	private static char[] rank;
	// 클래스 안에서만 쓰기때문에 public 없다.

	public static void inputinfo(List<Student> list) { // ***************입력
		//입력받는 함수 -> Student class 작성해서 -> 매개변수로 넘어오는 자료구조에 전달
		Student st = new Student(); // st는 인스턴스
		System.out.println("번호를 입력하시오");
		st.no = Integer.parseInt(in.nextLine()); //st에서 입력받아오기
		System.out.println("이름을 입력하시오");
		st.name = in.nextLine();
		boolean re = false;
		while(!re) { //re가 아닐 시(re==true) -> false일 시
			re = true;
			do {
				try {
					System.out.println("국어점수를 입력하시오");
					st.kor = Integer.parseInt(in.nextLine());
				} catch(NumberFormatException e) {
					System.out.println("숫자를 입력해주세요");
					re = false; // 
				}
			}while(st.kor < 0 || st.kor > 100); //숫자가 0~100사이여야함
		}
		System.out.println("수학 점수를 입력하시오");
		st.mat = Integer.parseInt(in.nextLine());
		System.out.println("영어점수를 입력하시오");
		st.setEng(Integer.parseInt(in.nextLine())); // 함수의 매개변수를 줌
//		st.calcTotal(); // 값을 일일히 줬기때문에 직접 언급해야함
//		st.calcAverage();
		list.add(st); //st를 list에 add해줌
		System.out.println("데이터가 입력되었습니다");
		}
	
	public static void display(List<Student> list) {
		System.out.println("*** 입력 데이터 출력 ***");
		System.out.println("번호 이름 국어 수학 영어 총점 평균");
		Iterator<Student> itr = list.iterator(); // 인스턴스아니고 그냥 얻어오는거임
		while (itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st);
		}
	}
	
	public static void sort(List<Student> list) { // ***************번호로 정렬
		Collections.sort(list, list.get(0).stdcompare()); // list의 0번을 갖고왔고 그 밑에 stdcompare 함수가 있음
		display(list);
	}
	
	public static void sort2(List<Student> list) { // ******************내림차순 총점기준 등수입력 
		System.out.println("총점을 기준으로 내림차순 정렬을 하겠습니다");
		Collections.sort(list, list.get(0).totalcompare());
	}
	
	public static int search(List<Student> list) { //***************검색
		System.out.println("검색할 번호를 입력하시오");
		int no = Integer.parseInt(in.nextLine());
		int index = Collections.binarySearch(list, new Student(no, null, 0, 0, 0), list.get(0).stdcompare());
		System.out.println("이진검색으로 찾은 인덱스:" + index);
		if (index != -1) { // -1이 아닐때(해당되지 않을때 나옴)
			System.out.println("검색된 데이터 ");
			System.out.println(list.get(index));
			//수정할때도 사용한다
			return index;
		}
		else {
			System.out.println("검색한 데이터가 없습니다. ");
			return -1; // 데이터가 없을 시 -1을 반환해서 if에서 빠져나감
		}
	}
	
	
	public static void delete(List<Student> list) { //***************삭제
		int index = search(list);
		if (index != -1) {list.remove(index);
		System.out.println("데이터가 삭제되었습니다");
		} else {
			System.out.println("검색한 데이터가 없습니다.");
		}
	}
	
	//이름으로 찾아서 수정하기 
	public static void edit(List<Student> list) { //***************수정
		System.out.println("** 수정하고자 하는 이름을 입력하시오");
		String inputValue = in.nextLine();
		Iterator<Student> itr = list.iterator();
		//for 문 index, 확장 for문 사이에 등장한 문법 iterator 
		//처음 이터레이터를 얻으면 데이터의 첫번째 데이터를 가리키게 된다
		//for문은 데이터를 *인덱스*로 다루고, 확장 for문이나 이터레이터는 *데이터를 직접 가리킴*
		while(itr.hasNext()) {
			Student stu = (Student) itr.next();
			if(inputValue.equals(stu.name)) {
				System.out.println("변경할 이름을 입력하시오");
				String changeValue = in.nextLine();
				stu.setName(changeValue);
			}
		}
		display(list);
		System.out.println(" ** 수정 완료 ** ");
	}
	
	public static void ranking(List<Student> list) { //********************총점으로 번호정렬
		sort2(list); // sort2 정렬된거 불러와서
		Iterator<Student> itr = list.iterator(); // itr로 나열하고
		int i = 0;
		while (itr.hasNext()) {
			Student stu = (Student) itr.next();
			i += 1;
			stu.rank = i; // i++ 하며 1개씩 더하기
		}
	}
	

	public static int windowfor(List list) { // 메뉴는 무한루프로 설정
		//프로그램 일반화
		//부모는 자식을 가리킬 수 있기 때문에 ArrayList 대신 List로 받았음. 이후 LinkedList로 변경시
		//문제가 없게 하기위해서
		while (true) {
			System.out.println("=========== 성적 관리 프로그램 ===========");
			System.out.println("-----------------------------------");
			System.out.println("1.입력 2.출력 3.정렬 4.조회 5.편집 6.삭제 7.랭킹 9.종료");
			System.out.println("메뉴를 선택하시오");

			int ch = 0;
			try {
				ch = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:inputinfo(list); // inputinfo로 list에 넣음
				break;
			case 2: display(list); break; //출력
			case 3: sort(list); break; //정렬
			case 4: search(list); break; //검색
			case 5: edit(list); break; //수정
			case 6: delete(list); break; //switch문을 벗어남 / 삭제
			case 7: ranking(list); break; //내림차순으로 랭크정렬
			case 9:
				System.out.println("프로그램을 종료합니다.");
				in.close(); // 윈도우 자원을 사용하는 객체는 반드시 종료시킨다
				// (네트워크, 데이터베이스, 입출력객체, 파일객체)
				return 0; // 함수 자체를 벗어남
			default:
				System.out.println("잘못 선택하였습니다.");
				break;
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Student> stud = new ArrayList<Student>();
		windowfor(stud);

	}

}
