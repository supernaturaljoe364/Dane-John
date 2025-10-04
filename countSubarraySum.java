package learningJava.advancedJava;
import java.util.HashMap;

public class countSubarraySum {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
		int k = 3;
		int cnt = 0;
		int sum = 0;
		HashMap<Integer, Integer> hash = new HashMap<>();
		hash.put(0, 1);
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (hash.containsKey(sum - k)) {
                cnt += hash.get(sum - k);
            }

            // update frequency of current prefix sum
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
		}
		
		System.out.println(cnt);
		
	}
}
