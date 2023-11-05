class Solution
{ 
   
    static int[] findIndex(int a[], int N, int key) 
    { 
        int start=-1,end=-1;
        for(int i=0;i<N;i++){
            if(a[i]==key){
            start=i;
            break;
            }
        }
        for(int j=N-1;j>=0;j--){
            if(a[j]==key){
                end=j;
                break;
            }
        }
        return new int[]{start,end};
    }
}
