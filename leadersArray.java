import java.util.*;
public class leadersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 22, 12, 3, 0, 6};
		List<Integer> ans = new ArrayList<>();
		int n = nums.length; int max = Integer.MIN_VALUE;
		for(int i = n-1; i>= 0; i--) {
			if(max < nums[i]) {
				max = nums[i];
				ans.add(nums[i]);
			}
		}
		
		System.out.println(ans);
		//Collections.reverse(ans) otherwise
	}

}
