
public class setMatrixZero {
	public static void main(String[] args) {
		
		int n = 4, m = 4;
		int[][] matrix = new int[4][4];
		int col0 = 1;
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix[i][j] == 0) {
					//mark the column and row of the matrix for the next loop
					matrix[i][0] = 0;
					if(j != 0) {					
						//if its at 0th column, then don't update the [0][0], instead update col0 to avoid overlapping
						matrix[0][j] = 0;
					}
					else col0 = 0;
				}
			}
		}
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				if(matrix[i][j] != 0) {
					//actually apply 0 on those values whose row and column val are 0
					if(matrix[0][j] == 0 || matrix[i][0] == 0) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		
		if(matrix[0][0] == 0) {
			//change all elements in the row array to 0
			for(int j = 0; j < m; j++) {
				matrix[0][j] = 0;
			}
		}
		if (col0 == 0) {
			//change all column array elements to 0 AFTER row elements
			for(int i = 0; i < n; i++) {
				matrix[i][0] = 0;
			}
		}
	}
}
