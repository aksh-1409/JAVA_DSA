class Day_20_MaxProductSubArray{

    public static void main(String[] args){
        int arr[] = {1, -2, -3, 0, 7, -8, -2, 0, -1, -3,
         -10, 0, 2, -2, -2, -2, -2, 2};
        findMaxProductSubarray(arr);
    }
     static void findMaxProductSubarray(int [] arr){
        int currentProduct = 1;
        int MaxProduct = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentProduct *= arr[i];
             if( MaxProduct < currentProduct){
                MaxProduct = currentProduct;
            }

            if(currentProduct == 0){
                currentProduct = 1;
            }
        }
        currentProduct = 1;
        for(int i = arr.length -1;i>=0;i--){
            currentProduct *= arr[i];
            
             if( MaxProduct < currentProduct){
                MaxProduct = currentProduct;
            }

            if(currentProduct == 0){
                currentProduct = 1;
            }
        }

        System.out.println("Maximum Product SubArray: " + MaxProduct);
    }
}