// Count Pairs Whose Sum is Less than Target

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;// intializing a variable to count number of pairs whose sum is less than target.
        int n=nums.size();  // Getting number of elements in a arraylist.
       // Nested for loop is used to get a pair whose sum is less than target.
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++; // incrementing count variable if condition is satisfied
                }
            }
        }
        return count;// Returning number of pairs whose sum is less than target.
        
    }
}
