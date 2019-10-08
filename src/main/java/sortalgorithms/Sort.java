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
