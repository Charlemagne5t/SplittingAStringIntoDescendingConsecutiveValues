public class Solution {
    public boolean splitString(String s) {
        return dfs(s, -1L, 0, 0, false);
    }
    boolean dfs(String s, long last, int i, int count, boolean zero){
        if(i == s.length() ) {
            if(zero && last != 1){
                return false;
            }
            if(zero && last == 1){
                count++;
            }
            return count >= 2 ;
        }
        if(s.charAt(i) == '0'){
            return dfs (s, last, i + 1, count, true);
        }
        boolean result = false;
        for (int j = i + 1; j < s.length() + 1; j++) {

            if(j - i >= 12){
                break;
            }
            String add = s.substring(i, j);
            long asInt = Long.parseLong(add);
            if(last == -1 || last - 1 == asInt){
                result |= dfs(s, asInt, j, count+1, false);
            }

        }

        return result;

    }
}
