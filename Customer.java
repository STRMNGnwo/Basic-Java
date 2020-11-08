
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class Customer
{
    // instance variables - replace the example below with your own
    private int customerId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    
    public Customer(String firstName,String lastName,String emailAddress)//constructor 
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailAddress=emailAddress;
        Random rand = new Random();
        customerId= rand.nextInt(100)+1;//generating a random number for the customerID
        
    }
    
    public String getFirstName()
    {
      return firstName;   
    }
    
    public void setFirstName(String fName)
    {
        firstName=fName;
    }
    
    public String getLastName()
    {
      return lastName;   
    }
    public void setLastName(String lName)
    {
      lastName=lName;   
    }
    public String getEmail()//returns email
    {
     return emailAddress;   
    }
    public void setEmail(String email)//mutator to change the email
    {
      emailAddress= email;  
    }
    
    public long getCustomerId()//returns customerid
    {
        
        return customerId;
        
    }

    
}
