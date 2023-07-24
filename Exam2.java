package NewExam;

public class Exam2 
{

	public static void main(String[] args) 
	{
		Bookb bk= new Bookb(250,"how to cook food", 25.50);
		bk.displayBook();
		

	}

}
abstract class bookA 
{
	int Pages;
	String Name; 
	public bookA(int pg, String nm)
	{
		this.Name= nm;
		this.Pages= pg;
	}
}
class Bookb extends bookA{
	double price;
	public Bookb(int pg, String nm, double pr) 
	{
		super(pg, nm);
		this.price= pr;
		
	}
	public void displayBook()
	{
		System.out.println("Book Name: "+this.Name +"Pages: "+this.Pages+" Prices : "+this.price);
	}
	
}