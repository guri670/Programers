class Solution {
    public int[] solution(int money) {
        int coffee = 5500;
        int maxCoffees = money / coffee;
        int remainMoney = money % coffee;
        
        int[] answer = {maxCoffees, remainMoney};
        return answer;
    }
}