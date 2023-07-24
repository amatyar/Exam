package NewExam;

public class Exam5 {

	public static void main(String[] args) 
	{
		Bigelow obj;
		obj = Bigelow.getBe();
		System.out.println(obj.string);
		obj.DisplayBe();

	}

}
class Bigelow
{
	private static Bigelow Be;
	public String string;
	
	private Bigelow()
	{
		string = " we are decent tea producer";
	}
	public static Bigelow getBe()
	{
		if (Be == null)
		{
			Be = new Bigelow();
		}
		return Be;
	}
	public void DisplayBe()
	{
		System.out.println("are you happy with our product?");
	}
	
}