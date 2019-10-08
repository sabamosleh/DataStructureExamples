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

     public int[] insertionSort(int [] array) {
        
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
        return array;
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
