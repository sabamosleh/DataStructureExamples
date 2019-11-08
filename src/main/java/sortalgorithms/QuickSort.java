public void quickSort(int[] array, int left, int right) {
     int i, j, v;
     while ( right > left ) {
          j = right;
          i = left - 1;
          v = array[ right ];

          while ( true ) {
               do {
                    i++;
               } while ( array[ i ] < v && i < j );
               do {
                    j--;
               } while ( array[ j ] > v && i < j );

               if ( i >= j )
                    break;

               swapKeys( array , i , j );

          }

          swapKeys( array , i , right );

          if (( i - 1 - left ) <= ( right - i - 1 )) {
               quickSort( array , left , i - 1 );
               left = i + 1;
          } else {
               quickSort( array , i + 1 , right );
               right = i - 1;
          }
     }
}

public void swapKeys(int[] array, int i, int j) {
     int temp;
     temp = array[ i ];
     array[ i ] = array[ j ];
     array[ j ] = temp;
} 
