class Solution {
    public boolean detectCapitalUse(String word) {
        char[] capital = word.toCharArray();
        if(capital.length == 1) return true;
        boolean first = Character.isUpperCase(capital[0]);
        boolean second = Character.isUpperCase(capital[1]);
        if (first && second){ // 첫번째 문자와 두번째 문자가 대문자인 경우
            for (int i = 2; i < capital.length; i++){
                if (Character.isLowerCase(capital[i])) return false;
            }
        }else if (first){// 첫번째 문자는 대문자 두번째 문자는 소문자인 경우
            for (int i = 2; i < capital.length; i++){
                if (Character.isUpperCase(capital[i])) return false;
            }
        }else if(!second) {// 첫번째 문자와 두번째 문자가 소문자인 경우
            for (int i = 2; i < capital.length; i++){
                if (Character.isUpperCase(capital[i])) return false;
            }
        }else if (second) {// 첫번째 문자는 소문자 두번째 문자는 대문자인 경우
            return false;
        }
        return true;
    }
}