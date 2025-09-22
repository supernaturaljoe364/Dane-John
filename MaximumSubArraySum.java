package learningJava.advancedJava;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// using kadane's algorithm
		int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int n = nums.length;
		for(int i = 0; i < n; i++) {
			sum+= nums[i];
			if (sum > max) {
				max = sum;
			}
            else if (sum < 0) sum = 0;
		}
		System.out.println(max);

	}

}
