package learningJava.advancedJava;
import java.util.*;

/*
 * Step1: have a pointer j = -1
 * Step2: traversing array
 * 			if(arr[i] == 0) then j = i and break [this is done so that j points to the first instance of 0]
 * 
 * Step3: traverse the array again this time with i = j+1
 * 			if the value is not 0, then swap it and increment j [Note that j is apointer always pointing to 0]
 * print arr*/
public class MoveAllZeroes {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(8, 0 , 9 , 1, 4, 0, 2, 7, 0, 5, 6));
		
		//check for zeroes
		int j = -1;
		for(int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 0){				//element in index i for a list is accessed using get
				j = i;
				break;
			}
		}
		
		if(j == -1) return;
		
		for(int i = j+1; i < arr.size(); i++) {
			if(arr.get(i)!= 0) {
				Collections.swap(arr, i, j);
				j++;										//j always points to a zero
			}
		}
		
		System.out.println(arr);
	}
}
