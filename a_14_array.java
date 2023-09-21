package Daejeon_1.src.mirae.com;

public class a_14_array {

	public static void main(String[] args) {
		int arr[] = { 2, 11 ,45, 9}; // 1차원
		for (int num : arr) { // 확장 for 문
		System.out.println(num);
		}
		
		int[] a = new int[4];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400; // 초기화
		
		int sum = 0;
		sum = a[0] + a[1] + a[2] + a[3];
		for (int i = 0; i<a.length; i++) {
			int temp = a[i];
			sum += temp;
			System.out.println(temp);
		}
		System.out.printf("배열의 총 합은 %d 입니다. \n", sum);
		
		int [] score = {77, 88, 91, 33, 100, 55, 95 }
		//최대값과 최솟값
		int max = score[0];
		int min = score[0];
		for( int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최솟값: " + min);

	}

}
