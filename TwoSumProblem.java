package learningJava;
import java.util.*;

/*
 * Porgram to return the indices of two numbers in an arrya that sum upto target value
 * 
 * Step 1: Declare target and an array varialbe\
 * Declare a HashMap 
 * loop from 0->n
 * 	declare rem = target - arr[i];
 * 	check if rem exists in the hash using containsKey, if it does, then take its value using get()
 * 			 and return current index and that index value;
 * 	else add it to the hashMap using the put function putting rem and the index value 
 * */
public class TwoSumProblem {

	public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            int rem = target - arr[i];
            if(hash.containsKey(rem)){
                int index = hash.get(rem);
                return new int[]{index, i};
            }
            else if (hash.isEmpty() || !hash.containsKey(rem)){
                hash.put(arr[i], i);
            }
        }
        return new int[]{};
    }
	
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int target = 18;
		TwoSumProblem t1 = new TwoSumProblem();				//twoSUm is non-static, calling non-static method in static reference 
		System.out.println(Arrays.toString(t1.twoSum(arr, target))); //is nto possible unless an objecy is made, (t1), else make twoSum static
		
	}

}
