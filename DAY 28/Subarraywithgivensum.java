class Solution
{
    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       ArrayList<Integer>p=new ArrayList<>();
       
       int sum=0;
       
       int start=0;
       
       for(int i=0;i<n;i++){
           sum+=arr[i];
           
           while(sum>s && start<i ){
               sum=sum-arr[start];
               
               start++;
           }
           
           if(sum==s){
               p.add(start+1);
               p.add(i+1);
               return p;
           }
        
       }
       
       if(p.size()<1){
           p.add(-1);
       }
      
     
        return p;
       
    }
        
    }
