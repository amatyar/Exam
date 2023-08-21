package NewExam;

public class Exam8_20_5 {

	public static void main(String[] args) {
		Ride rd = new Ride();
		rd.fare(3);
		rd.route("South Boston");

	}

}

interface Bus {
	void fare(int i);

	void route(String b);
}

class Ride implements Bus {

	@Override
	public void fare(int i) {
		System.out.println("our fare is cheap :$" + i);

	}

	@Override
	public void route(String b) {
		System.out.println("This route , are you going?? \t" + b);

	}

}