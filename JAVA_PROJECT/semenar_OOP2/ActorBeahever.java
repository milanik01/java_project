package JAVA_PROJECT.semenar_OOP2;

import java.util.ArrayList;

import JAVA_PROJECT.Tovar;

public interface ActorBeahever {


    void setMake_order(boolean d);
    void setTake_order(boolean b);

    boolean isMade_order();
    boolean isTook_order();

    Order makeOrder(ArrayList<String> myList);

}
