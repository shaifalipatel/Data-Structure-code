package leetCode;

public class findpivotindex {

    public static void main(String[] args) {
        int[] nums= {2,5,6,1,4,2};

        int target = 6;
        findpivotindex findpivotindex = new findpivotindex();
        System.out.println(findpivotindex.pivotIndex(nums));

    }

    public int pivotIndex(int[] nums) {
        int leftSum= 0;
        int rightSum= nums[nums.length-1];
        int i=0, j=nums.length-2;
        while(i<=j){
            if(leftSum<rightSum){
                leftSum+=nums[i];
                i++;
            }
            if(rightSum<leftSum){
                rightSum+=nums[j];
                j--;
            }
           if(leftSum==rightSum){
               return i;
           }
        }
        return -1;
    }

    public int pivotIndexLeetCode(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return 0;

        int leftSum = 0, rightSum = 0;
        //Running sum of an array
        for(int i = 0; i < nums.length; i++)
            rightSum += nums[i];

        for(int i = 0; i < nums.length; i++){
            if(i != 0){
                leftSum += nums[i - 1];
            }
            rightSum -= nums[i];

            if(leftSum == rightSum) return i;
        }

        return -1;
    }
}
