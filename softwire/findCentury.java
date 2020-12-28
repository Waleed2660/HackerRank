import java.util.*;

public class findCentury {

    public static void main(String[] args) {
        int result = centuryFromYear(1907);
        System.out.println("Century is: " + result);
    }

    static int centuryFromYear(int year) {
        return (year + 99) / 100;
      }
}
/*
Long way
        int cent = 100;

            while(true){
                if(cent-99 <= year && year <= cent){
                    break;
                }
                cent = cent + 100;
            }
            return cent/100;
        }

 */