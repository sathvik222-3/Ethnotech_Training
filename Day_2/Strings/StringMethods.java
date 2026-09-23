public class StringMethods{
    public static void main(String[] args){
        String str= "Java Programming";
        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Is equals to Jav a Pro gramming or not : " + str.equals("Jav a Pro gramming"));
        System.out.println("Is equals to java programming or not (ignorcase): " + str.equalsIgnoreCase("java programming"));
        System.out.println("Contains s : " + str.contains("s"));
        System.out.println("Starts with J : " + str.startsWith("J"));
        System.out.println("Ends with G : " + str.endsWith("G"));
        System.out.println("Sub String  : " + str.substring(0, 5));
        System.out.println("Index of a: " + str.indexOf("a"));
        System.out.println("Last Index of a: " + str.lastIndexOf("a"));
        System.out.println("Replace a with x: " + str.replace('a', 'x'));
         String str1= "Ja va Pr og ra mm ing"; 
        System.out.println("Trim: " + str1.trim());
        System.out.println("Split : " );
        String[] words = str1.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
        
    }
}