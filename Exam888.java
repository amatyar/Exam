package NewExam;

public class Exam888 {

	public static void main(String[] args) {
		// Define a enum with switch example
		Operator op = new Operator(FileWrite.write);
		op.pickup();

	}

}

enum FileWrite {
	write, Read, delete;
}

class Operator {
	FileWrite fw;

	public Operator(FileWrite f1) {
		this.fw = f1;
	}

	public void pickup() {
		switch (fw) {
		case write:
			System.out.println("Please wrtie something");
			break;
		case Read:
			System.out.println("Please Read something");
			break;
		case delete:
			System.out.println("Please delete unwanted");
			break;
		default:
			System.out.println("Sorry you did not pick up");
		}
	}
}