package sortalgorithms;

public class Sort {


    private int[] inputArray;


    public int[] bubbleSort(int[] inputArray){

        int size=inputArray.length-1;
        int temp=-1;

        if(size==1)
            return inputArray;

        for(int i=0;i<=size;i++){

            for(int j=0;j<size-i;j++){

                if(inputArray[j]>inputArray[j+1]){

                    temp=inputArray[j+1];
                    inputArray[j+1]=inputArray[j];
                    inputArray[j]=temp;


                }
            }


        }

        return inputArray;

    }

    public static int[] selectionSort(int[] inputArray) {
        for(int i = 0; i < inputArray.length-1; i++) {
            int posSmallest = i;
            for(int j = i+1; j < inputArray.length; j++) {
                if(inputArray[posSmallest] > inputArray[j]) {
                    posSmallest = j;
                }
            }
            if(i != posSmallest) {
                int tmp = inputArray[posSmallest];
                inputArray[posSmallest] = inputArray[i];
                inputArray[i] = tmp;
            }
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
