package mirea4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

//class 생성
class Dept2 {
	int deptno; // 번호
	String dname; // 직업명
	String loc; // 지역

	Dept2(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return Integer.valueOf(deptno); // interger로 바꿔줌
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String toString() {
		return "부서번호:" + deptno + " 부서이름:" + dname + " 위치:" + loc;
	}
}

public class e_08_LinkedList {

	public static void main(String[] args) {
		Dept2 s1 = new Dept2(10, "회계사", "거제");
		Dept2 s2 = new Dept2(20, "연구원", "부산");
		Dept2 s3 = new Dept2(30, "판매원", "충주");
		Dept2 s4 = new Dept2(40, "운영자", "부산");
		Dept2 s5 = new Dept2(50, "개발부", "바보");
		
		LinkedList<Dept2> a1 = new LinkedList<Dept2>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		
		Iterator<Dept2> itr = a1.iterator();
		while(itr.hasNext()) {
			Dept2 dept2 = (Dept2) itr.next();
			System.out.println(dept2);
		}
		LinkedList<Dept2> a12 = new LinkedList<Dept2>();
		a12.add(s1);
		a12.add(s1);
		a1.addAll(a12); // 리스트를 다른 리스트에 추가
		System.out.println(a12);
		System.out.println(a1);
		a1.remove(0); // 10번 없어짐
		a1.removeAll(a12); // removeAll 있는거 다 지워버림
		System.out.println(a1);
		
		a1.addFirst(s1);
		a1.addLast(s2);
		System.out.println(a1);
		
		a1.removeFirst(); // 앞, 뒤에 있는거 지우기
		a1.removeLast();
		System.out.println(a1);
		
		a1.removeFirstOccurrence(s1); // 처음 발견되는 데이터
		a1.removeLastOccurrence(s2); // 마지막에 발견되는 데이터를 삭제
		System.out.println(a1);
		
		// a1.clear(); //리스트의 객체를 모두 삭제하는데 사용되는 메소드
		System.out.println("역순으로 출력하기");
		//ascending 오름차순
		//descending 내림차순
		Iterator reverse_iter = a12.descendingIterator();
		while(reverse_iter.hasNext()) {
			Dept2 dept2 = (Dept2)reverse_iter.next();
			System.out.println(dept2.deptno + " " + dept2.dname + " " + dept2.loc);
		}
		//generic 자료구조에서는 기본 데이터 타입(int double 이런거) 를 사용할 수 없음!! 대신 integer
		//사용자 정의 데이터 타입인 클래스인 경우 정렬시
		//클레스에서 비교할 수 있는 기준이 필요하므로 Comparator을 제공해야함
		//String, Integer는 이미 존재함
		Comparator<Dept2> comp = new Comparator<Dept2>() {
			public int compare (Dept2 u1, Dept2 u2) {
				return u1.getDeptno().compareTo(u2.getDeptno()); // 인트는 못받으니까 Integer로 바꿔줌
			}
		};
		
		//정렬은 두개의 데이터를 비교하는 일임
		Collections.sort(a1, comp);
		int index = Collections.binarySearch(a1, new Dept2(30, null, null), comp); // binary로 서치하는 방법 
		//30을 찾을때도 형식을 갖춤(Dept2) null은 값없어도 되는거. comp는 비교하는 애를 넣어주는것
		System.out.println("이진검색으로 찾은 인덱스: " +index);
		if (index != -1) 
			System.out.println("이진검색으로 찾은 데이터: " + a1.get(index));
		else
			System.out.println("검색한 데이터가 없습니다");
		
		a1.get(index).setLoc("대전"); // index에 해당되는 데이터를 가지고 오기
		
		// 50번 데이터를 찾아서 삭제하시오
		index = Collections.binarySearch(a1, new Dept2(50, null, null), comp);
		if (index != -1) a1.remove(0);
		else System.out.println("삭제할 데이터가 없습니다");
		
		
		

	

	}

}
