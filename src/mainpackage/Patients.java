package mainpackage;

public class Patients extends Users
{
    private final int SSN;
    
    public Patients(String usrname, String usrpass, String nameTmp, String surnameTmp, int SSNTmp)
    {
        super(usrname, usrpass, nameTmp, surnameTmp);
        SSN = SSNTmp;
    }
    
    public void register()
    {
        //register new patient
    }
    
    public void SearchAppointmentDoc(String doctorName)
    {
        //Search to find days and time for appointments for a specific doctor.
    }
    
    public void SearchAppointmentSpc(String doctorSpecialty)
    {
        //Search to find days and time for appointments for a specific specialization.
    }
    
    public void ViewScheduledAppointments()
    {
        //View shedule of appointments with doctors.
    }
    
    public void ViewAppointmentHistory()
    {
        //View history of appointments.
    }
    
    //Get SSN
     public int GetSSN()         
    {
        return SSN;
    }
}
