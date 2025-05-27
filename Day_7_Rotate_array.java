    class Day_7_Rotate_array {

        public static void main(String[] args) {
          int [] arr = {1, 2, 3, 4, 5};
            System.out.println("Original Array: ");
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();

          rotateArray(arr);
        }


        static void rotateArray(int[] arr){
            int n= arr.length;
            int temp=arr[n-1];

            for(int i = n-1; i>=0;i--){
                if(i>0){
                    arr[i]= arr[i-1];
                }
                else{
                    arr[i]=temp;
                }
            }

            
            System.out.println("Rotated Array: ");
            for(int val: arr){
                System.out.print(val+" ");
            }

        }
    }