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
                        int temp = 0;
                        for (int col = 0; col < matrix[row].length; col++) {
                                temp += matrix[row][col];
                        }
                        val[row] = temp;
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

}
