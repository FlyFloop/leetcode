package questions;

public class problem_13_roman_to_integer {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("LVIII"));
    }
    /*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
     */
    static class Solution {
        public int romanToInt(String s) {
            int summary = 0;
            if (s.length() > 15 && s.length() < 1){
                System.out.println("String must be less than 15 char and higher than 1");
                System.exit(0);
            }
            for (int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                switch (letter){
                    case 'I':
                        summary += 1;
                    break;
                    case 'V':
                        summary += 5;
                    break;
                    case 'X':
                        summary += 10;
                    break;
                    case 'L':
                        summary += 50;
                    break;
                    case 'C':
                        summary += 100;
                    break;
                    case 'D':
                        summary += 500;
                    break;
                    case 'M':
                        summary += 1000;
                    break;
                    default:
                        System.out.println("unvalid char");
                        System.exit(0);
                }
            }
            if (!(summary >= 1 && summary <= 3999)){
                return 0;
            }
            return summary;
        }
    }
}
