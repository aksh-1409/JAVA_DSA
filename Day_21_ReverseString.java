class Day_21_ReverseString{

    public static void main(String[] args){
        String str = "#!234ai";

        reverseString(str);      
    }

    static void reverseString(String str){

        if (str == null) {
        System.out.println("Invalid input");
        return;
        }
        
        StringBuilder reverse = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
    }
}