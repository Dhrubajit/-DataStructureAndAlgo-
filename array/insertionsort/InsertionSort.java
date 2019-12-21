package array.insertionsort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] test1 = {7,2,9,3,2,8,4};
		insertionSort(test1);
		System.out.println(Arrays.toString(test1));

		int[] test2 = {2,2,2,2,2};
		insertionSort(test2);
		System.out.println(Arrays.toString(test2));

		int[] test3 = {1,2,3,4,5};
		insertionSort(test3);
		System.out.println(Arrays.toString(test3));

		int[] test4 = {5,4,3,2,1};
		insertionSort(test4);
		System.out.println(Arrays.toString(test4));
		
		int[] test5 = {10};
		insertionSort(test5);
		System.out.println(Arrays.toString(test5));

	}


	public static void insertionSort(int[] arr){
		for(int i=1; i < arr.length;i++){
			int j = i-1;
			int key = arr[i];
			while(j>=0 && key < arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key; 
		}
	}


}
