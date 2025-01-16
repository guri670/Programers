class Solution {
    public int solution(int n, int k) {
        int food = 12000;
        int drink = 2000;
        int free = n/10;
        
        int realdrink = k-free;
        
        if(drink < 0) {
            drink = 0;
        }
        
        int total = (n*food) +(realdrink * drink);

        return total;
    }
}