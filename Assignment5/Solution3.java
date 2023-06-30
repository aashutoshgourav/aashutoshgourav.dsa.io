class Solution3{public int[] sortedSquares(int[]A){
        int[] squares = new int[A.length];
        int negativeValuePointer=0;
        int positiveValuePointer =A.length-1;
        for(int i=A.length-1;i>=0;i--){
           if(A[positiveValuePointer]>=Math.abs(A[negativeValuePointer])){
               squares[i] =
                       A[positiveValuePointer] * A[positiveValuePointer--];
               
           }else if( A[positiveValuePointer] <Math.abs(A[negativeValuePointer])){
               squares[i] =
                       A[negativeValuePointer] * A[negativeValuePointer++];
               
           }else{
               squares[i++] =
                       A[positiveValuePointer] * A[positiveValuePointer--];
               squares[i] =
                       A[negativeValuePointer] * A[negativeValuePointer++];
           }
        }
        return squares;
    }
              }
