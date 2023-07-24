package NewExam;
// multi inheritance
public class Exam1 
{

	public static void main(String[] args)
	{
		GrandF gf= new GrandF("Ram", 86);
		System.out.println("Name of Grand father: "+gf.Name + "Age: "+ gf.Age);
		SonF sf = new SonF("Shyam", 45, "Boston");
		System.out.println("Name of Son: "+sf.Name + "Age: "+ sf.Age +"Location : "+sf.place);
		
		GranSon gs= new GranSon("Krishna", 12, "Boston", 8);
		System.out.println("Name of Grand son: "+gs.Name + "Age: "+ gs.Age +"Location: "+ gs.place+"Section no:"+ gs.secNo);

		
		
	}

}
class GrandF
{
	String Name;
	int Age;
	
	public GrandF(String nm, int ag) 
	{
		this.Name=nm;
		this.Age= ag;
	}
	public void displayGrandf()
	{
		System.out.println("this is grand father case.");
	}
}
class SonF extends GrandF
{
	String place;
	public SonF(String nm, int ag, String pl) {
		super(nm, ag);
		this.place = pl;
	}
	public void DisplaySon()
	{
		System.out.println("this is son room.");
	}
}
class GranSon extends SonF
{
	int secNo;
	public GranSon(String nm, int ag, String pl, int sn) 
	{
		super(nm, ag, pl);
		this.secNo = sn;
	}
	public void DisplayGrandSon()
	{
		System.out.println("this is grand son room");
	}
	
}