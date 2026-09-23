class StudnetDeatils {
    String name;
    int age;
    int energy;
    String mood;
    float attendence;

    StudnetDeatils(String name, int age, int energy, String mood, float attendence) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.mood = mood;
        this.attendence = attendence;
    }

    void skipclass() {
        if (energy < 2) {
            System.out.println("Your energy is very low, skip the class");
        } else {
            System.out.println("You are good to go to class");
        }
    }

    void taketest() {
        if (attendence < 75.0) {
            System.out.println("You are not eligible to write the exam");
        } else {
            System.out.println("You are ready to write the exam");
        }
    }

    void sleep() {
        if (mood.equals("bored")) {
            System.out.println("You should get some sleep");
        }
    }

    void study() {
        if (mood.equals("ambitious")) {
            System.out.println("You are good to go");
        }
    }

    void eat() {
        if (mood.equals("hungry")) {
            System.out.println("You need some good food to eat, order at Minerva");
        }
    }
}

class SuperStudent extends StudnetDeatils {
    int superpower;
    String superhobby;

    SuperStudent(
        String name,
        int age,
        int energy,
        String mood,
        float attendence,
        int superpower,
        String superhobby
    ) {
        super(name, age, energy, mood, attendence);

        this.superpower = superpower;
        this.superhobby = superhobby;
    }

    void CodeAllNight() {
        if (superhobby.equals("coding")) {
            System.out.println("He can code all night");
        }
    }

    void DeBugfor() {
        if (superpower > 50) {
            System.out.println("He can debug for 5 hours");
        }
    }
}

public class Student {
    public static void main(String[] args) {

        StudnetDeatils s1 = new StudnetDeatils("maxwell", 12, 10, "bored", 76.8f);
        SuperStudent ss1 = new SuperStudent("Sathvik",20,8,"ambitious",85.0f,60,"coding");

        ss1.CodeAllNight();
        ss1.DeBugfor();

        s1.sleep();
        s1.skipclass();
        s1.taketest();
    }
}