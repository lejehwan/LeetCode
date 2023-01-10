class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] word = s.split(" ");
        char[] pat = pattern.toCharArray();
        if (word.length != pat.length) return false;
        for (int i = 0; i < word.length; i++){
            if (map.containsKey(pat[i])){
                if(!map.get(pat[i]).equals(word[i])) return false;
            }else if(map.containsValue(word[i])) return false;
            else map.put(pat[i], word[i]);
        }
        return true;
    }
}