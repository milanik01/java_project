package JAVA_PROJECT;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Beverege extends Tovar {

    public double volume;

    public Beverege(String name, int price, int quantity, GregorianCalendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;

    }

    public double getVolume(){

    return volume;

    }

    @Override
   public String toString(){

   return "Bevereage = name ="+ super.getName() +", price=" + super.getPrice() + ", quamtity="+super.getQuantity()+", bestBefore="+super.getBestBefore().get(Calendar.YEAR)+"/"+super.getBestBefore().get(Calendar.MONTH)+ ", volume"+volume+"]";
   }
    
}


// В класс Beverage добавить поле объем (double volume), а в класс Food - масса (double weight),
//  добавить заполнение в конструктор, добавтиь их в вывод toString()


// Создать наследника класса Beverage ГорячийНапиток с дополнительным полем int температура.

// Создать класс ГорячихНапитковАвтомат наследник от класса ТорговыйАвтомат и реализовать перегруженный метод 
// getProduct(String name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и 
// температуре

// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, 
// заложенную в программе

// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре