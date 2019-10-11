package sortalgorithms;

public class Sort {


    private int[] inputArray;

    public Sort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] bubbleSort(int[] input) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < input.length - j; i++) {
                if (input[i] > input[i + 1]) {
                    tmp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return inputArray;
    }

    public int[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }
}
