package JAVA_PROJECT;

import java.util.ArrayList;
import java.util.List;

public class AutomatHotBeaverege extends Automat{

    List<HotBeverage> listHotBeverages = new ArrayList<>();

    // private double volume;
    // private int temperature;

    public void initHotBeverages(List<HotBeverage> myList){
        
        listHotBeverages = myList;
    }
    
    public HotBeverage getHotBeverage(String name, double volume, int temperature){

    //    this.volume = volume;
    //    this.temperature = temperature;
        
        for (HotBeverage el:  listHotBeverages) {

            if( el.getName().equals(name)&&el.getVolume()==volume && el.getTemperature()==temperature ){

                return el;
            }
            
        }

         return null;


    }
}
