public class Reversestrig {

    public static String reversestring(String str){

        StringBuilder strb = new StringBuilder(str);
        StringBuilder reversedB = strb.reverse();

       String reversed =  reversedB.toString();
        return reversed;
    }

    public static void main(String[] args) {
        String str = "Aditya";
        System.out.println(reversestring(str));
    }
}
