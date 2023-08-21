package NewExam;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Catalog p = new Catalog();
	
	p.dis();
	
	
	Catalog.Picture q = p.new Picture() ;
	
	q.dis33();
	
	
}

}
//4) INNER CLASS

class Catalog{

public void dis() {
	System.out.println("hello from outter");
}

class Picture{
	
	public void dis33() {
		System.out.println("hello from inner");
	}
}
}