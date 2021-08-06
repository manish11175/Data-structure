package oops;
class Laptop{
    final int amount;
    final String name;
    Laptop(String name,int amount){
        this.amount=amount;
        this.name=name;
    }
    public void details(){
        System.out.println("Laptop name is "+name +" and price is "+amount);
    }
}
public class Car {
    public static void main(String args[]){
        Laptop mac=new Laptop("Apple Macbook pro",150000);
        mac.details();

        System.out.println(mac.amount);
    }
}
