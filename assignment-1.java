public class onlineassign__1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter no of columns: ");
		int cols = sc.nextInt();

		int[][] mat = new int[rows][cols];
		System.out.println("Enter matrix elements (row by row):");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		for (int i = 0; i < rows; i++) {
			double sum = 0.0;
			for (int j = 0; j < cols; j++) sum += mat[i][j];
			System.out.println("Sum of row " + i + ": " + sum);
		}

		for (int j = 0; j < cols; j++) {
			double sum = 0.0;
			for (int i = 0; i < rows; i++) sum += mat[i][j];
			System.out.println("Sum of column " + j + ": " + sum);
		}

		int n = Math.min(rows, cols);
		double mainDiag = 0.0, revDiag = 0.0;
		for (int i = 0; i < n; i++) {
			mainDiag += mat[i][i];
			revDiag += mat[i][cols - 1 - i];
		}
		System.out.println("Primary diagonal sum (top-left to bottom-right): " + mainDiag);
		System.out.println("Secondary diagonal sum (top-right to bottom-left): " + revDiag);

		sc.close();
	}
}