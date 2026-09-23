public class StringBufferDemo{
    public static void main(String[] args){
        StringBuffer sb= new StringBuffer("Java");
        System.out.println("Original:"+sb);
        sb.append(" programming");
        System.out.println("After append:"+sb);
        sb.insert(4," language");
        System.out.println("After insert:"+sb);
        sb.replace(5,13," script");
        System.out.println("After replace:"+sb);
        sb.delete(4,11);
        System.out.println("After delete:"+sb);
        sb.reverse();
        System.out.println("After reverse:"+sb);

    }
}