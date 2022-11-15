package questions;
/*
Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false
 */
public class problem_20_valid_parentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"

        ));
    }
   static class Solution {
        boolean result = true;
       public boolean isValid(String s) {
           for (int i = 0; i < s.length(); i+=2) {
               if (i == s.length() - 1){
                  result = checkParentheses(s.charAt(i-1),s.charAt(i));
                  return result;
               }
              result = checkParentheses(s.charAt(i),s.charAt(i+1));
              if (result == false){
                  return false;
              }
           }
           return result;
       }
   }
   static public boolean checkParentheses(Character character,Character nextCharacter){
       if (character == '('){
           if (nextCharacter == ')'){
               return true;
           }
           return false;
       }
       if (character == '{'){
           if (nextCharacter == '}'){
               return true;
           }
           return false;
       }
       if (character == '['){
           if (nextCharacter == ']'){
               return true;
           }
           return false;
       }
       return false;
   }
}
