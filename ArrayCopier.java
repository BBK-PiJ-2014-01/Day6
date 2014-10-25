public class ArrayCopier {

	void copy (int[] src, int[] dst) {	
		for (int i=0; i<src.length ; i++)
			if (i<dst.length)
				dst[i] = src[i];
		if (dst.length>src.length)
			for (int i=src.length; i<dst.length ; i++)
				 dst[i]=0;
	}

	void print (int[] matrix) {
		System.out.print("Array values: ");
		for (int i=0; i<matrix.length ; i++)
			System.out.print(matrix[i] + " ");
	}	
}