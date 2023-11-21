class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
         int n =x.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch = x.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty())return false;
    if(st.peek()=='(' && ch==')' || st.peek()=='[' && ch==']' || st.peek()=='{'&& ch=='}'){
                        st.pop();}

            
            else return false;
        }}
        if(st.size()!=0)return false;
        else return true;
    }
}
