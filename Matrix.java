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

	public boolean setRow (int row, String valueSet) {
		String[] tempSet = new String[matrix2D[0].length];
		for (int i=0; i<tempSet.length; i++)
			tempSet[i]="";
		if ((row<=matrix2D.length)) {
			int j = 0;	
			for (int i=0; i<valueSet.length(); i++) {
				if (Character.isDigit(valueSet.charAt(i)))
					tempSet[j] += valueSet.charAt(i);
				else
					if (valueSet.charAt(i)==',')
						j++;
					else
						return(false);			
			}
			if (j==matrix2D[0].length-1) {
				for (int i=0; i<=j; i++)
					matrix2D[row][i] = Integer.parseInt(tempSet[i]);
				return(true);
			} else
				return(false);
		} else
			return(false);
	}

	public boolean setColumn (int column, String valueSet) {
		String[] tempSet = new String[matrix2D.length];
		for (int i=0; i<tempSet.length; i++)
			tempSet[i]="";
		if ((column<=matrix2D[0].length)) {
			int j = 0;	
			for (int i=0; i<valueSet.length(); i++) {
				if (Character.isDigit(valueSet.charAt(i)))
					tempSet[j] += valueSet.charAt(i);
				else
					if (valueSet.charAt(i)==',')
						j++;
					else
						return(false);			
			}
			if (j==matrix2D.length-1) {
				for (int i=0; i<=j; i++)
					matrix2D[i][column] = Integer.parseInt(tempSet[i]);
				return(true);
			} else
				return(false);
		} else
			return(false);
	}

	public boolean setMatrix(String valueSet) {

		String[][] tempSet = new String[matrix2D.length][matrix2D[0].length];		
		for (int i=0; i<matrix2D.length ; i++)
			for (int j=0; j<matrix2D[0].length ; j++)
				tempSet[i][j]="";
		
		int i=0;
		int j=0;
		int pointer = 1;
		do {
			if (Character.isDigit(valueSet.charAt(pointer)))
					tempSet[i][j] += valueSet.charAt(pointer);
				else
					if (valueSet.charAt(pointer)==',')
						j++;
					else
						if (valueSet.charAt(pointer)==';') {
							i++;
							j=0;	
						}
			pointer++;			
		} while (valueSet.charAt(pointer)!=']');

		if ((matrix2D.length == i+1) && (matrix2D[0].length == j+1)) {
			for (int x=0; x< matrix2D.length; x++)
				for (int y=0; y< matrix2D[0].length; y++)
					matrix2D[x][y] = Integer.parseInt(tempSet[x][y]);
			return(true);
		} else
			return(false);
	}

	public String toString() {
		String output = "[";
		for (int i=0; i< matrix2D.length; i++)
			for (int j=0; j< matrix2D[0].length; j++) {
				output = output + matrix2D[i][j];
				if ((j==matrix2D[0].length-1) && (i!=matrix2D.length-1))
					output += ";";
				if (j!=matrix2D[0].length-1)
					output += ",";
			}
		output += "]";
		return(output);	
	}

	public void prettyPrint() {
		for (int i=0; i<matrix2D.length ; i++) {
			System.out.println();
			for (int j=0; j<matrix2D[0].length ; j++)
				System.out.print(matrix2D[i][j] + "\t");
		}
		System.out.println();
	}

	public void matrixCheckerTest() {
		MatrixChecker matrixChecker = new MatrixChecker();
		System.out.println("Symmetrical? "+ matrixChecker.isSymmetrical(matrix2D));
		System.out.println("Triangular? "+ matrixChecker.isTriangular(matrix2D));  
	}
}