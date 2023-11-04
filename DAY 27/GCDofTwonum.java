class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        if(A==0){
            return B;
        }
        
        
        int temp = gcd(B%A, A);
        return temp;
    } 
}
