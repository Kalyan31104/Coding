//  Count Number of Pairs With Absolute Difference k
class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0; // Initializing  a variable 
        //Nested for loop is used to get a pair.
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
        // if condition is to check Absolute Difference k
            if(Math.abs(nums[i]-nums[j])==k){
                count++; // Incrementing variable if condition is satisfied.
            }
            }
        }
        return count; // Returning Number of Pairs With Absolute Difference k
    }
}
