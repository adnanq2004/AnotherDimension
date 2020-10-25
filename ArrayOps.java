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

}
