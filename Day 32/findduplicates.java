class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        hs.add(arr[0]);
        for(int i=1;i<n;i++){
            if(hs.contains(arr[i])){
                hs1.add(arr[i]);
            }
            hs.add(arr[i]);
        }
        ArrayList<Integer> al = new ArrayList<>(hs1);
        if(al.isEmpty()){
            al.add(-1);
        }
        Collections.sort(al);
        return al;
    }
}
