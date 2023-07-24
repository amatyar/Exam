package NewExam;

public class Exam6
{

	public static void main(String[] args)
	{
		Organic og = new Organic();
		og.org(5, 6);
		og.org(45, 25, 36);
		og.org(22.5, 66.25);

	}

}
class Organic 
{
	public void org(int a, int b)
	{
		System.out.println(a + b);
	}
	public void org(int a, int b, int c)
	{
		System.out.println(a + b -c);
	}
	public void org(double a, double b)
	{
		System.out.println(a + b);
	}
}