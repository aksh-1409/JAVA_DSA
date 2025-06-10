class Day_22_CheckPalindrome{

    public static void main(String[] args){
        String str = "Madam";
;

        isPalindrome(str);      
    }

    static void isPalindrome(String str){

        boolean flag =  false;

        if (str == null) {
        System.out.println("Invalid input");
        return;
        }
        
        str = str.toLowerCase();

        for(int i=0,j=str.length()-1;i<j;i++,j--){
           if(str.charAt(i)==str.charAt(j)){
            flag = true;
           }
           else{
           flag = false;
           break;
        }
        }

        if(flag){
        System.out.println("String is Palindrome");
        }else
        System.out.println("String is not Palindrome");
    }
}