class Solution {
    public int lengthOfLastWord(String n) {
        n = n.trim();
        
        int length = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}