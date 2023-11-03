



class Solution {
    
    long maxProduct(int[] arr, int n) {
        
        long max=Integer.MIN_VALUE;
        
        long suffix=1;
        long prefix=1;
        
        for(int i=0;i<n;i++){
            
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}
