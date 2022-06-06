class MilestoKilos
{
	public static void main(String[] args)
	{
		double Miles = 1;
		double Kilometers = 1.609;
		
		while (Miles < 100 )
		{
			double Convert = Miles*Kilometers;
			System.out.println(Miles + "Miles = " + Convert +" Kilometers.");
			Miles= Miles + 1;
		}
		for (Miles = 1; Miles<=100; Miles++)
		{
			double Convert = Miles * Kilometers;
			System.out.println(Miles + " Miles = " + Convert +" Kilometers.");
		}
		do
		{
			double Convert = Miles*Kilometers;
			System.out.println(Miles + " Miles = " + Convert +" Kilometers.");
			Miles = Miles + 1;
		} 
		while (Miles < 100);
	}
}