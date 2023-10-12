
package ht1;

/**
 *
 * @author mahmu
 */
public class Words {
    public static void main(String[] args) {
        // The soliloquy from the previous question
        String squy = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Extract words 
        String[] words = squy.split("\\s+");

        
        bubbleSort(words);

        // Print the sorted words
        System.out.println("Sorted Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Bubble Sort method
    private static void bubbleSort(String[] a) {
        int n = a.length;
        boolean swap;

        do {
            swap = false;

            for (int i = 1; i < n; i++) {
                if (a[i - 1].compareToIgnoreCase(a[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;

                    swap = true;
                }
            }
        } while (swap);
    }
}
