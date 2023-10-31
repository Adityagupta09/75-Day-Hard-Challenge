class Solution {
    int missingNumber(int nums[], int n) {
        
        int nsum = (n*(n+1)/2);
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        
        return (nsum-sum);
    }
}
