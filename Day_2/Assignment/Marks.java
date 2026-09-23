import java.util.Scanner;
class Marks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the subjects");
        int mark=sc.nextInt();
        if(mark>90){
            System.out.println("5star");
        }
        else if(mark>80){
            System.out.println("4star");
        }
        else if(mark>70){
            System.out.println("3star");
        }
        else if(mark>50){
            System.out.println("Average Student");
        }
        else{
            System.out.println("Below Average Student");
        }
    
    }
}