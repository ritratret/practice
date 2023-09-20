package mirae.com;

public class a_10_for {

	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		// ctrl + / 주석처리
//
//		for (int i = 1; i <= 10; i++) {
//			if (i == 5) {
//				continue; // 5이면 그냥 계속진행하라는 뜻. break는 멈추라는것
//			}
//			System.out.println(i);
//		}

		//Java는 행중심 배열이라서 바깥게 행 먼저
		//인덱스 사용 방법: 1) 배열의 인덱스 2) 반복횟수 3)값 
//		for (int i = 1; i <= 3; i++) { //outer 행
//			for (int j = 1; j <= 3; j++) { //inner 열
//				// 이중 for 문. 이쪽의 for문이 끝난뒤에 다시 i의 for문으로 돌아가 작동
//				System.out.println(i + " " + j);
//			}
//		}
		
		int hab = 0;
		int [][] data = {{1,2,3},{4,5,6},{7,8,9}}; //밖이 배열갯수. 안의 그게 행렬 갯수
//		{1,2,3}
//		{4,5,6}
//		{7,8,9}
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b <=3; b++) {
				//(1,2) 데이터만 제외시키시오
				if (a == 1 && b == 2) {
					continue;
				}
				System.out.println( data[a][b]);
			}
		}
		
		//for문을 while로 바꾸기
		int i=1; // 초기값
		while (i<=10) { //한계값
			System.out.println(i);
			i++; //증감값
		}
		
		//do문
		i = 1; // 초기값
		do { //반드시 한번은 실행한다
			System.out.println(i);
			i++; //증감값
		}while(i<=10); //한계값
	}

}
