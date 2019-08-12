package Tree;


public class BinarySearchTreeIterativeSolution {

    public static int optimizedSearch(int[] nums, int target) {
        int left=0;
        int right=nums.length;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1 ;
        }
        return -1 ;
    }
    public static void main(String[] args) {
        //call the binarySearch
        int A[] = { 2, 5, 6, 8, 9, 10 };
        int target = 5;
        int indexByOptimizedSearch=optimizedSearch(A,target);
        System.out.println(indexByOptimizedSearch);
    }
}