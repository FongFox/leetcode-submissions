class Solution {
    public boolean isPalindrome(String s) {
        //Solution 1.0: traditonal for loop
        char[] charArr = s.toCharArray();
        int leftPtr = 0;
        int rightPtr = charArr.length - 1;

        while(leftPtr < rightPtr) {
            // Convert it to ascii first
            // Not in (!)
            // (charArr[leftPtr] >= 48 && charArr[leftPtr] <= 57) 
            // || (charArr[leftPtr] >= 65 && charArr[leftPtr] < =90)
            // || (charArr[leftPtr] >= 97 && charArr[leftPtr] <= 122)
            int asciiLeftChar = (int) charArr[leftPtr];
            if(!((asciiLeftChar >= 48 && asciiLeftChar <= 57) || (asciiLeftChar >= 65 && asciiLeftChar <= 90) || (asciiLeftChar >= 97 && asciiLeftChar <= 122))) {
                leftPtr++;
                continue;
            }

            // Convert it to ascii first
            // Not in (!)
            // (charArr[rightPtr] >= 48 && charArr[rightPtr] <= 57) 
            // || (charArr[rightPtr] >= 65 && charArr[rightPtr] < =90)
            // || (charArr[rightPtr] >= 97 && charArr[rightPtr] <= 122)
            int asciiRightChar = (int) charArr[rightPtr];
            if(!((asciiRightChar >= 48 && asciiRightChar <= 57) || (asciiRightChar >= 65 && asciiRightChar <= 90) || (asciiRightChar >= 97 && asciiRightChar <= 122))) {
                rightPtr--;
                continue;
            }

            char leftChar = Character.toLowerCase(charArr[leftPtr]);
            char rightChar = Character.toLowerCase(charArr[rightPtr]);
            if(leftChar != rightChar) {
                return false;
            }

            leftPtr++;
            rightPtr--;
        }

        return true;
    }
}
