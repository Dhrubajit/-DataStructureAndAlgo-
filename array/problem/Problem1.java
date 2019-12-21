package array.problem;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		int arr[] = {2,0,0,5,0};
		solve(arr);
		System.out.println(Arrays.toString(arr));
	}


	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}

	public static void solve(int arr[]){
		int i=0,j=arr.length-1;
		while(i < arr.length && j>i){
			if(arr[i] == 0){
				if(arr[j]==0){
					j--;
				}
				else
				{
					swap(arr,i,j);
					i++;
					j--;
				}
			}
			else
				i++;
		}
	}
	
	//Working implementation.But complicated looping. That is why commented it.
	
	/*public static void solve(int arr[]){
		int i=0,j=arr.length-1;
		while(i < arr.length){
			if(arr[i] == 0){
				while(j>i && arr[j]==0){
					j--;
				}
				swap(arr,i,j);
			}
			i++;
		}
	}*/

}
