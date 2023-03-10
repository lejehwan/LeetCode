class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();
        char[] sChar = new char[256];
        char[] tChar = new char[256];
        for (int i = 0; i < s.length(); i++){
            char tempS = sCh[i];
            char tempT = tCh[i];
            if (sChar[tempS] == 0 && tChar[tempT] == 0){
                sChar[tempS] = tempT;
                tChar[tempT] = tempS;
            } else {
                if(sChar[tempS] != tempT || tChar[tempT] != tempS){
                    return false;
                }
            }
        }
        return true;
    }
}