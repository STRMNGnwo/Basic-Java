
/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ShoppingCart
{
    // instance variables - replace the example below with your own
    private long cartId;
    
    private double total;
    private boolean close;
    private Customer customer;
  
    
    private ArrayList<Item>Items=new ArrayList<>();
    
    public ShoppingCart(Customer customer)//constructor
    {
        total=getTotal();
        this.customer=customer;
        cartId=customer.getCustomerId();
        
        
    }
    
    
    public void addItem(Item item)//adding an item to an arraylist
    {
        if(close==false)
        {
        Items.add(item);
        }
        else 
        {
         System.out.println("Sorry the shopping cart is closed");   
        }
    }
    
    public void removeItem(Item item)//removing an item from arraylist
    {
        if(close==false)
        {
            
        Items.remove(item);
        }
        else
        {
         System.out.println("Sorry the shopping cart is closed");   
        }
    }
    
    public void printItems()//method to print out the items in the cart
    {
        int i=0;
      while(i<Items.size())
      {
          System.out.println(Items.get(i).toString());
          i+=1;
      }
      
      
        
    }
    
    public void close(boolean value)//method to decide if cart is closed or not
    {
         close=value;
         
    }
    
    public double getTotal()//method to print out the total price of the items in the arraylist
    {
        total=0;
      for(int i=0;i<Items.size();i+=1)
      {
       total+=Items.get(i).getPrice();   
      }
      
      return total;
    }
    
    public void clearCart()//method to clear out the entire cart
    {
        if(close==false)
        {
            for(int i=Items.size()-1;i>=0;i--)  
            {
                Items.remove(i);  
            }
        }
        else
        {
         System.out.println("Cart is locked, so it cannot be cleared");   
        }
        
    }
    
    public Item getItem(int index)//method to return item at specified index.Used by the order class to get item from arraylist and add it into the arraylist in the order class
    {
     return Items.get(index);   
        
    }
    
    public int getSize()//returns the size of the ArrayList
    {
     return Items.size();   
        
    }
    
    public String getFirstName()
    {
        return customer.getFirstName();
        
    }
    
    public String getLastName()
    {
     return customer.getLastName();
        
    }
    
    public String getEmail()
    {
        return customer.getEmail();
        
    }
    public long getCartId()
    {
     return cartId;   
    }
    

    
    
}
