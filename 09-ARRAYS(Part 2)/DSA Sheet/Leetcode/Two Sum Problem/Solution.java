public class Solution {
    public int [] twoSum(int target , int [] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
    

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
         int [] nums={2,7,11,15};
         int target=9;
         int [] sol=solution.twoSum(target, nums);
         System.out.println(sol[0]+","+sol[1]);
    }
}
