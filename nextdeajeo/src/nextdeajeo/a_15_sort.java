package nextdeajeo;

public class a_15_sort {

	public static void main(String[] args) {
		int [] number = new int [10];
		for (int i = 0; i<number.length; i++) {
			number[i] = i;
			System.out.print(number[i] + " ");
		}
		System.out.println("\n");
		
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		//bubble 정렬: 배열에서 버블처럼 하나씩 비교하면서 점점 떠오른다
		for (int i = 0; i < number.length; i++) {
			for (int j=0; j<number.length-i -1; j++) {
				if (number[j] > number[j+i]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
	

	}

}
