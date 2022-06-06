//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

package Business;

public class AppointmentList //AppointmentList class
{
    //Initialized variables 
    public int count = 0;
    public Appointment appt[] = new Appointment[10];
    
    public AppointmentList() //Default Constructor
    {
        appt[count] = new Appointment();
        count = 0;
    }
    
    public void addAppointment(Appointment ap) //Method for taking iin appointment objects and adding to the array
    {
        appt[count] = ap;
        count++;
    }
    
    public void Display() //Diaplay Method
    {
        for (int i = 0; i < count; i++)
        {
            appt[i].Display();
        }
    }
}
