package DataStructureAndAlgorithms.Array;

import java.util.Arrays;
public class ExceptMeMultiply {
    public static void main(String args[]) {
        int array[] =new int[]{1,2,3,4};
        int print[]=solveMe(array);
        System.out.println(Arrays.toString(print));
    }
    public static  int [] solveMe(int [] ar)
    {
        int[] retArray = new int[ar.length];
        int multiply=1;
        for(int i=0;i<ar.length;i++)
        {
            multiply=1;
            for(int j=0;j<ar.length;j++)
            {
                if(i!=j)
                    multiply=multiply*ar[j];
            }
            retArray[i]=multiply;
        }
        return retArray;
    }
}

/*
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product
 of all the elements of nums except nums[i]. Solve it without division and in O(n). For example, given [1,2,3,4],
 return [24,12,8,6].

[1,2,3,4]
2*3*4=24
3*4=12
4*2=8
3*2=6
 */