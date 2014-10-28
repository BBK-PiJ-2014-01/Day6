public MatrixChecker {

	public boolean isSymmetrical(int[] valueSet) {
		boolean result = true;
		int i = 0;
		do {
			if (valueSet[i] != valueSet[valueSet.length-1-i])
				result = false;
			i++;
		} while ((result == true) && (i <= valueSet.length-1-i))
		return(result);
	}

	public boolean isSymmetrical(int[][] valueSet) {
		boolean result = true;
		for (int i=0; i<valueSet.length; i++)
			for (int j=0; j<valueSet.length;j++)
				if (valueSet[i][j] != valueSet[j][i])
					result = false;
		return(result);
	}

	public boolean isTriangular(int[][] valueSet) {
		boolean result = true;
		for (int i=0; i<valueSet.length; i++)
			for (int j=0; j<valueSet.length;j++)
				if ((i>j) && (valueSet[i][j] != 0))
					result = false;
		return(result);
	}
}