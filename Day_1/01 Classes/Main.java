class Student{
    void M1(){
        System.out.println("class method is called ");
    }
}
public class Main{
    public static void main(String[] args){

        Student s=new Student();
        s.M1();
    }
}