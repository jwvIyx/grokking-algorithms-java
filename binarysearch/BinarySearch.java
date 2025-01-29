package binarysearch;
import java.util.Scanner; 

public class BinarySearch {
	
	public static int binary_search(int[] arr, int item) {
		int low = 0;
	    int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2; 
			int guess = arr[mid];
			
			if (guess == item) {
				return mid;
			} else if (guess > item) {
				high = mid - 1; 
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int[] largeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int item = 0;
		int resultado = 0;
		
		System.out.println("digite o numero a ser buscado:");
		item = sc.nextInt(); 
		
		resultado = binary_search(largeArray, item);
		System.out.println("item encontrado no indice [" + resultado + "] do array");
			
		
		
	}
}
