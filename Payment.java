
/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
public class Payment
{
    // instance variables - replace the example below with your own
    private String cardType;
    private long  cardNumber;
    private String bankName;
    private boolean valid;//Valid is true if card type is proper and the card has 16 digits
    
    private Address Billing;
    private Customer customer;
    private Date currentDate= new Date();
    private Date expiryDate;
    
    
    Payment(Customer customer,String cardType,long cardNumber,String bankName, Date expiryDate)
    {
     this.customer=customer;
     
     
     if(checkCardType(cardType) )//invokes function checkCardType to check if card is either a MasterCard or Visa
    {
     this.cardType=cardType;
     valid=true;
     
        if(checkValidNumber(cardNumber))//invokes function checkValidNumber to check if card has 16 digits
        {
            this.cardNumber=cardNumber;
            valid=true;
     
            if(checkDate(expiryDate))//invokes function checkDate that checks if the expiry date is in the future by comparing it to the currentDate object.
            {  
                this.expiryDate=expiryDate;
                valid=true;
            }
       
            else
            {
                System.out.println("");
                System.out.println("Your payment has been declined as your Card has expired");
                valid=false;
           
            }
        }
     
        else
        {
            System.out.println("Your payment has been declined. Enter valid card number");  
            valid=false;
        }
     
    }
     else
     {
      System.out.println("Your payment has been declined. Enter valid Card type"); 
      valid=false;
     }
     
  
     this.bankName=bankName;
        
        
    }
    
    private boolean checkValidNumber(long cardNumber)//function to check if card has 16 digits
    {
      String Number= String.valueOf(cardNumber);
      if(Number.length()==16)
      {
        return true; 
       
      }
      return false;
        
        
    }
    
    private boolean checkCardType(String cardType)//function to check if card type is proper
    {
        
     if(cardType.toUpperCase().equals("MASTERCARD")||cardType.toUpperCase().equals("VISA"))
     {
         
      return true;   
        
     }
        return false;
    }
    
    private boolean checkDate(Date expiryDate)
    {
       return  expiryDate.after(currentDate);
        
    }
    
    public boolean isValid()//returns the value of valid which is used in the order class to confirm valid payment
    {
     return valid; 
        
    }
    
    public void setBillingAddress(Address Billing)
    {
        this.Billing=Billing;
        
    }
    
    public String getBillingAddress()//returns billing address by invoking the method in the address class using billingAddress object
    {
    
        return Billing.getAddress();

    }
    
}
