package learningJava;
import java.util.Arrays;


//USING THE DUTCH NATIONAL FLAG ALGORITHM
public class Sort0s1s2s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 1, 0, 2, 2, 0, 1, 0, 0};
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


//alternative approach using lists
//	List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 1, 0, 2, 2, 0, 1, 0, 0));
//	int low = 0, mid = 0, high = arr.size()-1;
//	while(mid <= high) {
//		if(arr.get(mid) == 0) {
//			Collections.swap(arr, low, mid);						//Collections.swap only work for Object arrays not prims
//			low++; mid++;
//		}
//		else if (arr.get(mid) == 1) {
//			mid++;
//		}
//		else {
//			Collections.swap(arr	, mid, high);
//			high--;
//		}
//	}
//	
//	System.out.println(arr);
