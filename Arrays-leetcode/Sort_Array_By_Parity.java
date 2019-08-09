// https://leetcode.com/problems/sort-array-by-parity/

class Sort_Array_By_Parity {
    public static void main(String args[])
    {
        sortArrayByParity([3,1,2,4]);
    }
    public int[] sortArrayByParity(int[] A) {

        int even = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int n = A[even];
                A[even] = A[i];
                A[i] = n;
                even++;
            }
        }
        return A;
    }
}

//Basically we are checking if the no is even if yes then we have to either keep it at it's place or it is being
//traced at different place which needs to be shifted
//if it is even incrementing the indices


/*
3 1 2 4 - first round 3 is no  // not even
3 1 2 4 -second round 1 is no // odd
3 1 2 4 -> 2 1 3 4 - the no scanned is even so the shifting is taking place
2 1 3 4-> 2 4 3 1 - the no scanned is even so the shifting takes place
 */