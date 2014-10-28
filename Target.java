public class Target {

	private int[][][] matrix;

	public Target(int size) {
		matrix = new int[size][size][size];
		for (int i=0;i<size;i++)
			for (int j=0;i<size;j++)
				for (int k=0;k<size;k++)
					matrix[i][j][k] = 0;
	}

	public init() {
		int target_x = (int) Math.abs(matrix.length * Math.random());
		int target_x = (int) Math.abs(matrix.length * Math.random());
		int target_x = (int) Math.abs(matrix.length * Math.random());
	}

	public Result fire (int x, int y, int z) {

	}
}