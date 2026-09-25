public class Main{
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int[] arr=new int[5];
        arr[1]=10;
        arr[2]=20;
        for(int i=0;i<array.length;i++){
            System.out.println(arr[i]);
        }

    }
}