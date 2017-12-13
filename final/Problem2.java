public class Problem2{
    public static void main(String[] args){
        String str = IO.readString();

        // If sentence doesn't have spaces, return the reverse of the word
        if (str.indexOf(" ") == -1){
            IO.outputStringAnswer(reverseWord(str));
            return;
        }

        // Option 1
        String res = ""; // Final string to be returned
        int preIndex = -1;
        int postIndex = str.indexOf(" ");

        while(postIndex < str.length() && postIndex > 0){
            res += (reverseWord(str.substring(preIndex+1,postIndex)) + " ");
            int temp = postIndex;
            preIndex = postIndex;
            postIndex = str.indexOf(" ", temp+1);
        }
        res += reverseWord(str.substring(preIndex+1));
        IO.outputStringAnswer(res);
        
        
        // Option 2
        res = "";
        String[] spl = str.split(" ");
        for(int i = 0; i < spl.length-1; i++)
            res += reverseWord(spl[i]) + " ";
        res += reverseWord(spl[spl.length-1]);
        
        IO.outputStringAnswer(res);
    }

    private static String reverseWord(String word){
        /*
         * Return the reverse of a SINGLE word
         *
         * @param
         *      word : "the" or "quick" or "brown", as examples
         */
        String res = "";
        for(int i = word.length()-1; i >= 0; i--)
            res += word.charAt(i);
        return res;
    }
}
