class Day_28_String_to_Integer{
    public static void main(String[] args){
        String str = "0000123";
        String str1 = "91283472332";
        String str2 = "words and 987";

       System.out.println(stringToInteger(str)); 
       System.out.println(stringToInteger(str1));
       System.out.println(stringToInteger(str2));

    }
    static int stringToInteger(String str) {
    int i = 0, sign = 1, result = 0;
    int n = str.length();

    while (i < n && str.charAt(i) == ' ') {
        i++;
    }
    if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
        sign = (str.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    while (i < n && Character.isDigit(str.charAt(i))) {
        int digit = str.charAt(i) - '0';

        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        i++;
    }
    return result * sign;
}
}