ublic class Removeduplicates {
    public static void main(String[] args) {
        String s = "ABACDAB";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    s = s.replace(s.charAt(j), ' ');
                }
            }
        }
        s=s.replace(" ", "");
        System.out.println(s);
    }

}
