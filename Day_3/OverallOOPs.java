//Abstraction
public abstract class Payment{
    abstract void pay();
}
//Inheritance + Polymorphism
class UPI extends Payment{
    @override
    void pay(){
        System.out.println("Payment is done using UPI");
    }
}
class Card extends Payment{
    @override
    void pay(){
        System.out.println("Payment is done using Card");
    }
}
//Encapsulation
class Customer{
    private String name;
    private double balance;
}
class Customer{
    Customer(String name, double balance){
        public String getName(){
            return name;
        }
        public double getBalance(){
            return balance;
        }
        public void addMoney(double amount){
            if(amount>0){
                balance+=amount;
            }
        }
    }
}