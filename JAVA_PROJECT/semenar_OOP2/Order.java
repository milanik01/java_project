package JAVA_PROJECT.semenar_OOP2;

import java.util.ArrayList;
import java.util.Calendar;

import JAVA_PROJECT.Automat;
import JAVA_PROJECT.Tovar;

public class Order {

    private ArrayList<Tovar> list;
    private Human man;
    private int priseCoast;
    
public Order(ArrayList<Tovar> myList, int myPrise){

    this.list = myList;
    this.priseCoast = myPrise;

}

@Override
   public String toString(){
    String str = null;

    for (Tovar item : list) {

        str+=item.getName()+"\n";
    }

    str+="Общая стоимость заказа"+priseCoast;

    return  str;
   }

}


// Реализовать метод оформления заказ createOrder(...):

// нужно пройти по продуктам, проверить наличие (>0), "запомнить цену"

// Создать объек Order с полями List<Product>, который содержит только продукты из наличия, 
// и поле стоимость - сумма цен продуктов, входящих в заказ.

// Вернуть объект Order. В классе Order переопределить метод toString() - показывать состав заказа, 
// заказчика и общую стоимость продуктов.