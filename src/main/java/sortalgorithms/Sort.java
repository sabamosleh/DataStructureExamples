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
    
    
	private void merge(int arr[], int l, int m, int r) 
	{ 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		for (int i=0; i<n1; ++i) 
			L[i] = arr[l + i]; 
		for (int j=0; j<n2; ++j) 
			R[j] = arr[m + 1+ j]; 


		{ 
			if (L[i] <= R[j]) 
			{ 
				arr[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		{ 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		while (j < n2) 
		{ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 
    
	public int[] mergeSort(int[] inputArray, int l, int r) 
	{ 
		if (l < r) 
		{ 
			int m = (l+r)/2; 

			mergeSort(inputArray, l, m); 
			mergeSort(inputArray , m+1, r); 

			merge(inputArray, l, m, r); 
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
