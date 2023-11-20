class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new int[]{start[i] , end[i]});
        }
        
        Collections.sort(list, (a,b)-> a[1]- b[1]);
        int ans = 1, prev =0;
        for(int i=1; i<n; i++){
            if(list.get(i)[0]>list.get(prev)[1]){
            ans++;
            prev = i;
            }
        }
        return ans;
    }
}
