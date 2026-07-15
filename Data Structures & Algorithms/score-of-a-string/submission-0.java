class Solution {
    public int scoreOfString(String s) {
        int total = 0;

        if(s.length() < 2){
            return 0;
        }

        for(int right = 1; right<s.length(); right++){
            int left = right-1;


            int leftNum = s.charAt(left) - '0';
            int rightNum = s.charAt(right) - '0';

            total += Math.abs(rightNum - leftNum);

        }
        return total;
    }
}