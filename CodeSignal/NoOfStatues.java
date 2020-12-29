import java.util.Arrays;

/**
 * Finds the missing number of elements from min to max number in an array by difference of 1
 */
public class NoOfStatues {

    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(makeArrayConsecutive2(statues));
    }

    static int makeArrayConsecutive2(int[] statues) {
        int counter = 0, diff = 0;
        Arrays.sort(statues);
        System.out.println("sorted: "+ Arrays.toString(statues));

        for(int x = 0; x+1 < statues.length; x++){
            diff = statues[x+1]-statues[x] -1;
            System.out.println("diff : "+ diff);
            if(diff > 0){
                counter = counter + diff;
            }
        }
        System.out.println("counter: " +counter);
        return counter;
    }
}

/*
* Alternate way, this approach focuses on how many elements are present between first and last element
* & how many are required to fill the gap
int makeArrayConsecutive2(int[] a) {
    Arrays.sort(a);
    int n = a[a.length-1] - a[0];
    return n - a.length + 1;
}
 */