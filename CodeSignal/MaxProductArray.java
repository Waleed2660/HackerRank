public class MaxProductArray {

    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println("Max Product: "+ adjacentElementsProduct(inputArray));
    }


    static int adjacentElementsProduct(int[] intArray) {
        int maxValue = intArray[0]*intArray[1], pNew = 0;
        for(int x = 1; x < intArray.length; x++){
            if (x+1 < intArray.length) {
                pNew = intArray[x] * intArray[x + 1];
                if(pNew > maxValue){
                    maxValue = pNew;
                }
            }
        }
        return maxValue;
    }
}

/*
* Alternate way to do it
* int adjacentElementsProduct(int[] inputArray) {
    return IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt();}
*/