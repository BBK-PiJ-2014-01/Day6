public class Target {

	private int[][][] matrix;

	int target_x;
	int target_y;
	int target_z;

	public Target(int size) {
		matrix = new int[size][size][size];
		for (int i=0;i<size;i++)
			for (int j=0;j<size;j++)
				for (int k=0;k<size;k++)
					matrix[i][j][k] = 0;
	}

	public void init() {
		target_x = (int) Math.abs(matrix.length * Math.random());
		target_y = (int) Math.abs(matrix.length * Math.random());
		target_z = (int) Math.abs(matrix.length * Math.random());
		matrix[target_x][target_y][target_z] = 1;
	}

	public Result fire (int x, int y, int z) {
		Result feedback = Result.OUT_OF_RANGE;
		if ((x >= matrix.length)||(y >= matrix.length)||(z >= matrix.length)||(x<0)||(y<0)||(z<0))
			return(Result.OUT_OF_RANGE);
		if (matrix[x][y][z] == 1)
			return(Result.HIT);
		if (x < target_x)
			feedback = Result.FAIL_LEFT;
		else 
			if (x > target_x)	
				feedback = Result.FAIL_RIGHT;
			else
				if (x == target_x)
					if (y < target_y)
						feedback = Result.FAIL_LOW;
					else
						if (y > target_y)
							feedback = Result.FAIL_HIGH;
						else 
							if (y == target_y)
								if (z < target_z)					
									feedback = Result.FAIL_SHORT;
								else
									feedback = Result.FAIL_LONG;
		return(feedback);
	}
}