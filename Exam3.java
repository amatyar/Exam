package NewExam;

public class Exam3 {

	public static void main(String[] args) {
		BogAp dog = new BogAp();
		dog.eat();
		dog.move();

	}

}
interface AnimalAp{
	void move();
	void eat();
}
class BogAp implements AnimalAp
{

	@Override
	public void move() {
		System.out.println("This god run very fast");
		
	}

	@Override
	public void eat() {

		System.out.println("this god can not chew hard food");
		
	}
	
}