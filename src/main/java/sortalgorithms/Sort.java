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
    public int[] insertionSort(int[] inputArray){
    	int size=inputArray.length-1;
    	if(size==1)
            return inputArray;
    	for(int i = 1;i <= size;i++){
			int key =inputArray[i];
			int j = i-1;
			while(j>=0 && inputArray[j] > key){
				inputArray[j+1] = inputArray[j];
				j--;
			}
			inputArray[j+1]=key;
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
