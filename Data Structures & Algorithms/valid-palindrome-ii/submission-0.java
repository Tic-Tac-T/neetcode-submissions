class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();

        int low = 0;
        int high = n-1;
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                String str = s.substring(low+1,high+1);
                String str2 = s.substring(low,high);
                if(isPalindrome(str) == false && isPalindrome(str2) == false){
                    return false;
                }else{
                    return true;
                }
            }
            high--;
            low++;
        }
        return true;
    }

    private boolean isPalindrome(String str){
        int low = 0;
        int high = str.length()-1;

        while(low<high){
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}