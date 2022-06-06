public class GreyHound extends Dog
{
	private int races;
	
	public GreyHound()
	{
		
	}
	public GreyHound(String Name, String Color, int DOB, int Races)
	{
		super(Name, Color, DOB);
		this.races = Races;
	}
	public void setRaces(int Races)
	{
		this.races = Races;
	}
	public int getRaces()
	{
		return races;
	}
	public void Display()
	{
		super.Display();
		System.out.println(getName() + " has " + getRaces() + " Races in total.");
		System.out.println("");
	}
}