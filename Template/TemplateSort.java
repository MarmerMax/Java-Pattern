package Template;

import java.util.Arrays;

public class TemplateSort {

	public static void main(String[] args){
		int []array1 = {1,2,7,3,1,0,10,22,19,14,12,16,17};  
		int []array2 = {1,2,7,3,1,0,10,22,19,14,12,16,17};  

		System.out.println("SortDown:");
		Sort sd = new SortDown();
		sd.sort(array1);
		System.out.println(Arrays.toString(array1));

		System.out.println("SortUp:");
		Sort su = new SortUp();
		su.sort(array2);
		System.out.println(Arrays.toString(array2));
	}
}

