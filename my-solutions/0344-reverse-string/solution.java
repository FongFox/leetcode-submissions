class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0) {
            return;
        }

        int leftIndex = 0;
        int rightIndex = s.length - 1;
        char temp;
        while(leftIndex < rightIndex) {
            temp = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = temp;

            leftIndex+=1;
            rightIndex-=1;
        }
    }
}
