package lexicon;

import java.util.Arrays;

public class Lexicon {
    static int no_of_swaps = 0;
    /**
     *
     * @param s is not null
     * @param k is > 0
     * @return the lexicographically greatest string we can obtain from s using the following operation repeatedly:
     * <p>
     *     we can swap the characters at index i and i+k (i+k should not exceed the largest possible index) as long as the character at position i+k is lexicographically greater than the character at position i.
     * </p>
     */
    public static String makeGreatest(String s, int k) {

        String ip = s;
        boolean swapped = true;

        //this checks if the value of 'ip' is still being swapped
        while(swapped) {
            //this initialises swapped
            swapped = false;
            for (int i = 0; i + k < ip.length(); i++) {
                String swapped_string = stringSwap(ip, i, i + k);

                //checking is swapped string is greater than s
                if (swapped_string.compareTo(ip) > 0) {
                    //update s to be the greater string
                    no_of_swaps++;
                    ip = swapped_string;
                    swapped = true;
                    //whenever something is swapped, it restarts the loop
                    i = 0;
                }
            }
        }

        return ip;

    }

    /**
     *
     * @param s Initial string
     * @param i Initial index
     * @param f Final index
     * @return The swapped string
     */
    private static String stringSwap(String s, int i, int f){
        char[] s_Array = s.toCharArray();
        char initial = s_Array[i];
        s_Array[i] = s_Array[f];
        s_Array[f] = initial;
        return String.valueOf(s_Array);
    }

    /**
     *
     * @param s is not null
     * @param k is > 0
     * @return the minimum number of operations needed to obtain lexicographically greatest string from s using the following operation repeatedly:
     * <p>
     *     we can swap the characters at index i and i+k (i+k should not exceed the largest possible index) as long as the character at position i+k is lexicographically greater than the character at position i.
     * </p>
     */
    public static int countOperations(String s, int k) {
        no_of_swaps = 0;
        makeGreatest(s, k);
        return no_of_swaps;
    }

}
