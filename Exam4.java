package NewExam;

public class Exam4 {

	public static void main(String[] args) 
	{
		BJWholeseller bjs= new BJWholeseller("Pie", "Bakery");
		BJWholeseller.MemberShip ms= bjs.new MemberShip();
		ms.setMember();
		
		System.out.println(ms.getMemTitle());

	}

}
class BJWholeseller
{
	String custName, subDepartment;
	
	private String MemberName()
	{
		return this.custName;
	}
	public BJWholeseller(String cn, String sd)
	{
		this.custName= cn;
		this.subDepartment = sd;
	}
	
	class MemberShip
	{
		String MemTitle;
		
		public void setMember()
		{
		
		if(BJWholeseller.this.subDepartment.equals("Bakery")) 
		{
			if(BJWholeseller.this.MemberName().equals("Pie"))
			{
				this.MemTitle="Good condition";
			}
			else
			{
				this.MemTitle ="Average";
			}
		}
		else {
			this.MemTitle = "Nice";
		}
		}
		public String getMemTitle()
		{
			return this.MemTitle;
		}
	}
	
}