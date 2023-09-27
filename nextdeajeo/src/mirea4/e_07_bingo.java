package mirea4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

// Q: [5][5] 행렬만들고 순서대로 행 우선으로 숫자를 입력하시오
public class e_07_bingo {
	public static void main(String[] args) {
		Set set = new HashSet(); // 키로 구성된 자료구조. set 중복되지 않아야하고 불허함
		//set에 범주형 데이터
		int [][] board = new int [5][5]; // 5x5 배열
		Random generator = new Random(System.currentTimeMillis());
		for (int i = 0; set.size() < 25; i++) { // 25개의 경우의 수. 횟수가 아니라 size를 제시하는중
			
			set.add(Math.abs(generator.nextInt()%25) + 1 + ""); // "" < 들어가면 문자열로 바뀐다 String 
			//0~24까지 만들어냄(%25) --> +1해서 1~25까지
		}
		//이 데이터를 board에 채우기
		Iterator it  = set.iterator();
		for(int i=0; i<board.length; i++) {
			for (int j = 0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(25); // int형 
		for (int i = 0; i<25; i++) {
			list.add(i);
		}
		Collections.shuffle(list); // 셔플. 뒤섞는다는 뜻
		//이전까지는 고정랜덤값이나 이제는 셔플. 섞어서 완전히 랜덤으로 나온다
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		itr = list.iterator();
		System.out.println("마지막 내용");
		for (int i =0; i<board.length; i++) {
			for (int j = 0; j<board[i].length; j++) {
				board[i][j] = (int)itr.next(); //String으로 변한 데이터 (int)로 casting해줘야 정상작동함
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
		

	}

}
