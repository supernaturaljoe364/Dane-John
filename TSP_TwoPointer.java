package learningJava.advancedJava;
//the most optimal approach to the two sum problem using two pointer
public class TSP_TwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 6, 8, 11};
		int target = 14;
		int left = 0;
		int right = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			int sum = arr[left] + arr[right];
			if (sum > target) {
				right = right - 1;
			}
			else if (sum < target) {
				left = left + 1;
			}
			else {
				System.out.println(left + " " + right); break;
			}
		}
	}

}
