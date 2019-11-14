package sortalgorithms;

public class Sort {


    private int[] inputArray;


    public int[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public Sort(int[] inputArray) {
        this.inputArray = inputArray;
    }


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

    public int[] selectionSort(int[] inputArray){

        for(int j=0;j<inputArray.length;j++) {
            int min=inputArray[0];
            int index=0;
            for (int i = j; i < inputArray.length - 1; i++) {

                if (min > inputArray[i]) {
                    min = inputArray[i];
                    index=i;
                }

            }
            inputArray[index]=inputArray[j];

            inputArray[j] = min;
        }
        return inputArray;

    }

    //i use this method in quick sort to bring the pivot to the middle of the array
    //and set up less elements in left side and right elements to the right side of
    //the pivot element
    public int partition(int[] inputArray,int start,int end){

        int pivot=inputArray[end];

        int i=start-1;
        for(int j=start;j<end;j++){

            if(inputArray[j]<=pivot){

                i++;
                int temp=inputArray[j];
                inputArray[j]=inputArray[i];
                inputArray[i]=temp;

            }


        }

       int temp=inputArray[i+1];
        inputArray[i+1]=inputArray[end];
        inputArray[end]=temp;

        return i+1;

    }


    public int[] quickSort(int[] inputArray,int start,int end){

        if(start<end){

            int pivot=partition(inputArray,start,end);
            quickSort(inputArray,start,pivot-1);
            quickSort(inputArray,pivot+1,end);
        }
        return inputArray;



    }

    public int[] insertionSort(int[] inputArray){

        for (int j=1;j<inputArray.length;j++){

            int current=inputArray[j-1];

            while (current>inputArray[j] && j>0){

                int temp=inputArray[j-1];
                inputArray[j-1]=inputArray[j];
                inputArray[j]=temp;
                j--;

            }

        }
        return inputArray;

    }
}
