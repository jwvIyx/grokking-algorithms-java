package binarysearch;
import java.util.Scanner; 

public class BinaryVsLinear {
	
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
	
	public static int linear_search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) { 
			int guess = arr[i];
			if (guess == item) {
				return i; 
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] largeArray = new int[1000000];
		
		
		for (int i = 0; i < largeArray.length; i++) {
			largeArray[i] = i;
		}
		
		int item = 999999; 
		int resultado = 0;
		int numTests = 10; 
		

		long totalBinaryTime = 0;
		for (int i = 0; i < numTests; i++) {
			long startTime = System.nanoTime(); 
			resultado = binary_search(largeArray, item);
			long endTime = System.nanoTime();
			totalBinaryTime += (endTime - startTime);
		}
		System.out.println("tempo medio de exec. binary_search:" + totalBinaryTime / numTests + " nanosegundos");
		

		long totalLinearTime = 0;
		for (int i = 0; i < numTests; i++) {
			long startTime2 = System.nanoTime(); 
			int resultado2 = linear_search(largeArray, item);
			long endTime2 = System.nanoTime();
			totalLinearTime += (endTime2 - startTime2);
		}
		System.out.println("tempo medio de exec. linear_search: " + totalLinearTime / numTests + " nanosegundos");
		
		sc.close();
	}
}
