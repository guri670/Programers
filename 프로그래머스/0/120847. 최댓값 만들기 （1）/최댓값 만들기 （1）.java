class Solution {
    public int solution(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("배열의 길이는 2 이상이어야 합니다.");
        }


        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 

        for (int number : numbers) {
            if (number > max1) {
                max2 = max1; 
                max1 = number; 
            } else if (number > max2) {
                max2 = number; 
            }
        }
        return max1 * max2;
    }
}