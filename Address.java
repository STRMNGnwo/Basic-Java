
/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address
{
    // instance variables - replace the example below with your own
    private String street;
    private String city;
    private String zip;
    private String country;

    public Address(String street,String city,String zip,String country)//constructor for the address class
    {
        this.street=street;
        this.city=city;
        this.zip=zip;
        this.country=country;// initialise instance variables
        
    }

    
    public String getAddress()//returns a String with all the address fields combined
    {
     String Address=street+", "+city+","+zip+", "+country; 
     
     return Address;
    }
    
    public void setStreet(String street)
    {
     this.street=street;   
        
    }
    
    public String getStreet()
    {
        return street;
    }
    
    public void setCity(String city)
    {
        this.city=city;
    }
    
    public String getCity()
    {
     return city;   
    }
    
    public String getZip()
    {
        return zip;
        
    }
    public void setZip(String zip)
    {
     this.zip=zip;   
        
    }
    
    public String getCountry()
    {
     return country;   
    }
    
    public void setCountry(String country)
    {
     this.country=country;
     
        
    }
    
    
}
