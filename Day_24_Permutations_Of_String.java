class Day_24_Permutations_Of_String {

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length() - 1);
    }

    static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }

        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);       
            permute(str, l + 1, r);         
            str = swap(str, l, i);          
        }
    }

    static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
}
