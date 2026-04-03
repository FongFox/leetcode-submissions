class Solution {
    public boolean isPalindrome(String s) {
        char[] temp = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();

        if(temp.equals("")) {
            return true;
        }

        int leftIndex = 0;
        int rightIndex = temp.length - 1;

        while(leftIndex < rightIndex) {
            if(temp[leftIndex] != temp[rightIndex]) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
