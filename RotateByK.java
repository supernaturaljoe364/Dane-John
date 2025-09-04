package learningJava;
import java.util.Arrays;

/*given to rotate k elements on the array (left to right)
 * Step1: 
 * declare and instantiate an temp array to store the rotating values
 * Step 2: append all values from 0-d from arr to temp using a for loop from 0-d-1
 * Step 3: shift all elements from d->n-1 starting from 0 to n-d
 * Step 4: append the remainign elements, that are stored in temp, to arr from n-d to n using a for loop
 * 				(for (int i = n-d; i < n; i++)			arr[j] = temp[j - (n-d)])
 * step 5: return arr
 */

public class RotateByK {
	public static int[] Rotate(int[] arr, int d) {
		int n = arr.length;
		d = d % n;
		int[] temp = new int[d];
		
		for(int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for(int i = d; i < n; i++) {
			arr[i-d] = arr[i];
		}
		for(int j = n-d; j < n; j++) {
			arr[j] = temp[j - (n -d)];
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println("array after shifting: " + Arrays.toString(RotateByK.Rotate(arr, 3)));
	}
}

/* TO REVERSE ARRYA IN OPTIMAL SOLUTION
reverse(a, a+d);				you may not need implement this using Lists if you're going to use collections framework
reverse(a+d, a+n);				otherwise manually create a reverse function if using arrays(int[] or Integer[])
reverse(a, a+n);
*/