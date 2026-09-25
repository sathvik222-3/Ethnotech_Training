class Student {
    private String name;
    private int studentId;
    private double walletBalance;
    private int hungerLevel;
    public Student(String name,int studentId,double walletBalance,int hungerLevel) {
        this.name = name;
        this.studentId = studentId;
        this.walletBalance = walletBalance;
        this.hungerLevel = hungerLevel;
    }
    public void addMoney(double amount) {
        walletBalance += amount;
        System.out.println("Rs." + amount + " added to walletBalance.");
    }
    public boolean orderFood(FoodOrder order) {
        double total = order.calculateTotal();
        if (hungerLevel > 80) {
            System.out.println(
                "EMERGENCY! Feed the student immediately!"
            );
        }
        if (total > walletBalance) {
            System.out.println("Insufficient wallet balance!");
            return false;
        }
        walletBalance -= total;
        return true;
    }
    public void showBalance() {
        System.out.println("Wallet Balance: Rs." + walletBalance);
    }
    public String getName() {
        return name;
    }
}

class FoodOrder {
    private int orderId;
    private String foodName;
    private double price;
    private int quantity;
    public FoodOrder(int orderId,String foodName,double price,int quantity) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotal() {
        return price * quantity;
    }
    public void showOrder() {

        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: Rs." + price);

        if (foodName.equalsIgnoreCase("Biryani")) {
            System.out.println("Student has chosen happiness");
        }

        if (quantity > 3) {
            System.out.println("Bro, are you feeding the entire class?");
        }
        System.out.println("Total: Rs." + calculateTotal());
    }
}



abstract class Payment {
 abstract void pay(double amount);
}

class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment: UPI");
        System.out.println("Payment successful!");
    }
}
class CreditCard extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment: Credit Card");
        System.out.println("Payment successful!");
    }
}
class Cash extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment: Cash");
        System.out.println("Payment successful!");
    }
}

abstract class Delivery {

    abstract void deliver();
}
class BikeDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivery: Bike");
        System.out.println("Your food is coming by bike");
    }
}
class DroneDelivery extends Delivery {
    @Override
    void deliver() {
        System.out.println("Delivery: Drone");
        System.out.println("Your food is flying to you");
    }
} 


public class StudentFoodOrder {
     public static void main(String[] args) {
        Student student = new Student( "Hemanth",101,1000,90);
        FoodOrder order = new FoodOrder(1001,"Biryani",150,2);
        System.out.println("===== HUNGRY STUDENT =====");
        System.out.println("Student: " + student.getName());
        order.showOrder();
        boolean orderSuccessful = student.orderFood(order);
        if (orderSuccessful) {
            Payment payment = new UPI();
            double total = order.calculateTotal();
            payment.pay(total);
            Delivery delivery = new BikeDelivery();
            delivery.deliver();
            System.out.println("\nOrder placed successfully!");
            student.showBalance();
        } else {
            System.out.println("Order failed!");
        }
    }
}

