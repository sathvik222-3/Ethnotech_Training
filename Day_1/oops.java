public class oops{
    public static void main(String[] args){
        class animal{
            void sound(){
                System.out.println("The animal ");
            }
        }
        class dog extends animal{
            @Override
            void sound(){
                System.out.println("The dog ");
            }
        }
    }
}