package JAVA_PROJECT;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Tovar {
    
   private String name;
   private int price;
   private int quantity;
   private GregorianCalendar bestBefore;

    public  Tovar(String name, int price, int quantity, GregorianCalendar bestBefore){

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;

    }

   public int getPrice(){

    return price;

   }
   public String getName(){

    return name;

   }
    public int getQuantity(){

    return quantity;

   }
    public GregorianCalendar getBestBefore(){

    return bestBefore;

   }
   @Override
   public String toString(){

    return "Tovar = name ="+ name +", price="+price+", quamtity="+quantity+", bestBefore="+bestBefore.get(Calendar.YEAR)+"/"+bestBefore.get(Calendar.MONTH)+"]";
   }

    
}
