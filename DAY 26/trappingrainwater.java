

class Solution{
    
    
    static long trappingWater(int arr[], int n) { 
        
        int [] pfmax= new int[n];
        pfmax[0]=arr[0];
        for(int i=1;i<n;i++){
            pfmax[i]=Math.max(pfmax[i-1],arr[i]);
        }
        int [] sfmax= new int[n];
        sfmax[n-1]=arr[n-1];
        for(int i=n-2;i>0;i--){
            sfmax[i]=Math.max(sfmax[i+1],arr[i]);
        }
        long ans=0;
        for(int i=1;i<n-1;i++){
            int lb=pfmax[i-1];
            int rb=sfmax[i+1];
            int amt=Math.min(lb,rb)-arr[i];
            if(amt>0){
                ans=ans+amt;
            }
        }
        return ans;
    } 
}
