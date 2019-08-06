public class TestBA6 {
	public static int arrayToNumber(int[] sir) {
		if (sir.length == 0) {
			return -1;
		}

		int result = 0;

		for (int element : sir) {
			if (element < 0 || element > 10) {
				return -2;
			}

			result = result * 10 + element;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(arrayToNumber(new int[] { 1, 2, 3, 11, 3 }));
	}
}