class Solution {
    public ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        int prev = Integer.MIN_VALUE; 
        
        while (i < n1 && j < n2 && k < n3) {
            int a = A[i];
            int b = B[j];
            int c = C[k];
            
            if (a == b && b == c && a != prev) {
                result.add(a);
                prev = a;
                i++;
                j++;
                k++;
            } else if (a <= b && a <= c) {
                i++;
            } else if (b <= a && b <= c) {
                j++;
            } else {
                k++;
            }
        }
        
        if (result.isEmpty()) {
            result.add(-1); 
        }
        
        return result;
    }
}
