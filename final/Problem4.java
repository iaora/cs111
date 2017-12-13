public class Problem4{
    public static void main(String[] args){
        String str = "good gravy";
        System.out.println(reverse(str));
    }

    // Recursion Problem 4
    public static String reverse(String str){
        System.out.println("Str: " + str);
        return reverse(str,0);
    }

    private static String reverse(String str, int n){
        if (n == str.length())
            return "";
        return "" + reverse(str, n+1) + str.charAt(n);

    }
}
