class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) {
            return false;
        }

        char[] temp = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = temp.length - 1;

        while(leftIndex < rightIndex) {
            // !(temp[leftIndex] >= 48 && temp[leftIndex] <= 57) || 
            // !(temp[leftIndex] >= 65 && temp[leftIndex] <= 90) || 
            // !(temp[leftIndex] >= 97 && temp[leftIndex] <= 122)
            if (!((temp[leftIndex] >= 48 && temp[leftIndex] <= 57) || (temp[leftIndex] >= 65 && temp[leftIndex] <= 90) || (temp[leftIndex] >= 97 && temp[leftIndex] <= 122))) {
                leftIndex += 1;
                continue;
            }

            // also for rightIndex
            // !(temp[rightIndex] >= 48 && temp[rightIndex] <= 57) || 
            // !(temp[rightIndex] >= 65 && temp[rightIndex] <= 90) || 
            // !(temp[rightIndex] >= 97 && temp[rightIndex] <= 122)
            if (!((temp[rightIndex] >= 48 && temp[rightIndex] <= 57) || (temp[rightIndex] >= 65 && temp[rightIndex] <= 90) || (temp[rightIndex] >= 97 && temp[rightIndex] <= 122))) {
                rightIndex -= 1;
                continue;
            }

            if(Character.toLowerCase(temp[leftIndex]) != Character.toLowerCase(temp[rightIndex])) {
                return false;
            }

            leftIndex += 1;
            rightIndex -= 1;
        }

        return true;
    }
}
