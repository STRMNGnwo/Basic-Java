
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String itemName;
    private int price;
    private long itemId;
    
    public Item(String itemName, long itemId,int price)//constructor to initialise Item object
    {
     this.itemName=itemName;

    
     this.itemId=itemId;
     this.price=price;
        
    }
    
    public void setPrice(int price)//mutator to change the value of price
    {
     this.price=price;   
    }
    
    public int getPrice()
    {
     return price;   
    }
    
    @Override
    public String toString()//returns the fields as a single string
    {
     String out="Item id: "+itemId+" Item price "+price+" Item Name: "+itemName;   
        
     return out;
    }
    
    

    
}
