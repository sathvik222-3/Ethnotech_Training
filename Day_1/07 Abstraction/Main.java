abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is Barks");
    }
}
/*Animal a= new Animal();//error'//' Because Animal is an abstract class*/
/*so we are inheriting the abstract method and then calling it */
/*this is where abstract method is used where the implementation provided by the sunclass*/
public class Main{
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound();
    }
}