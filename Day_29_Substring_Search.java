class Day_29_Substring_Search {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        String haystack1 = "interstellar";
        String needle1 = "tert";

        System.out.println("Index: " + strStr(haystack, needle)); 
        System.out.println("Index: " + strStr(haystack1, needle1));
    }

    static int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int neeLen = needle.length();

        if (neeLen == 0)
         return 0;

        for (int i = 0; i <= hayLen - neeLen; i++) {
            int j = 0;
            while (j < neeLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == neeLen) 
            return i; 
        }

        return -1; 
        }
}
