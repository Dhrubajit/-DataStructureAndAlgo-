package heap;

import java.util.Arrays;

import heap.maxheap.MaxHeap;
import heap.maxheap.UnderflowException;

public class Test {

	public static void main(String[] args) throws UnderflowException {
		int arr1[] = {100,50,60,30,26,11};
		System.out.println(MaxHeap.isMaxHeap(arr1));
		
		int arr2[] = {100,50,60,30,200,11};
		System.out.println(MaxHeap.isMaxHeap(arr2));
		
		int arr3[] = {1,50,60,30,26,11};
		MaxHeap.maxHeapify(arr3, 0,arr3.length);
		System.out.println(Arrays.toString(arr3));
		
		int arr4[] = {1,2,3,4,5,6};
		MaxHeap.buildMaxHeap(arr4, arr4.length);
		System.out.println(Arrays.toString(arr4));
		
		int arr5[] = {1,2,3,4,5,6};
		MaxHeap maxHeap = new MaxHeap(arr5);
		System.out.println(maxHeap.extractMax());
		System.out.println(Arrays.toString(arr5));
		System.out.println(maxHeap.getHeapLenth());
	}

}
