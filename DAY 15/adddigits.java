class Solution {
    public int addDigits(int num) {
        
        while(num>=10){
            int temp=0;
        while(num!=0){
            int dig=num%10;
            temp = temp+dig;
            num=num/10;
        }
        num=temp;
        }
        return num;
    }
}
