public class Dog
{
	protected String name;
	protected String color;
	protected int BirthYear;
	
	public Dog()
	{
		
	}
	public Dog(String Name, String Color, int DOB)
	{
		this.name = Name;
		this.color = Color;
		this.BirthYear = DOB;
	}
	public void setName(String Name)
	{
		this.name = Name;
	}
	public void setColor(String Color)
	{
		this.color = Color;
	}
	public void setDOB(int DOB)
	{
		this.BirthYear = DOB;
	}
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public int getDOB()
	{
		return BirthYear;
	}
	public void Display()
	{
		System.out.println("The Dogs Name is " + getName() + ", " + getColor() + " in color, and born on " + getDOB());
		System.out.println("");
	}
}