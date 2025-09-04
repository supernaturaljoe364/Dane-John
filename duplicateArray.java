package learningJava;


/*
 * traverse array
 * if elements indexed i and j not equal, 
 * 		rewrite the next element of ith with jth element
 * 		increment count
 * 
 */

public class duplicateArray{
	public static void main(String[] args) {
		int[] arr = {1,2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
		//objective: remove duplicates
		int count = 0, j = 0;					//use 2 pointer approach
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] != arr[j]) {
				arr[++j] = arr[i];
				count++;
			}
		}
		
		for(int k = 0; k<= count; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
