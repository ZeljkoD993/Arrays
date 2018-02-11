
public class Arrays_git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Napisati metodu koja brise duplikate u nizu
	public static int[] eliminateDuplicates(int[] list) {
		return list;
	}

	// Napisati metodu koja vraca true ako je niz sortiran
	public static boolean isSorted(int[] list) {
		return true;
	}

	// Napisati medotu koja vraca sortiran String
	public static String sort(String s) {
		char[] chars = s.toCharArray();
		java.util.Arrays.parallelSort(chars);
		String result = "";
		for (int i = 0; i < chars.length; i++) {
			result += chars[i];
		}
		return result;
	}

	// Napisati metodu koja sabira sve brojeve na glavnoj dijagonali
	public static double sumMajorDiagonal(double[][] m) {
		double result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i][i];
		}
		return result;
	}

}
