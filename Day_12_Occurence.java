class Day_12_Occurence{
    public static void main(String[] args){
        int arr[] = {12, 45, 45, 32, 56, 78, 45, 89, 10, 45, 23, 45};

        int target = 45;
        int occur = findOccurence(target, arr);
        System.out.println("Occurence of " + target + " is " + occur);
    }


   public static int findOccurence(int target , int[] arr){
        
        int occur =0;
        for(int i:arr){
            if(i==target){
                occur++;
            }
        }
        return occur;
    }
}