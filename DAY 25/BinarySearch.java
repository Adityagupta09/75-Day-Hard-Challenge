class Solution {
    int binarysearch(int arr[], int n, int x) {
        // code here
        int l = 0, r = arr.length - 1;
        
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            
            if (arr[m] == x)
                return m;
 
            
            if (arr[m] < x)
                l = m + 1;
 
            
            else
                r = m - 1;
        }
        return -1;
    }
}
