package Task1;

public class Task1_4 {
	public static int[][] transpose(int[][] a) {
		int[][] result = new int[a[0].length][a.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[j][i];
			}
		}
		return result;
	}

	public static void printArr(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] b = { { 7, 5, 2 }, { 1, 8, -3 } };
		int[][] c = { { 3, 5, 2 }, { 1, -8, 4 }, { 4, 7, 2 }, { 2, 0, 3 } };
		printArr(transpose(a));
		printArr(transpose(b));
		printArr(transpose(c));
	}

}
