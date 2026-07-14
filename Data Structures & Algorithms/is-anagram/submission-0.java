class Solution {
    public boolean isAnagram(String s, String t) {

        // if the lengths are different they cannot be anagrams
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];


        // counting the characters is s and reomve counts using t
        for(int i = 0; i< s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // if any count is not zero, they are not anagrams

        for(int num : count){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
