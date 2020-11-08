
/**
 * Write a description of class Email here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Email
{
    // instance variables - replace the example below with your own
    private Order order;
    private String email;

    /**
     * Constructor for objects of class Email
     */
    public Email(Order order)//constructor for the email class
    {
        this.order=order;
        email=order.getEmail();
        // initialise instance variables
        
    }
    
    public void sendEmail()//send positive or negative email
    {
        if(order.checkPayment())//checking if payment went through, if yes sends a positive email.
        {
            System.out.println("This confirmation email was sent to :" +email);
            System.out.println("Hi, "+order.getFirstName());
        System.out.println("Your order is being sent to "+order.getShippingAddress() );
        System.out.println("The billing address is: "+order.getBillingAddress() );
        System.out.println("You ordered:");
         order.getOrderDetails();
         
         System.out.println("The order id is:"+ order.getOrderId());
         System.out.println("The total is: " +order.getTotal() );
         System.out.println(" ");
         
         
         
        
        
        }
        else //sends negative email
        {
            System.out.println("This email was sent to "+email);
            System.out.println("Hi, "+order.getFirstName());
         System.out.println("Your order failed");   
        }
        
        
    }
    

    
   
}
