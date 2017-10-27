package task6_7;

public class hometask02 {
	public static void main(String[] args) {
		/*
		 * В целочисленной последовательности есть нулевые элементы. Создать массив из
		 * номеров этих элементов.
		 */
		
		int[] ar = {2, 0, 5, 0, 7, 9};
		int t = 0;
		for(int i = 0; i < ar.length; i++) {
				if(ar[i] == 0) {
					t++;
				}
			}
		int[] ar1 = new int[t];
		for(int k = 0; k < t ; k++) {
			for(int j = 0; j < ar.length; j ++) {
				if(ar[j] == 0) {
					ar1[k] = j;
				}
			}
		}
		
		for(int z = 0; z < ar1.length; z++) {
			System.out.println(ar1[z]);
		}
	}
	
}
