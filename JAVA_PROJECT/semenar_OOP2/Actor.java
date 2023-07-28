package JAVA_PROJECT.semenar_OOP2;

public abstract class  Actor implements ActorBeahever {
    
    private String name;
    private boolean made_order;
    private boolean took_order;
    private boolean make_order;
    private boolean take_order;

    public Actor(String name, boolean made_order, boolean took_order){

        this.name = name;
        this.made_order = made_order;
        this. took_order = took_order;
    }

    public String getName(){
        return name;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    public void setMake_order(boolean make_order) {
        this.make_order = make_order;
    }

    public void setTake_order(boolean take_order) {
        this.take_order = take_order;
    }
}
