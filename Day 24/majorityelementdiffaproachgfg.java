

//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int size)
    {
        if(size==1){
            return arr[0];
        }
        
        int match = size/2;
        int count =1;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                count=count+1;
                
                if(count>match){
                    return arr[i];
                }
            }
            if(arr[i]!= arr[i+1]){
                count=1;
            }
        }
        return -1;
    }
}
