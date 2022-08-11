package leetCode;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums= {1,7,3,6,5,6};
        int target = 6;
        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.twoSum(nums, target);
        for (int i:result) {
            System.out.println(i);
        }

    }

    public int[] twoSum(int[] nums, int target) {
        int a[]= new int[2];
        for(int i=1; i<=nums.length-1; i++){ //2
            for(int j=0; j<nums.length; j++){
                if(nums[i]+nums[j]==target && i!=j){
                    a[0]=j;
                    a[1]=i;
                    break;
                }
            }
        }
        return a;
    }
}
