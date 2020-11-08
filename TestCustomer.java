
/**
 * Write a description of class TestCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.GregorianCalendar;
import java.util.Date;
public class TestCustomer
{
    // instance variables - replace the example below with your own
    private int x;
    
    public static void main(String args[])
    {
       TestCustomer test= new TestCustomer();
       test.transaction1();
       
       test.transaction2();
        
        
    }
    
    public void transaction1()
   
    {
        /*1. Create Customer object
         * 2. Create Shopping Cart object for the Customer
         * 3. Add 3 items with known cost to cart
         * 4. Finalize the cart and create an order
         * 5. Add a delivery address for the order
         * 6. Add a payment type
         * 7. Validate the payment
         * 8. If successful, email the customer with a success email and the
         * cost of the purchased items*/
        Customer customer1= new Customer("Talos","Stormcrown","Weeza@Weezer.com");// creating custome
        Item item1=new Item("Cereal",1,10);//Creating an item object
        Item item2 =new Item("Chocolates",2,15);
        Item item3= new Item("Crisps",3,7);
        
        ShoppingCart Cart= new ShoppingCart(customer1);//creating a shoppingcart object and passing in customer object as parameter.
        
        Cart.addItem(item1);//adding items to cart
        Cart.addItem(item2);
        Cart.addItem(item3);
        
        Order order1 = new Order(Cart);//creating an order object and passing in the  ShoppingCart object.
        Address Shipping = new Address("Dstreet","Dcity","Dzip","Dcountry");//creating a Shipping object,derived from the address class
        order1.setShippingAddress(Shipping);//passing in the shipping object into the order class
        
        Address Billing= new Address("Bstreet","Bcity","Bzip","Bcountry");//creating  Billing object,derived from address class
        
        GregorianCalendar future= new GregorianCalendar(2025,7,5);//creating a date object to pass in the expiry date. MOnths are from 0-11.
        Date expiryDate= future.getTime();//converting the date into epoch time format
        
        Payment pay1=new Payment(customer1,"mastercard",1234567890123456L,"BOI",expiryDate);//Creating a payment object
        pay1.setBillingAddress(Billing);
        
        order1.addPayment(pay1);//adding a payment object into the order class
        
        Email email= new Email(order1);//creating an email object 
        
        email.sendEmail();
        
       
       
         
        
       
           
           
       }
       
       public void transaction2()
       {
         Customer customer2=new Customer("Ancano","Wizard","Weeza2@weezer.com");
         Item item1=new Item("Cereal",1,15);
         Item item2 =new Item("Chocolates",2,15);
         Item item3= new Item("Crisps",3,10);
         ShoppingCart Cart= new ShoppingCart(customer2);
         
         Cart.addItem(item1);
         Cart.addItem(item2);
         Cart.addItem(item3);
         
         Cart.printItems();
         System.out.println("The total in the cart is: "+Cart.getTotal());
         Cart.removeItem(item2);
         
         Order order= new Order(Cart);
         Address Shipping=new Address("Dstreet","Dcity","Dzip","Dcountry");
         order.setShippingAddress(Shipping);
         
         Address Billing= new Address("Bstreet","Bcity","Bzip","Bcountry");
         
         GregorianCalendar future= new GregorianCalendar(2010,7,15);
        Date expiryDate= future.getTime();
         Payment payment = new Payment(customer2,"Visa",5324567890123456L,"BOI",expiryDate);
         payment.setBillingAddress(Billing);
         
         order.addPayment(payment);
         
         Email email=new Email(order);
         email.sendEmail();
         
           
           
           
       }
        
        
    }
    

    
    

