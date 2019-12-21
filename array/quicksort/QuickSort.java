package array.quicksort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] test1 = {7,2,9,3,2,8,4};
		quickSort(test1,0,test1.length-1);
		System.out.println(Arrays.toString(test1));
		
		//This kind of input will drive the algorithm to worst case scenario.
		//This will cause O(n^2) running time.
		int[] test2 = {2,2,2,2,2};
		quickSort(test2,0,test2.length-1);
		System.out.println(Arrays.toString(test2));
		
		//This kind of input will drive the algorithm to worst case scenario.
		//This will cause O(n^2) running time.
		int[] test3 = {1,2,3,4,5};
		quickSort(test3,0,test3.length-1);
		System.out.println(Arrays.toString(test3));
		
		//This kind of input will drive the algorithm to worst case scenario.
		//This will cause O(n^2) running time.
		int[] test4 = {5,4,3,2,1};
		quickSort(test4,0,test4.length-1);
		System.out.println(Arrays.toString(test4));
		
		int[] test5 = {10};
		quickSort(test5,0,test5.length-1);
		System.out.println(Arrays.toString(test5));
	}
	
	public static void quickSort(int[] arr,int p, int r){
		if(p<r){
			int q = partition(arr,p,r);
			quickSort(arr,p,q-1);
			quickSort(arr,q+1,r);
		}
		
	}
	
	public static int partition(int[] arr, int p, int r){
		int i = p-1,j=p;
		int key = arr[r];
		while(j<r){
			if(arr[j]<=key){
				++i;
				swap(arr,i,j);
			}
			j++;
		}
		++i;
		swap(arr,i,r);
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
