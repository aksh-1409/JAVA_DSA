class Day_9_Sorted_rotate{

       public static void main(String[] args) {

        int arr[] = {4,5,6,7,0,1,2};
        
        isSortedAndRotated(arr);
        
        
    }


       static void isSortedAndRotated(int [] arr){

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                count++;
            }
        }

        if(count ==1){
            System.out.println("Array is sorted and rotated");
        }
        else{
            System.out.println("Array is not sorted and rotated");
        }
    }
}