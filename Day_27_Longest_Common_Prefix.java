class Day_27_Longest_Common_Prefix{
    public static void main(String[] args){
        String [] str  = {"interstellar", "interst", "inters", "inter", "inte"};
        String result = findLongestCommonPrefix(str);
        System.out.println(result);
    }
    static String findLongestCommonPrefix(String[] str){
        if (str == null || str.length == 0 || str[0].equals("")) {
            return new String("");
        }
         if (str.length == 1) {
            return str[0];
        }
        int count =0;
        for(int i=0;i<Math.min(str[0].length(), str[1].length());i++){
            if(str[0].charAt(i)==str[1].charAt(i))
            count++;
            else break;
        }
         if(count == 0){
            return new String("");
        }
        int k=0;
        for(int i=1;i<str.length-1;i++){
            int j=0;
            while(j<str[i].length() && j<str[i+1].length() && str[i].charAt(j)==str[i+1].charAt(j) && j<count){
                j++;
            }
            k = j;
            count = k;
            if(count == 0){
                return new String("");
            }
            k=0;
        }
        String result = str[0].substring(0, count);
        return result;
    }
}