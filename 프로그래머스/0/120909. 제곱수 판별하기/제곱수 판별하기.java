class Solution {
    public int solution(int n) {
        int sqrtN = (int) Math.sqrt(n);
        
        if (sqrtN * sqrtN == n) {
            return 1;
        } else {
            return 2; 
        }
    }
}