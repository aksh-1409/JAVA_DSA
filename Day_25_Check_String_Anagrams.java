class Day_25_Check_String_Anagrams{

    public static void main(String[] args){
        String str1 = "conversation";
        String str2 = "voices rant on";
        boolean answer = checkAnagrams(str1, str2);
        if(answer) 
        System.out.println("Strings are anagrams");
        else 
        System.out.println("Strings are not anagrams");
    }
    public static boolean checkAnagrams(String str1, String str2){
        str1 = str1.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
        int[] str1Count = new int[26];
        int[] str2Count = new int[26];
        if(str1.length() != str2.length()) return false;

        for(int i=0; i<str1.length(); i++){
            int str1index = str1.charAt(i) - 'a';
            str1Count[str1index]++;
            int str2index = str2.charAt(i) - 'a';
            str2Count[str2index]++;
        }
        

        for(int k=0; k<str1Count.length; k++){
            if(str1Count[k] != str2Count[k]){
                return false;
            }
        }

        return true;
    }
    
}