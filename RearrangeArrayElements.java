package learningJava.advancedJava;

public class RearrangeArrayElements {
	    public int[] rearrangeArray(int[] nums) {
	        int positiveCounter = 0; int negativeCounter = 1;
	        int n = nums.length; int[] ans = new int[n];
	        for(int i = 0; i < n; i++){
	            if(nums[i] > 0){
	                //should be in 0, 2, 4th index
	                ans[positiveCounter] = nums[i];
	                positiveCounter+=2;
	            }
	            else{
	                ans[negativeCounter] = nums[i];
	                negativeCounter+=2;
	            }
	        }
	        return ans;
	    }
}
