public class Matrix {

	private int[][] matrix2D;

	public Matrix (int numberOfRows, int numberOfColumns) {
		matrix2D = new int[numberOfRows][numberOfColumns];
		for (int i=0; i<numberOfRows ; i++)
			for (int j=0; j<numberOfColumns ; j++)
				matrix2D[i][j]=1;
	}

	public boolean setElement (int rowNumber, int columnNumber, int value) {
		if ((rowNumber<=matrix2D.length) && (columnNumber<=matrix2D[0].length)) {
			matrix2D[rowNumber-1][columnNumber-1] = value;
			return(true);
		} else
			return(false);	
	}
/*
	public boolean setRow (int row, String valueSet) {
		int[] tempSet = new int[matrix2D.length];
				
		if ((rowNumber<=matrix2D.length))

	}

	public boolean setColumn (int column, String valueSet) {

	}

	public String toString() {

	}
*/
	public void prettyPrint() {
		for (int i=0; i<matrix2D.length ; i++) {
			System.out.println();
			for (int j=0; j<matrix2D[0].length ; j++)
				System.out.print(matrix2D[i][j] + "\t");
		}
		System.out.println();
	}
}