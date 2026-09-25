public class Min{
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(min>=array[i]){
                min=array[i];
            }
        }
        System.out.println("Min array elements is: " + min);
    }
}