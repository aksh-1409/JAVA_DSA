class Day_32_Longest_Substring{

 public static void main(String[] args) {
        String str = "abcabcbb";
        int result = findLongestSubstring(str);
        System.out.println("Longest substring without repeating characters: " + result);
    }

    static int findLongestSubstring(String str) {
        int[] index = new int[256]; 
        for (int i = 0; i < 256; i++)
         index[i] = -1;

        int maxLength = 0;
        int Start = 0;

        for (int End = 0; End < str.length(); End++) {
            char currentChar = str.charAt(End);

            
            if (index[currentChar] >= Start) {
                Start = index[currentChar] + 1;
            }

            index[currentChar] = End;

            int currentLength = End - Start + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
