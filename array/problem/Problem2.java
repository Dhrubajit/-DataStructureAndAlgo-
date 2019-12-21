package array.problem;

public class Problem2 {

	public static void main(String[] args) {
		int arr[] = {1, 4, 20, 3, 10, 5};
		System.out.println(1<<3);
		printSubArrayMatchingSumStartAndEndIndexForNonNegativeNumbers(arr,33);
	}


	//	public static void printSubArrayMatchingSumStartAndEndIndexForNonNegativeNumbers(int[] arr,int sumToCompareWith){
	//		int current_sum=arr[0];
	//		int start=0,end=0;
	//		while(current_sum != sumToCompareWith && end + 1< arr.length){
	//			if(current_sum + arr[end+1] > sumToCompareWith)
	//			{
	//				current_sum -= arr[start];
	//				start = start + 1;
	//			}
	//			else				
	//			{
	//				end = end + 1;
	//				current_sum += arr[end];
	//			}
	//		}
	//		
	//		System.out.println("start "+ start+" end "+end);
	//	}

	/*public static void printSubArrayMatchingSumStartAndEndIndexForNonNegativeNumbers(int[] arr,int desiredSum){
		int currentSum=0, i=0,j=0;
		while(currentSum != desiredSum && j<arr.length && i < arr.length){
			if(currentSum < desiredSum){
				currentSum += arr[j];
				j++;
			}
			else{
				currentSum -= arr[i];
				i++;
			}
		}

		if(currentSum == desiredSum){
			for(int k=i; k<j;k++)
				System.out.println(arr[k]+" ");
		}
	}*/
	
	
	public static void printSubArrayMatchingSumStartAndEndIndexForNonNegativeNumbers(int[] arr,int desiredSum){
		int currentSum=0, i=0,j=0;

		while(j < arr.length){
			while(j< arr.length){
				if(currentSum < desiredSum) 
					currentSum += arr[j++];
			}

			if(currentSum==desiredSum){
				System.out.println("i "+i+" j "+j);
				break;
			}

			while(i < arr.length){
				if(currentSum > desiredSum)
					currentSum -= arr[i++];
			}

		}
		
	}
}
