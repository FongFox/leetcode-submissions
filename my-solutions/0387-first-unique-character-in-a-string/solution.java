class Solution {
    public int firstUniqChar(String s) {
        // Trường hợp chuỗi rỗng hoặc bằng null
        if (s == null || s.length() == 0) {
            return -1;
        }

        char[] charArray = s.toCharArray();
        // Mảng lưu tần suất xuất hiện của 26 chữ cái tiếng Anh (từ 'a' đến 'z')
        int[] letterCounts = new int[26];

        // Vòng lặp 1: Đếm số lần xuất hiện của từng ký tự
        for (int i = 0; i < charArray.length; i++) {
            // Ánh xạ ký tự về chỉ mục từ 0 đến 25 (Ví dụ: 'a' -> 0, 'b' -> 1)
            int charIndex = charArray[i] - 'a';
            letterCounts[charIndex]++;
        }

        // Vòng lặp 2: Tìm ký tự đầu tiên có tần suất xuất hiện bằng 1
        for (int i = 0; i < charArray.length; i++) {
            int charIndex = charArray[i] - 'a';
            if (letterCounts[charIndex] == 1) {
                return i; // Trả về vị trí đầu tiên tìm thấy trong chuỗi gốc
            }
        }

        // Không tìm thấy ký tự nào độc nhất
        return -1;
    }
}
