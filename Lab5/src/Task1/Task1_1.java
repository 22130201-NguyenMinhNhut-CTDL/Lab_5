package Task1;

public class Task1_1 {
	public static int[][] add(int[][] a, int[][] b) {
	    if (a.length != b.length || a[0].length != b[0].length) {
	        return null;
	    }

	    int rows = a.length;
	    int columns = a[0].length;
	    int[][] result = new int[rows][columns];

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < columns; j++) {
	            result[i][j] = a[i][j] + b[i][j];
	        }
	    }

	    return result;
	}
}
