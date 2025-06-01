class Day_13_Find_Pairs_Sum{

    public static void main(String[] args){
    
    int arr[] = {3, -2, 7, 0, 5, -5, 2, -3, 6, 1};  

    int targetSum = 4;

   findSumPairs(arr,targetSum);
    }

    static void findSumPairs(int [] arr, int target){
       
        if(arr.length<2){
            System.out.println("Not enough elements to form pairs");
            return;
        }
        int sum = target;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
               if((arr[i]+arr[j])==sum){
               System.out.print("("+ arr[i] + ", " + arr[j] + ")");
               System.out.println(); 
               }
            }
        }

    } 
}