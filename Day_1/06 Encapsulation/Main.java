class Student{
    private String name;
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    
}
public class Main{
    public static void main(String[] args){
        Student s= new Student();
        s.setName("Sathvik");
        System.out.println(s.getName());
    }
}