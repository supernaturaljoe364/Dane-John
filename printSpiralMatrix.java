import java.util.ArrayList;
import java.util.List;
public class printSpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int n = matrix.length;		//no of rows
		int m = matrix[0].length;	//no of columns
		int left = 0; int top = 0;
		int right = m-1;	int bottom = n-1;
		List<Integer> ans = new ArrayList<>();
		
		while(top <= bottom && left <= right) {
			
			for(int i = left; i<= right; i++) {
				ans.add(matrix[top][i]);
			}
			top++;
			
			for(int i = top; i<= bottom; i++) {
				ans.add(matrix[i][right]);
			}
			right--;
			
			if(top <= bottom) {
				//in situations where there are no rows left to print after the 1st for loop
				for(int i = right; i >= left; i--) {
					ans.add(matrix[bottom][i]);
				}
				bottom--;
			}
			
			if(left <= right) {
				//in situations where there are no columns left to print after the 2nd for loop
				for(int i = bottom; i>= top; i--) {
					ans.add(matrix[i][left]);
				}
				left++;
			}
		}
		
		System.out.println(ans);
		
		
	}
}
