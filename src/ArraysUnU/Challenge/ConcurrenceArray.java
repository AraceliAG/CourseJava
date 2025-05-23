package ArraysUnU.Challenge;

public class ConcurrenceArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int maxCount = 0;
        int mostFrequent = array[0];

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[j] == currentNumber) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentNumber;
            }
        }

        System.out.println("Major concurrence" + maxCount);
        System.out.println("The element most frequent  is:  " + mostFrequent);
    }
}
