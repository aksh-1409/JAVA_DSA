class Day_23_RemoveDuplicateString{

    public static void main(String[] args){

        String str = "Programming";

        removeDuplicate(str);
    }

    static void removeDuplicate(String str){
        
       
        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++){
           
          String x = str.substring(0, i);

            if(!x.toLowerCase().contains(String.valueOf(str.charAt(i)).toLowerCase())){
                result.append(str.charAt(i));
            }
        }
    System.out.println(result);
    }
}