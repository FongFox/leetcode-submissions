class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        char[] sArray = s.toCharArray();
        int n = sArray.length;
        for(int i = 0; i < n; i++) {
            hashMapS.put(sArray[i], hashMapS.getOrDefault(sArray[i], 0) + 1);
        }

        char[] tArray = t.toCharArray();
        int k = tArray.length;
        for(int i = 0; i < k; i++) {
            hashMapT.put(tArray[i], hashMapT.getOrDefault(tArray[i], 0) + 1);
        }

        for(Character c : hashMapS.keySet()) {
            if(!hashMapS.get(c).equals(hashMapT.get(c))) {
                return false;
            }
        }

        return true;
    }
}
