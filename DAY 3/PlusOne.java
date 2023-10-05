import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] arr) {
        BigInteger temp= new BigInteger("0");
        int n=arr.length+1;
        for(int i=0; i<arr.length; i++){
            temp=temp.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(arr[i]));
        }

        temp= temp.add(BigInteger.valueOf(1));
        String s = temp.toString();
        int[] intArray = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        return intArray;
    }
}
