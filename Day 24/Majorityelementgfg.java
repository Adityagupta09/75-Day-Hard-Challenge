class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: a){
            if(!map.containsKey(i)){
                map.put(i,1);
                
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        
        for(var e: map.entrySet()){
            int key=e.getKey();
            int value = e.getValue();
            if(value>size/2){
                return key;
            }
            
        }
        return -1;
    }
}
