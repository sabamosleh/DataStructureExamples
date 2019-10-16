package sortalgorithms;

import java.util.Arrays;

public class Sort {


    private int[] inputArray;

  //////////////////////////////////////
    public static int[] mergeSort(int [ ] inputArray)
	{
            
                int[] inputArray2 = inputArray.clone();
            
		int[] temporaryArray = new int[inputArray2.length];
		mergeSort(inputArray2, temporaryArray,  0,  inputArray2.length - 1);
                return inputArray2;
	}


	private static void mergeSort(int [ ] inputAray, int [ ] temporaryArray, int leftIndex, int rightIndex)
	{
		if( leftIndex < rightIndex )
		{
			int middle = (leftIndex + rightIndex) / 2;
			mergeSort(inputAray, temporaryArray, leftIndex, middle);
			mergeSort(inputAray, temporaryArray, middle + 1, rightIndex);
			merge(inputAray, temporaryArray, leftIndex, middle + 1, rightIndex);
		}
	}


    private static void merge(int[ ] inputArray, int[ ] temporaryArray, int leftIndex, int rightIndex, int endIndex )
    {
        int leftEnd = rightIndex - 1;
        int k = leftIndex;
        int num = endIndex - leftIndex + 1;

        while(leftIndex <= leftEnd && rightIndex <= endIndex)
            if(inputArray[leftIndex] < inputArray[rightIndex])
                temporaryArray[k++] = inputArray[leftIndex++];
            else
                temporaryArray[k++] = inputArray[rightIndex++];

        while(leftIndex <= leftEnd)    
            temporaryArray[k++] = inputArray[leftIndex++];

        while(rightIndex <= endIndex)  
            temporaryArray[k++] = inputArray[rightIndex++];

        for(int i = 0; i < num; i++, endIndex--)
            inputArray[endIndex] = temporaryArray[endIndex];
    }
  ///////////////////////////////////////
    
    
    
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
