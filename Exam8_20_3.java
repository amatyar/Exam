package NewExam;

public class Exam8_20_3 {

	public static void main(String[] args) {
		// Overloading in a class must have multiple method with same name but different
		// parameter

		Book23 bk = new Book23();
		bk.addition(5, 6);
		bk.addition(2.3, 3.4, 4.5);
// overriding : happen with child and parent relation , method method name must be same and parameter must be same

	}

}

class Book23 {
	public void addition(int i, int j) {
		System.out.println(i + j);
	}

	public void addition(double i, double j, double k) {
		System.out.println(i + j * k);
	}

}
