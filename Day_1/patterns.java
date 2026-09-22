public class patterns {
    public static void main(String[] args) {
         for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= (4-1)*2-i*2; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
             System.out.println("");
        }
       for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5-1)-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i+1)*2-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (5-1-i)*2-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}