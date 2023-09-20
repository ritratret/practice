package mirae.com;

public class a_13_star {

	public static void main(String[] args) {
		int row = 10;
//		for (int i= 0; i<row; i++) { // 10x10 행렬
//			for (int j = 0; j<row; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//		for (int i= 0; i<row; i++) { // 왼쪽아래 삼각형
//			for (int j = 0; j < i; j++) { // 종료점이 i의 기준에 맞춰 간다
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//		
//		for (int i= 0; i<row; i++) { // 왼쪽위 삼각형
//			for (int j = 10; j > i ; j--) { // 공백조절
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//
//		for (int i= 0; i < row; i++) { // 오른쪽 아래 삼각형
//			for (int j = 2 * (row - i); j >= 0; j--) { //공백을 먼저 둬준다
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//
//		for (int i= 0; i < row; i++) { // 삼각형
//			for (int j = row - i; j > 1; j--) { //공백을 먼저 둬준다
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//
//
//
//		//구구단
//		for (int first = 2; first < 10; first++) {
//			for (int second = 2; second <= 9; second++) {
//				System.out.printf("%2d * %d = %2d",
//				second, first, first*second);
//			}
//			System.out.println();
//		}
//
//		int first = 2;
//		while(first <=9) {
//			int second = 1;
//			while(second <=9) {
//				System.out.printf("%2d * %d = %2d",
//				second, first, first*second);
//				second++;
//			}
//			first++;
//			System.out.println();
//		}
		
		for (int i= 0; i < row; i++) { // 오른쪽 아래 삼각형
			for (int j = 1 * (row - i); j >= 0; j--) { //공백을 먼저 둬준다
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for (int i= 0; i < row; i++) { // 오른쪽 아래 삼각형
			for (int j = 2 * (row - i); j >= 0; j--) { //공백을 먼저 둬준다
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for (int i= 0; i < row; i++) { // 오른쪽 아래 삼각형
			for (int j = 3 * (row - i); j >= 0; j--) { //공백을 먼저 둬준다
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}


