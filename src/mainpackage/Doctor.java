package mainpackage;


public class Doctor extends Users 
{
    private final int SSN;
    private String spec;
    
    public Doctor(String usrname, String usrpass, String nameTmp, String surnameTmp, int SSNTmp, String spc)
    {
        super(usrname, usrpass, nameTmp, surnameTmp);
        SSN = SSNTmp;
        spec = spc;
    }
    
    public void DocAvailability()
    {
        //Ability to change days and hours at which appointments by patients can be made.
    }
    
    public void ViewScheduledAppointments()
    {
        //View shedule of appointments with patients.
    }
    
    public void ViewAppointmentHistory()
    {
        //View history of appointments.
    }
    
    //Get-Set Spec
    public String GetSpec()
    {
        return spec;
    }
    
    public void SetSpec(String spc)
    {
        spec = spc;
    }
    
    //Get SSN
    public int GetSSN()
    {
        return SSN;
    }
}
