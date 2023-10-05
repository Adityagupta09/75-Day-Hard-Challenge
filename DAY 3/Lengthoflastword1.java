class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder strb = new StringBuilder(s);
        StringBuilder rev = strb.reverse();
        int count=0;
       for(int i=0; i<rev.length(); i++){
           if(rev.charAt(i)!=' '){
               count++;
           }
           else{
               if(count>0){
                   return count;
               }
        }
       }
       return count;
    }
}
