package graph.Problem;

public class Problem1 {
	public static void main(String[] args) {
		System.out.println(countMin(2, 5));
	}

	public static int countMin(int x, int y)
	{
		if(x == y){
			return 0;
		}
		else if(x <= 0){
			return Integer.MAX_VALUE;
		}
		else if(x>y){
			return countMin(x-1,y);
		}
		else {
			System.out.println("x= "+x+" y= "+y);
			return Math.min(countMin(x*2, y), countMin(x-1,y));
		}
	}
}
