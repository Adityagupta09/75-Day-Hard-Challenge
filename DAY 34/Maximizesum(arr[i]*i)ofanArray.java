
class Solution{
    
    int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += ((long)arr[i]* i % 1000000007);
            sum %= 1000000007;
        }
        return (int)sum;
    }   
}
