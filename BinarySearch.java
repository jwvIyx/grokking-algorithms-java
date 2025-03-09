package binarysearch;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binary_search(int[] arr, int item) {
		int low = 0; // primeira posição do array
		int high = arr.length - 1; // última posição do array
		
		while(low <= high) {
			// pega o elemento do meio sempre até encontrar o que está sendo buscado 
			int mid = (low + high) / 2; // divide a posicao low + high por 2 pra pegar o índice do meio 
			int guess = arr[mid];  
			
			if(guess == item) { // 1- exec: se o elemento do meio é o que está sendo buscado 
				return mid; 
			} else if(guess > item) { // se guess é maior que o num buscado 
				high = mid - 1; // ultimo elemento eh a posição do meio - 1 
			} else {
				low = mid + 1; // se guess for menor que o item, array é cortada pra daquela posicao em diante meio + 1
			}
		}
		return -1; 
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int item = 0;
		int resultado = 0;
		
		System.out.println("digite o numero a ser buscado:");
		item = sc.nextInt(); 
		
		resultado = binary_search(intArray, item);
		if(resultado != -1) {
			System.out.println("numero encontrado no indice [" + resultado + "] do array");
		} else {
			System.out.println("numero não encontrado");
		}
		
		sc.close();

	}

}
