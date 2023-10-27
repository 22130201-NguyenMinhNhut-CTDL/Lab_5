package Task1;

public class Task1_3 {
	public static int[][] multiply(int[][] a, int[][] b){
		int row_a = a.length;
		int colums_a = a[0].length;
		int row_b= b.length;
		int colums_b = b[0].length;
		int result[][] = new int [row_a][colums_b];
		
		for(int i =0; i<row_a;i++) {
			for(int j=0; j < colums_b;j++) {
				int sum =0;
				for(int k=0; k< colums_a; k++) {
					sum+= a[i][k] * b[k][j];
				}
				result[i][j] = sum;
			}
		}
		return result;
	}
    public static void main(String[] args) {
    	int [][] array1 = {{1,2,3,4}, {5,6,7,8}};
    	int [][] array2 = {{1,2,3}, {4,5,6}, {3,4,5}, {7,8,9}};
    	
    	int mul [][] = multiply(array1, array2);
		for(int i =0; i<mul.length; i++) {
			for(int j=0; j< mul[i].length; j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}

}


