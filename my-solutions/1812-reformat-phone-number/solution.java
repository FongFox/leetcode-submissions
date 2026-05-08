class Solution {
    public String reformatNumber(String number) {
        if(number.length() < 2) {
            return number;
        }

        String numberFormatted = number.replaceAll("[^0-9]", "");
        System.out.println(">>> Test number: " + numberFormatted);

        List<String> groups = new ArrayList<>();
        int i = 0;
        int len = numberFormatted.length();
        int numRemain = 0;
        while(i < len) {
            numRemain = len - i;
            if(numRemain > 4) {
                groups.add(numberFormatted.substring(i, i+3));
                i+=3;
            } else {
                numRemain = len - i;
                break;
            }
        }

        System.out.println(">>>Test List: " + groups);
        // System.out.println(">>>Test num remain: " + numRemain);
        System.out.println(">>>Test index: " + i);

        if(numRemain == 4) {
            while(i != len) {
                groups.add(numberFormatted.substring(i, i+2));
                i += 2;
            }
        }
        if(numRemain == 3) {
            groups.add(numberFormatted.substring(i, i+3));
        }
        if(numRemain == 2) {
            groups.add(numberFormatted.substring(i, i+2));
        }
        if(numRemain == 1) {
            groups.add(numberFormatted.substring(i));
        }

        System.out.println(">>>Test List: " + groups);

        return String.join("-", groups);
    }
}
