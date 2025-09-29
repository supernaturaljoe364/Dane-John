import java.util.*;
public class nextPermutation {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 5, 4, 3, 0, 0));
		int ind = -1;
		int n = nums.size();
		for(int i = n-2; i >= 0; i--) {
			if(nums.get(i) < nums.get(i+1)) {
				ind = i;
				break;
			}
		}
		
		if(ind != -1) {
			for(int i = n-1; i >= 0; i--) {
				if(nums.get(ind) < nums.get(i)){
					Collections.swap(nums, ind, i);
					break;
				}
			}
		}
		
		reverse(nums, ind+1, n-1);
		
		System.out.println(nums);
		
	}
	
	public static void reverse(List<Integer> nums, int ind, int n) {
		while(ind < n) {
			Collections.swap(nums, ind, n);
			ind++; n--;
		}
	}
}
