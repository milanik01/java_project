package JAVA_PROJECT.semenar_OOP2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import JAVA_PROJECT.Automat;
import JAVA_PROJECT.Food;
import JAVA_PROJECT.Tovar;

public class Human extends Actor {


    private String name; 
    private double money;
    private Automat nearsAutomat;

    public Human(String name, boolean make_order, boolean take_order, double money) {
        super(name, make_order, take_order);
        this.money = money; 
        
    }

    public double getMoney()
    {
        return money;
    }

    public void setMoney()
    {
        this.money = money;
    }

    @Override
    public void setMake_order(boolean d) {
        
    }

    @Override
    public void setTake_order(boolean b) {
        
    }

    @Override
    public boolean isMade_order() {
        return false;
       
    }

    @Override
    public boolean isTook_order() {
        return false;
        
    }

    public void foundNearestAutomat(){
         
        ArrayList<Tovar> myList = new ArrayList<>();
        
        myList.add(new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10,0,0),50));
        myList.add(new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10), 50));
        myList.add(new Food("Snikers",60, 15, new GregorianCalendar(2023, 10, 10), 50));

        Automat list = new Automat();
        list.iniTovar(myList);


        Automat automat =  new Automat();
        automat.iniTovar(myList);
        this.nearsAutomat = automat;
    }

     @Override
    public Order makeOrder(ArrayList<String> deList) {
       ArrayList<Tovar> shopingList = new ArrayList<>();
        Tovar shopingTovar;


        for (String item : deList) {

            shopingTovar = nearsAutomat.getTovar(item);
            if(shopingTovar!=null){
                shopingList.add(shopingTovar);
            }
        }
        setMake_order(true);
        return nearsAutomat.createOrder(shopingList);

    }
}
   

