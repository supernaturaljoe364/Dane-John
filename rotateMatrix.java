
class rotateMatrix {
	    public void rotate(int[][] matrix) {
	        int n = matrix.length;
	        int m = matrix[0].length;
	        for(int i = 0; i< n; i++){
	            for(int j = i+1; j <n; j++){
	            	swap(matrix, i, j);
	            }
	        }
	        
	        for(int i = 0; i< n; i++) {
	        	reverse(matrix[i]);
	        }
	    }


	    
	    public static void swap(int[][] matrix, int i, int j){
	        int temp = matrix[i][j];
	        matrix[i][j] = matrix[j][i];
	        matrix[j][i] = temp;
	    }

	    public static void reverse(int[] arr){
	    	int a = 0;
	    	int b = arr.length -1;
	        while(a < b){
	            int temp = arr[a];
	            arr[a] = arr[b];
	            arr[b] = temp;
	            a++;
	            b--;
	        }
	    }
}
