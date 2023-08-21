package NewExam;

public class Exam8_20_6 {
	public static void main(String[] args) {
		GeneralDept gd = new GeneralDept();
		gd.juice();
		gd.meat();

	}
}

abstract class StarMarket {
	abstract void juice();

	public void meat() {
		System.out.println("We have fresh meat from direct farm.");
	}
}

class GeneralDept extends StarMarket {

	@Override
	void juice() {
		System.out.println("We are happy to serve you. Buy here!");

	}

}