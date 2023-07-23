package JAVA_PROJECT;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
import JAVA_PROJECT.Tovar;

public class Automat {
  
        
    List<Tovar> listTovar = new ArrayList<>();

    public void iniTovar(List<Tovar> myList){
        
        listTovar = myList;
    }

    public Tovar getTovar(String name){
        
        for (Tovar el:  listTovar) {
            if(el.getName().equals(name)){
                return el;
            }
            
        }
         return null;


    }
    
}