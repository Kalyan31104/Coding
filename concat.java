class Solution {
    public static int[] getConcatenation(int[] nums) {
      // Creating a new Array to store concatenated values
        int[] ans=new int[nums.length*2];
      // iterating over the array and accessing valuses using for loop.
        for(int i=0;i<nums.length;i++){
          // here we are concatinating single array with itself.
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
    return ans; // returning concatenated array.
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//using Scanner to get input from user.
        int n=sc.nextInt();
        int[] nums=new int[n];
      // getting an array from user as a input for concatenating.
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
      //calling the function and passing array as a parameter to get concatenated array.
        int[] z=getConcatenation(nums);
        System.out.println(Arrays.toString(z));
    }
}
