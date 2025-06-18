class Day_30_Valid_Palindrome{
   
    public static void main(String[] args) {
        String s = "abca";
        String s1 = "intbcni";
        System.out.println(validPalindrome(s));
         System.out.println(validPalindrome(s1));  
        }

    static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
        
        return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            
        }
            left++;
            right--;
        }
        return true;
    }

        static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
