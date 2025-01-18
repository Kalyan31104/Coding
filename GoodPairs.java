class Solution {
    public int numIdenticalPairs(int[] nums) {
      //count variable is initialized here and it used to find the number of good pairs.
        int count =0;
      //Nested for loop are used to get pairs from an array
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
              // A pair (i, j) is called good if nums[i] == nums[j] and i < j.
                if(i<j && nums[i]==nums[j]){
                    count++;

                }
            }
        }
        return count;// Number of good pairs.
    }
}
