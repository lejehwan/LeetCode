class Solution {
    public int minDeletionSize(String[] strs) {
        int answer = 0;
        for (int i = 0; i < strs[0].length(); i++){
            char temp = 0;
            for (int j = 0; j < strs.length; j++) {
                char ch = strs[j].charAt(i);
                if(temp > ch){
                    answer ++;
                    break;
                }else temp = ch;
            }
        }
        return answer;
    }
}