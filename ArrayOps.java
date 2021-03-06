public class ArrayOps {

	 public static int sum(int[] arr) {
                int val = 0;
                for (int count = 0; count < arr.length; count++) {
                        val += arr[count];
                }
                return val;
        }

	public static int largest(int[] arr) {
                int val = 0;
                for (int count = 0; count < arr.length; count++) {
                        if (val < arr[count]) {
                                val = arr[count];
                        }
                }
                return val;
        }

	public static int[] sumRows(int[][] matrix) {
                int[] val = new int[matrix.length];
                for (int row = 0; row < matrix.length;row++) {
                        val[row] = sum(matrix[row]);
                }
                return val;
        }

	public static int[] largestInRows(int[][] matrix) {
		int[] val = new int[matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			val[row] = largest(matrix[row]);
		}
		return val;
	}

	public static int sum(int[][] arr) {
                int val = 0;
                int[] temp = sumRows(arr);
                for (int el = 0; el < temp.length; el++) {
                        val += temp[el];
                }
                return val;
        }

	public static int[] sumCols(int[][] matrix) {
		int[][] tempval = new int[matrix[0].length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				tempval[col][row] = matrix[row][col];
			}
		}
		int[] val = sumRows(tempval);
		return val;
	}

	public static boolean isRowMagic(int[][] matrix) {
		int[] tempval = sumRows(matrix);
		int temp = tempval[0];
		boolean val = true;
		for (int i = 0; i < tempval.length && val; i++) {
			val = (temp == tempval[i]);
		}
		return val;
	}

	public static boolean isColMagic(int[][] matrix) {
		int[] tempval = sumCols(matrix);
		int temp = tempval[0];
		boolean val = true;
		for (int i = 0; i < tempval.length && val; i ++) {
			val = (temp == tempval[i]);
		}
		return val;
	}

	public static boolean isLocationMagic(int[][] matrix, int row, int col) {
		int[] sumrow = sumRows(matrix);
		int[] sumcol = sumCols(matrix);
		boolean val = (sumrow[row] == sumcol[col]);
		return val;
	}

}
