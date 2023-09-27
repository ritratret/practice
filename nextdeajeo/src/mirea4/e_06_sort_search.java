package mirea4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e_06_sort_search {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();
		System.out.println("데이터 한개를 입력하십시오");
		Scanner scan = new Scanner(System.in);
		arraylist.add(scan.nextLine());
		//추가(맨 뒤)
		
		arraylist.add("천안");
		arraylist.add("천안");
		arraylist.add("거제");
		arraylist.add(2, "대구"); // 대구 2번에 삽입
		arraylist.add("서울");
		
		System.out.println(arraylist.get(1));
		//정렬
		//Iterator -> Collection -> List -> ArrayList (상속받는 순서)
		//Interface: 약속 -> sort함수를 반드시 구현해야 하기 때문에
		Collections.sort(arraylist); //sort는 원본 데이터에 작업(정렬)
		System.out.println(arraylist.get(1));
		//도수 (몇개나 겹치는게 있는지)
		System.out.println(Collections.frequency(arraylist, "천안"));
		//검색 (binarySearch:전체 조건~ 정렬)
		System.out.println("검색" + Collections.binarySearch(arraylist, "대구")); // 대구를 찾아라
		System.out.println(arraylist); // 정렬은 꼭 해줘야 한다.
		
		//삭제 remove
		arraylist.remove("천안"); //처음만나는 것 하나만 삭제 
		System.out.println(arraylist);
		
		//수정 set (순서, 바꿀 문장)
		arraylist.set(1, "대전"); // 인덱스
		System.out.println(arraylist);
		
		

	}

}
