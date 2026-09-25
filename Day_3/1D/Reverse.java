public class Reverse{
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        int len=array.length;
        for(int i=0;i<array.length/2;i++){
            int temp=array[len-i-1];
            array[len-i-1]=array[i];
            array[i]=temp;
        }
        System.out.println("Revers of array: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}