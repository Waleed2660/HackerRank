import java.util.*;

public class MaxStringInArray {

    public static void main(String[] args) {
    String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};

    System.out.println("Output: " + Arrays.toString(allLongestStrings(inputArray)));
    }

    /**
     * This functions takes an array, traverses through it, if current element i greater than next element,
     *
     * @param inputArray
     * @return
     */
    static String[] allLongestStrings(String[] inputArray) {

        String l = ""; //full string with "-" separator
        for( String s: inputArray )
        {
            System.out.println("when s: "+s+" , new l: "+l);
            //length is first index of substring
            //if list has same size strings, add this one
            if( l.indexOf("-") == s.length() ) {
                System.out.println("111111111111111111111111111");
                l += s + "-";
            }
                //reset if list has smaller strings
            else if ( l.indexOf("-") < s.length() ) {
                l = s + "-";
                System.out.println("222222222222222222222222222");
            }
        }
        return l.split( "-" );
    }

}
