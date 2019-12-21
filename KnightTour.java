public class KnightTour {
	static int path = 0;
	static int arr[][]=new int[8][8];
	public static void main(String[] args) {
		//initializeChessboard();
		tourOfKnight(0,0,0);
	}

	/*public static void tourOfKnight(int arr[][],int i, int j, int num){
		if(i<0||i>7||j<0||j>7||arr[i][j] != -1){
			return;
		}
		else{
			System.out.println(Arrays.deepToString(arr));
			arr[i][j] = num;

			tourOfKnight(arr,i+2,j+1,num+1);
			tourOfKnight(arr,i+2,j-1,num+1);
			tourOfKnight(arr,i-2,j+1,num+1);
			tourOfKnight(arr,i-2,j-1,num+1);
			tourOfKnight(arr,i+1,j+2,num+1);
			tourOfKnight(arr,i-1,j+2,num+1);
			tourOfKnight(arr,i+1,j-2,num+1);
			tourOfKnight(arr,i-1,j-2,num+1);

			if(!isTourComplete(arr)){
				arr[i][j] = -1;
			}
		}
	}*/

	public static boolean tourOfKnight(int i, int j, int num){
		if(arr[i][j] != 0){
			return false;
		}
		arr[i][j] = num;
		System.out.println(num);
		if(num == 63){
			return true;
		}
		if(isPathSafe(i+2,j+1)&&tourOfKnight(i+2,j+1,num+1)){
			return true;
		}
		if(isPathSafe(i+1,j+2)&&tourOfKnight(i+1,j+2,num+1)){
			return true;
		}
		if(isPathSafe(i-1,j+2)&&tourOfKnight(i-1,j+2,num+1)){
			return true;
		}
		if(isPathSafe(i-2,j+1)&&tourOfKnight(i-2,j+1,num+1)){
			return true;
		}
		if(isPathSafe(i-2,j-1)&&tourOfKnight(i-2,j-1,num+1)){
			return true;
		}
		if(isPathSafe(i-1,j-2)&&tourOfKnight(i-1,j-2,num+1)){
			return true;
		}
		if(isPathSafe(i+1,j-2)&&tourOfKnight(i+1,j-2,num+1)){
			return true;
		}
		if(isPathSafe(i+2,j-1)&&tourOfKnight(i+2,j-1,num+1)){
			return true;
		}
		arr[i][j] = 0;
		num--;
		return false;
 
	}
	
	private static boolean isPathSafe(int i,int j){
		if(i<8&&i>=0&&j<8&&j>=0){
			return true;
		}
		else
			return false;
	}
}
