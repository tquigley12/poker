/**
 * The IntBubbleSorter class provides a public static
 * method for performing a bubble sort on an int array.
 */
package poker;

/**
 * This class is a direct copy of the bubble sort routine in Chapter 16
 * of Starting Out with Java - From Control Structures through Data Structures
 * 4th Edition.
 * @author tquigley1
 */
public class IntBubbleSorter {
    
    /**
     * The bubbleSort method uses the bubble sort algorithm
     * to sort an int array.
     * @param array The array to sort.
     */
    
    public static void bubbleSort(int[] array) {
        int lastPos;
        int index;
        int temp;
        
        for (lastPos = array.length - 1; lastPos >= 0; lastPos--) {
            for (index = 0; index <= lastPos - 1; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
    }
}
