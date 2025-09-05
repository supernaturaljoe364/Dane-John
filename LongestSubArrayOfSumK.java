package learningJava.advancedJava;
import java.util.*;
public class LongestSubArrayOfSumK {
	public static void main(String[] args) {
		
		/*Step 1: Create a HashMap preSumMap to store the long type sum(key) and Integer type index position i(value)
		 *Step 2: Loop through all elements in arr
		 *			add it to sum (sum += arr[i])
		 *
		 *	Step 2.1:if sum = k[all elements from 0-i are sum which is equal to k, so the length is i+1]
		 * 				else then take the sum of 0-jth elements for the sum of j->i is k and the total summ is sum
		 * 						(therefore rem  = sum - k)
		 * 				
		 * Step 2.2: if(preSumMap.containsKey(rem))[check if that rem exists that consititues the length j]
		 * 				find the length(j) [index of the current element (i) - index of the element till rem ]
		 * 
		 *  Step 3.2: if sum doesn't exist in preSumMap then add it to the hashmap*/
		int[] arr = {1, 2, 3, 1, 1, 1, 1, 4 ,2 , 3};
		int maxLen = 0; int k = 6;
		Map<Long, Integer> preSumMap = new HashMap<>();
		long sum = 0L;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if(sum == k) {
				maxLen = Math.max(maxLen, i+1);
			}
			long rem = sum - k;
			
			if(preSumMap.containsKey(rem)) {						/*if rem exists already in the hashmap, then update the 
																	length*/
				int len = i - preSumMap.get(rem);					
				maxLen = Math.max(maxLen, len);
			}
			
			if (!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
				
			}
		}
	}
	
}
