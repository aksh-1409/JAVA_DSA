class Day_15_Missing_Number{

    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 1, 3, 8, 9, 10};

        findMissingNumber(arr);
    }

    public static void findMissingNumber(int [] arr){
        
        if(arr == null || arr.length==0){
            System.out.println("Invalid Input: Array is empty or null");
            return;
        }
        
        int size = arr.length + 1;

        int actualSum = (size*(size+1))/2;

        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        int missingNumber = actualSum - sum;

        System.out.println("Missing Number: " + missingNumber);


    }
}