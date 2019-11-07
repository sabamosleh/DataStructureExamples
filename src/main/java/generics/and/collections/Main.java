package generics.and.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {


    //chapter 1

    public static List <Integer>  deleteOne(List<Integer> ints){

        for(Iterator<Integer> n = ints.iterator(); n.hasNext();){

            if(n.next()<9){
               n.remove();
                System.out.println("deleted");
            }


        }
        return ints;
    }


    public  static Integer IntegerSum(List<Integer> ints){


        Integer sum=0;

        for(int n:ints){


            sum+=n;
        }
        return sum;

    }



    public static void main(String[] args) {


        //-------------chapter one ------------------------------------

        System.out.println(deleteOne(new ArrayList(Arrays.asList(6,121,1))).size());

         //this will throws exeption becuase Array.asList returns a fixed size list it is an AbstractList actually and it
         // is not a part of Collections framework and it when you call remove() it refers to the remove method in AbstractList
         // class this class also implements List but based on method calls , it will call remove method in the Abstract class
         //not the remove method int the remove in the Iterator interface or Collection class
         //would not work --> unsupported opratoin exeception
         //but why the remove(index) on the ints list will work??????
          deleteOne(Arrays.asList(6,121,1));

          //---------------------chapter two----------------------------------


        List<Integer> ints=new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        //List<Number> numbers=ints; --compile error --->List<Number> is not sybtype of List<Iteger>

        //____________________
        List<Number> nums=new ArrayList<Number>();
        List<Integer> ints_=Arrays.asList(1,2,3);
        List<Double> doubles=Arrays.asList(2.4,6.7,23.6);
        nums.addAll(ints_);
        nums.addAll(doubles);
        //____________________




    }


}
