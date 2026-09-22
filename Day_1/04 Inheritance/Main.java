public class Main {

    static class Animal {
        void eat() {
            System.out.println("Animal eat");
        }
    }

    static class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("Dog eat");
        }
    }

    public static void main(String args[]) {

        Animal a = new Animal();
        Dog d = new Dog();

        d.eat();
        a.eat();
    }
}