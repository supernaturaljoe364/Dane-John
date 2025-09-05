package learningJava;

/*
// * the standard approach
// * 
// * int[] arr = {2, 2, 2, 1, 3, 2, 2, 1, 3, 1, 1, 3, 2, 1};
//		Map<Integer, Integer> hash = new HashMap<>();
//		for(int i = 0; i < arr.length; i++) {
//			hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);	
//		}
//		int majority = -1;
//		for(Map.Entry<Integer, Integer> entry: hash.entrySet()) {			//Entry is used to representation of key, value pairs for maps 
//			if(entry.getValue() > hash.size()/2) {
//				majority = entry.getKey();
//				System.out.println(majority);
//				break;
//			}
//		}
// * 
// * Program to count which element the occurences greater than n/2
// * Step 1: Declare a hashmap 
// * Step 2: add elements onto the hashmap, if it exists update its occurence, else add it to the hashmap and update count to 1
// * Step 3: intialise majoriy 
// * Step 4: check each elemetn in hash using Map.Entry, and have it access it from entrySet
// * 				if the current entry has more value than n/2 elements, then that is the majority
// * 
// * 
// * The OPTIMAL APPROACH(moore's voting algorithm)
* 	Step1: initialize count and element variables
* 	Step2: Traverse the entire array
					if count = 0, increment to 1, and update el to that value
					else if incoming value is equivalent to el then increment count
					else decrement count
	[by the end of the traversal cnt will have some value and the value of el will be the majority value]
	
	Step3: traverse the array one more time and count the occurence of that majority value using cnt1
				if cnt1 > half the size of array then print as THAT is the majority value
*/
public class MajorityElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 2, 2, 1, 3, 2, 2, 1, 3, 1, 1, 3, 2, 2, 2, 2, 2};
		int cnt = 0; int el = -1;
		for(int i = 0; i < arr.length; i++) {
			if(cnt == 0) {
				cnt = 1;
				el = arr[i];
			}
			else if(el == arr[i]) {
				cnt++;
			}
			else {
				cnt--;
			}
		}
		int cnt1 = 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == el) cnt1++;
		}
		if (cnt1 > arr.length/2) {
			System.out.println(el);
		}
	}
}