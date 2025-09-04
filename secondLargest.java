package learningJava;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 5, 2, 7, 3, 9, 1, 4};
		int sLargest = 0;
		int largest = 0;
		for(int i : arr) {
			if(i >= largest) {
				sLargest = largest;
				largest = i;
			}
			else if (i < largest && i >= sLargest) {
				sLargest = i;
			}
		}
		
		System.out.println(sLargest);
	}

}
