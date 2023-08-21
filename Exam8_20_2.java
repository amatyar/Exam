package NewExam;

public class Exam8_20_2 {

	public static void main(String[] args) {
		Father fr = new Father(54, "Vetmaname");
		fr.displayFather();

		Son sn = new Son(11, "Jonny", "Illamy");
		// sn.displayFather();
		sn.DisplaySon();
	}

}

class Father {
	int number;
	String Name;

	public Father(int nb, String nm) {
		this.number = nb;
		this.Name = nm;
	}

	public void displayFather() {
		System.out.println(this.number + "\t" + this.Name);
	}
}

class Son extends Father {
	String LastName;

	public Son(int nb, String nm, String ln) {
		super(nb, nm);
		this.LastName = ln;
	}

	public void DisplaySon() {
		System.out.println(this.number + "\t" + this.Name + "\t" + this.LastName);
	}

}