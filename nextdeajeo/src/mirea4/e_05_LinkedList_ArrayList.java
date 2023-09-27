package mirea4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList / LinkedList 순서별 시간 비교
public class e_05_LinkedList_ArrayList {
	//LinkedList : 삽입삭제가 빈번한 경우
	
	public static long add1(List list) {
		//1970년 1월 1일부터 밀리세컨드로 표현된 수치를 리턴
		long start = System.currentTimeMillis(); // millisecond 1/1000 초
		for (int i =0;i<100000; i++)
			list.add(i + "");
		long end  = System.currentTimeMillis();
		return end - start; // 경과시간을 long형으로 리턴. 끝난시간-시작시간=경과시간
	}
	
	public static long add2(List list) {
		//1970년 1월 1일부터 밀리세컨드로 표현된 수치를 리턴
		long start = System.currentTimeMillis(); // millisecond 1/1000 초
		for (int i =0;i<1000; i++)
			list.add(500 + "X");
		long end  = System.currentTimeMillis();
		return end - start; // 경과시간을 long형으로 리턴. 끝난시간-시작시간=경과시간
	}
	
	public static long remove1(List list) { // 중간 삭제 순차적..
		long start = System.currentTimeMillis();
		for ( int i = list.size() - 1; i > 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove2(List list) { // 전체 삭제
		long start = System.currentTimeMillis();
		for ( int i = 0; i > 1000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static void main(String[] args) { 
		ArrayList a1 = new ArrayList();
		LinkedList l1 = new LinkedList();
		
		System.out.println("= 순차적으로 추가하기 =");//순차적으로 처리시 배열이 빠름 array
		System.out.println("ArrayList : "+add1(a1)); // 16 
		System.out.println("LinkedList : "+add1(l1)); // 17
		System.out.println();
		System.out.println("= 중간에 추가하기 ="); // 삽입삭제는 linked가 빠름
		System.out.println("ArrayList : "+add2(a1)); // 16
		System.out.println("LinkedList : "+add2(l1)); // 1 <걸린시간
		System.out.println();
		System.out.println("= 중간에서 삭제하기 ="); // 
		System.out.println("ArrayList : "+remove2(a1)); // 12
		System.out.println("LinkedList : "+remove2(l1)); // 3
		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList : "+remove1(a1)); // 2
		System.out.println("LinkedList : "+remove1(l1)); // 2
		
	}

}
