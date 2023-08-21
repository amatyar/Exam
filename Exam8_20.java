package NewExam;

public class Exam8_20 {
	public static void main(String[] args) {
		// Multiple Dimension array and loop for each
		int[][] arrayM = { { 12, 13, 14 }, { 21, 25, 32 }, { 11, 88, 66 } };

		// using for each loop
		for (int[] a : arrayM) {
			for (int b : a) {
				System.out.println(b);
			}
		}
	}
}
