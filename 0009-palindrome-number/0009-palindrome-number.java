class Solution {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        String reverse = "";
        for(int i = temp.length() -1 ; i >= 0; i--){
            reverse += temp.split("")[i];
        }
        if (reverse.equals(temp)) return true;
        else return false;
    }
}