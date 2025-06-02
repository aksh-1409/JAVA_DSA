class Day_14_Subarray_Sum{

    public static void main(String[] args){
      
       int arr[] = {1, 4, 20, 3, 10, 5};
       int target = 33;


        findSubarray(arr, target);
    }


     static void findSubarray(int[] arr, int target){
        
        if(arr.length == 0){
        System.out.println("Insufficient length");
        return ;
        }
        int start = 0;
        int end = 0;
        int currentsum = 0;
        boolean flag = false;
        while(end<arr.length){
            currentsum += arr[end];
            while(currentsum>target){
                currentsum -= arr[start];
                start++;
            }
            if(currentsum==target){
                flag = true; 
                System.out.print("[ ");  
                for(int i=start; i<=end;i++){
                 System.out.print(arr[i] + " ");
               }
                System.out.print("]");
                return ;
            }
            end++;
            }
            if(!flag)
            System.out.println("No Subarray");

    }
}