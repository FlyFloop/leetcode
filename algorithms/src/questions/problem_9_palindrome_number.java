package questions;

public class problem_9_palindrome_number {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));

    }
    static  class Solution {
        public boolean isPalindrome(int x) {
            int xCount = 0;
            int tempX =x;
            int realX = x;
            int tempTimes = 1;
            int palindromeNumber = 0;
            while (tempX>0){
                xCount++;
                tempX /= 10;
            }
            tempTimes = (int) Math.pow(10,xCount-1);
            while (xCount > 0){
               tempX = x % 10;
                palindromeNumber = palindromeNumber + (tempX*tempTimes);
                tempTimes /= 10;
                x = x/10;
                xCount--;
            }

            if (palindromeNumber == realX){
                return  true;
            }else{
                return false;
            }
        }
    }
}


