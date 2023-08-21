package NewExam;

public class Exam0820 {

	public static void main(String[] args) {
		try {
			int a = 20;
			System.out.println(a / 0);
		} catch (ArithmeticException ex) {
			System.out.println(" your code is not working" + ex);
		} finally {
			System.out.println("we are closing");
		}

	}

}
