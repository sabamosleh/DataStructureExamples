package sortalgorithms;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] inputs=new int[]{90,32,19,18,4,1};


        Sort doSort=new Sort(inputs);
        System.out.println(Arrays.toString(doSort.bubbleSort(inputs)));

        inputs=new int[]{90,32,19,18,4,1};
        doSort=new Sort(inputs);
        System.out.println(Arrays.toString(doSort.insertionSort(inputs)));


    }

}
