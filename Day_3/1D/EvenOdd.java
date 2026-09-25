public class EvenOdd{
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        int even =0;
        int odd =0;
        for(int i=0;i<array.length;i++){
            if( array[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(" Even: " + even + " Odd: "+odd);
        }
}