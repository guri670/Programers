import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<>();
        
        for (String str : s1) {
            set.add(str);
        }
        
        int answer = 0;
        
        for (String str : s2) {
            if (set.contains(str)) {
                answer++;
            }
        }
        
        return answer;
    }
}