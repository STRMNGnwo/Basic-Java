
/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
public class Order
{
    // instance variables - replace the example below with your own
    private int orderId;
    private Customer customer;
    private ShoppingCart shoppingCart;
    private Payment payment;
    private Address shippingAddress;
    private float total;
    
    private ArrayList<Item>Items=new ArrayList();
    

    /**
     * Constructor for objects of class Order
     */
    public Order(ShoppingCart shoppingCart)//constructor for the order
    {
        // initialise instance variables
        orderId = 0;
        this.shoppingCart=shoppingCart;
        
        Random rand= new Random();
        
        orderId=rand.nextInt(100)+1;//generates orderId
        
        for(int i=0;i<shoppingCart.getSize();i++)//receives the contents of the ArrayList in the ShoppingCart class and adds them into another ArrayList
        {
          Items.add(shoppingCart.getItem(i)); 
          total+=Items.get(i).getPrice();
          
            
        }
        shoppingCart.clearCart();//clears the ArrayList in the ShoppingCart class.
    }
    
    public void getOrderDetails()//prints out arraylist which contains the items selected by the customer
    {
     for(int i=0;i<Items.size();i++)
     {
      System.out.println(Items.get(i));   
         
         
     }
        
    }
    public String getShippingAddress()
    {
     return shippingAddress.getAddress();
        
    }
    
    public void setShippingAddress(Address shippingAddress)//adds an Address object(Shipping Address) 
    {
        this.shippingAddress=shippingAddress;
    }
    
    public String getBillingAddress()//returns billing address
    {
     return payment.getBillingAddress();   
        
    }
    public String getEmail()
    {
     return shoppingCart.getEmail();   
        
    }
    
    public String getFirstName()
    {
     return shoppingCart.getFirstName();   
        
    }
    
    public int getOrderId()
    {
        
     return orderId;   
    }
    
    
    public void addPayment(Payment payment)//adds a payment object which is used to access methods in the payment class to verify validity of the payment.
    {
     this.payment=payment;   
        
    }
    public boolean checkPayment()//checks if the payment made is valid
    {
        if(payment.isValid())//invokes the method in the payment class to check if cardtype is right and if the card numbers are right length.
        {
            
         //email.sendEmail(order details,order number,address)
         return true;
            
        }
        return false;
        
    }
    
    public float getTotal()//returns total cost
    {
     return total;  
    }
    
    
    

    
    
}
