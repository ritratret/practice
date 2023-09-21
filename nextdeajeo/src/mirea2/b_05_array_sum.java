package mirea2;

public class b_05_array_sum {

	public static void main(String[] args) {
		//문제 배열 데이터를 받아 합계를 낸 다음 리턴하는 함수를 작성하시오
		//데이터 받아 다 더하고 리턴하는 함수. 주소를 받음
		int temp1[] = {10,20,30,40};
		int temp2[] = {100,200,300,400};
		
		int hab = sumArray(temp1);
		System.out.println("배열의 합계 = " + hab);
		hab = sumArray(temp2);
		System.out.println("배열의 합계 = " + hab);
		
	} // 배열을 돌아가면서 다 저장
	public static int sumArray(int temp1[]) { // 영역이 달라서 이름 같아도 상관없음
		int hab = 0;
		for (int i = 0; i< temp1.length; i++) { // 배열의 갯수보다 작을때까지만
			hab += temp1[i];
		}
		return hab;
	}
}


