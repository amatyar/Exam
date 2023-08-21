package NewExam;

public class Exam8_20_4 {

	public static void main(String[] args) {
		Rectangle rt = new Rectangle(8, 6);
		int area = rt.getArea();
		System.out.println(area + " square ft");

		System.out.println("--------");
		Square sq = new Square(6);
		int sqArea = sq.getArea();
		System.out.println(sqArea + " square ft");

	}

}

class Rectangle {
	private int breath;
	private int length;

	public Rectangle(int l, int b) {
		this.length = l;
		this.breath = b;
	}

	public int getArea() {
		return this.length * this.breath;
	}
}

class Square extends Rectangle {

	public Square(int b) {
		super(b, b);

	}

}