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

	public String toString() {
		String output = "[";
		for (int i=0; i< matrix2D.length; i++)
			for (int j=0; j< matrix2D[0].length; j++) {
				output = output + matrix2D[i][j];
				if (j==matrix2D[0].length-1)
					output += ";";
				else
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
}