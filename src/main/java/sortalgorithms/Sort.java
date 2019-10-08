package sortalgorithms;

public class Sort {


    private int[] inputArray;


    public int[] bubbleSort(int[] inputArray) {

        int size = inputArray.length - 1;
        int temp = -1;

        if (size == 1)
            return inputArray;

        for (int i = 0; i <= size; i++) {

            for (int j = 0; j < size - i; j++) {

                if (inputArray[j] > inputArray[j + 1]) {

                    temp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = temp;


                }
            }


        }

        return inputArray;

    }


    public int[] selectionSort(int[] inputArray) {

        int size = inputArray.length - 1;

        if (size == 1)
            return inputArray;

        for (int i = 0; i < size; i++) {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (inputArray[j] < inputArray[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = inputArray[index];
            inputArray[index] = inputArray[i];
            inputArray[i] = smallerNumber;
        }
        return inputArray;

    }


    /* Java program for Merge Sort */
    // Merges two subarrays of inputArray[];
    // First subarray is inputArray[l..m]
    // Second subarray is inputArray[m+1..r]
    
    public int[] merge(int[] inputArray, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = inputArray[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = inputArray[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                inputArray[k] = L[i];
                i++;
            } else {
                inputArray[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            inputArray[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            inputArray[k] = R[j];
            j++;
            k++;
        }
        return inputArray;

    }


    // Main function that sorts inputArray[l..r] using
    // merge()
    void sort(int[] inputArray, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(inputArray, l, m);
            sort(inputArray, m + 1, r);

            // Merge the sorted halves
            merge(inputArray, l, m, r);
        }
    }

    public Sort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }


}
