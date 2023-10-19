class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sLen = s.length()-1;
        int tLen = t.length()-1;
        while(sLen >= 0 || tLen >= 0)
        {
            //sSkip
            int sSkip = 0;
            while(sLen >= 0)
            {
                if(s.charAt(sLen) == '#')
                {
                    sSkip++;
                    sLen--;
                }
                else if(sSkip > 0)
                {
                    sSkip--;
                    sLen--;
                }
                else
                {
                    break;
                }
            }
            //tSkip
            int tSkip = 0;
            while(tLen >= 0)
            {
                 if(t.charAt(tLen) == '#')
                {
                    tSkip++;
                    tLen--;
                }
                else if(tSkip > 0)
                {
                    tSkip--;
                    tLen--;
                }
                else
                {
                    break;
                }
            }

            //compare the current index.
            if(sLen >= 0 && tLen >= 0 && s.charAt(sLen) == t.charAt(tLen)) {
                sLen--;
                tLen--;
            } 
            else{
                return sLen == -1 && tLen == -1; 
            }
            

        }
        return true;
    }
}
