class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0) {
            return -1;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        char[] charArr = s.toCharArray();
        for(char c : charArr) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for(int i=0; i<charArr.length; i++) {
            if(hm.get(charArr[i]) == 1) {
                return i;
            }
        }


        return -1;
    }
}
