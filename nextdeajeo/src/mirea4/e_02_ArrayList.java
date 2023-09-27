package mirea4;

import java.util.ArrayList;

public class e_02_ArrayList {

	public static void main(String[] args) {
		int n = 10;
		//int, primitive type 은 사용안함
		//사이즈를 자동으로 조절
		//랜덤으로 위치 데이터에 접근 가능
		//multi thread : 동시에 실행되는 process
		//속도가 빠른 cpu time을 나누어서 실행 
		//ArrayList VS Vector(벡터는 동기화가 가능: 동시에 접근할 때 안전하다. 근데 이제안씀)
		
		//ArrayList는 배열처럼 행동하는 list로 구성된 배열
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n); // +a 알아서 더 만든다
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);
		
		for (int i = 1; i<=1000;i++) { // n은 10개까지지만 i<=1000으로 할 시 1000개까지 늘어난다
			arr1.add(i); // 자동으로 공간 늘려서 확보(여유치를 갖고있음)
			arr2.add(i);
		}
		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);
		
	}

}
