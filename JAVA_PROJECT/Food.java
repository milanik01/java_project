package JAVA_PROJECT;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Food extends Tovar{

    private double weight;

    public Food(String name, int price, int quantity, GregorianCalendar bestBefore, double weight){

        super(name, price, quantity, bestBefore);
        this.weight = weight;
       
    }

    public double getWeight(){

    return weight;

    }

   @Override
   public String toString(){

   return "Bevereage = name ="+ super.getName() +", price=" + super.getPrice() + ", quamtity="+super.getQuantity()+", bestBefore="+super.getBestBefore().get(Calendar.YEAR)+"/"+super.getBestBefore().get(Calendar.MONTH)+ ", weight"+weight+"]";
   
}

    
}
