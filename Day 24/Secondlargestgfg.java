
class Solution {
    int print2largest(int arr[], int n) {
        if(n==1){
            return -1;
        }
        
        Arrays.sort(arr);
        for(int i=arr.length-1; i>0; i--){
            if(arr[i]!= arr[i-1]){
                return arr[i-1];
            }
        }
        return -1;
    }
}
