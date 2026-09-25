public class Max{
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(max<=array[i]){
                max=array[i];
            }
        }
        System.out.println("Max array elements is: " + max);
    }