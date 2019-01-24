package Template;

public abstract class Sort {

	abstract boolean needSwap(int a, int b);

	public final void sort(int[] arr){//bubble sort
		boolean flag = true;
		for (int i=0; flag && i <arr.length; i++){
			flag = false;
			for (int j=0; j < arr.length-1-i; j++){
				if(needSwap(arr[j], arr[j+1])){
					flag = true;
					swap(arr, j, j+1);
				}
			}
		}		
	}

	public void swap(int [] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
}
