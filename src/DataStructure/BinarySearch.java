package DataStructure;

import DataStructure.Trees.BinaryTreeNode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target=6;
        BinarySearch b= new BinarySearch();
        System.out.println(b.search(arr,target));
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);

    }

    private int findIndex(int startIndex, int endIndex, int target, int[] nums) {
        if(endIndex>=startIndex){
            int mid= (startIndex+endIndex)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                return findIndex(mid,endIndex,target,nums);
            else
                return findIndex(0,mid,target,nums);
        }
        return -1;

    }

    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }


    //another way

}
