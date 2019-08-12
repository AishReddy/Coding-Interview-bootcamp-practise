package Tree;

public class BinarySearchTree {
    //recursive solution

    public static int binarySearchTree(int[] a, int start, int end, int target) {
        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        }
        if(target==a[middle]) {
            return middle;
        } else if(target<a[middle]) {
            return binarySearchTree(a, start, middle - 1, target);
        } else {
            return binarySearchTree(a, middle + 1, end, target);
        }
    }

    public static void main(String[] args) {
        //call the binarySearch
        int A[] = { 2, 5, 6, 8, 9, 10 };
        int target = 5;
        int low = 0, high = A.length -1;
        int index = binarySearchTree(A,low, high, target);
        System.out.println(index);

    }
}
