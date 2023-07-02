public class Main {
    public static void main(String[] args) {

        int upperBound = 10;
        int lowerBound = -10;
        int range = (upperBound - lowerBound) + 1;
        Integer[] arrayOfNumbers = new Integer[20];

        int negativePosition = -1;
        int positivePosition = -1;
        int negativeValue = 1;
        int positiveValue = Integer.MAX_VALUE;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = (int)(Math.random() * range) + lowerBound;

            if ((arrayOfNumbers[i] < 0) & (arrayOfNumbers[i] < negativeValue)) {
                negativeValue = arrayOfNumbers[i];
                negativePosition = i;
            }
            else if ((arrayOfNumbers[i] > 0) & (arrayOfNumbers[i] < positiveValue)) {
                positiveValue = arrayOfNumbers[i];
                positivePosition = i;
            }
        }
        if ((negativePosition == -1) || (positivePosition == -1)) {
            System.out.println("Not found");
        }
        else {
            arrayOfNumbers[positivePosition] = negativeValue;
            arrayOfNumbers[negativePosition] = positiveValue;
        }
    }
}
