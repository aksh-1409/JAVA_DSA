class Day_31_Compress_String {
    public static void main(String[] args) {
        char[] input1 = {'a','a','b','b','c','c','c'};
        char[] input2 = {'a'};
        int newLen1 = compress(input1);
        System.out.println(newLen1);
        printCompressed(input1, newLen1);
        int newLen2 = compress(input2);
        System.out.println(newLen2);
        printCompressed(input2, newLen2);
    }
    static int compress(char[] chars){
        int index = 0; 
        int i = 0;     
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            chars[index++] = currentChar;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
    static void printCompressed(char[] chars, int length) {
        System.out.print("Compressed Output: ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}
