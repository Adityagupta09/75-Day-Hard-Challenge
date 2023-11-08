/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        //add code here.
        for(int i=0;i<n-1;i++){
            int low =i+1;
            int high=n-1;
            while(low<high){
                if(arr[low]+arr[high]+arr[i]==0){
                return true;
            }else if(arr[low]+arr[high]+arr[i]<0){
                low++;
            }else{
                high--;
            }
            }
            
        }
        return false;
    }
}
