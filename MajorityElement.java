package learningJava.advancedJava;
import java.util.*;

/*
 * Program to count which element the occurences greater than n/2
 * Step 1: Declare a hashmap 
 * Step 2: add elements onto the hashmap, if it exists update its occurence, else add it to the hashmap and update count to 1
 * Step 3: intialise majoriy 
 * Step 4: check each elemetn in hash using Map.Entry, and have it access it from entrySet
 * 				if the current entry has more value than n/2 elements, then that is the majority*/
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 2, 2, 1, 3, 2, 2, 1, 3, 1, 1, 3, 2, 1};
		Map<Integer, Integer> hash = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);	
		}
		int majority = -1;
		for(Map.Entry<Integer, Integer> entry: hash.entrySet()) {			//Entry is used to representation of key, value pairs for maps 
			if(entry.getValue() > hash.size()/2) {
				majority = entry.getKey();
				System.out.println(majority);
				break;
			}
		}
	}

}
