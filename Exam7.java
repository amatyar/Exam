package NewExam;

public class Exam7 {

	public static void main(String[] args) 
	{

		Design dg= new Design();
		int a = dg.add(25, 24);
		System.out.println(a);
		
		System.out.println("************** next case********");
		ExtDesign edg= new ExtDesign();
		double b = edg.add(25.32, 21.51, 23.90);
		
		System.out.println(b);

	}

}
class Design{
	public int add(int i, int j)
	{
		return (i + j);
	}
}
class ExtDesign extends Design
{
	public double add(double i , double j, double k ) 
	{
	return (i +j -k );
	}
}