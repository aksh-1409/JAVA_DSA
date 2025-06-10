class Day_22_CheckPalindrome{

    public static void main(String[] args){
        String str = "Madam";
;

        isPalindrome(str);      
    }

    static void isPalindrome(String str){


        if (str == null || str.isEmpty()) {
        System.out.println("Invalid input");
        return;
        }
        
        str = str.toLowerCase();

        for(int i=0,j=str.length()-1;i<j;i++,j--){
           if(str.charAt(i)!=str.charAt(j)){
            System.out.println("String is not Palindrome");
            return ;
           }
        }
        System.out.println("String is Palindrome");
    }
}