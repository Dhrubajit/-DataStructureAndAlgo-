package heap.maxheap;

public class MaxHeap {
	
	private int[] heap;
	private int heapLength;
	
	
	public MaxHeap(int[] arr) {
		super();
		buildMaxHeap(arr,arr.length);
		this.heapLength = arr.length;
		this.heap = arr;
	}

	public static boolean isMaxHeap(int arr[]){
		for(int i=0;i<=arr.length/2;i++){
			int left = 2*i+1;
			int right = 2*i+2;
			if(left < arr.length && right < arr.length){
				if(arr[i] < arr[left] || arr[i]<arr[right]){
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void maxHeapify(int arr[], int largest,final int heapLength){
		int left = 2*largest+1;
		int right = 2*largest+2;
		int index = largest;
		if(left < heapLength && arr[largest] < arr[left]){
			largest = left;
		}
		else 
			largest = index;
		if(right < heapLength && arr[largest] < arr[right]){
			largest = right;
		}
		if(largest != index){
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			maxHeapify(arr,largest,heapLength);
		}
	}
	
	public static void buildMaxHeap(int[] arr,final int heapLength){
		
		for(int i=heapLength/2;i>=0;i--){
			maxHeapify(arr,i,heapLength);
		}
	}

	public int[] getHeap() {
		return heap;
	}

	public void setHeap(int[] heap) {
		this.heap = heap;
	}

	public int getMax(){
		return heap[0];
	}
	
	public int extractMax() throws UnderflowException{
		if(this.heapLength < 0){
			throw new UnderflowException("Heap Underflow");
		}
		int max = heap[0];
		heap[0]= heap[this.heapLength-1];
		this.heapLength = this.heapLength - 1;
		maxHeapify(heap,0,this.heapLength);
		return max;
	}
	
	public boolean insert(int key) throws OverflowException{
		if(this.heapLength == heap.length){
			throw new OverflowException("Heap Overflow");
		}
		heap[this.heapLength+1] = key;
		int i = 0;
		while()
		
	}

	public int getHeapLenth() {
		return this.heapLength;
	}
}
