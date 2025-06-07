class Day_19_Merge{

    public static void main(String[] args){
    
        int arr1[] = {10, 12, 14, 20, 30};  
        int arr2[] = {1, 2, 3, 5, 8};  

        MergeSortedArrays(arr1, arr2);
    }

    static void MergeSortedArrays(int arr1[], int arr2[]){
        for(int i=0;i<arr1.length;i++){
        
            if(arr1[i]>arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            } 

            int first = arr2[0];
            int k;
            for( k=1;k<arr2.length && first > arr2[k];k++){
                arr2[k-1] = arr2[k];
            }
            arr2[k-1] = first;
        }

    for(int i: arr1)
    System.out.print(i + " ");

    System.out.println();
    
    for(int j: arr2)
    System.out.print(j + " ");
}
}












//     static void MergeSortedArrays(int arr1[], int arr2[]){
//         for(int i=0;i<arr1.length;i++){
//             boolean flag = false;
//             int j=0;
//              while(j<arr2.length){
//                 if(arr1[i]>arr2[j]){
//                     flag =  true;
//                     int temp = arr1[i];
//                     arr1[i] = arr2[j];
//                     arr2[j]= temp;
//                     break;
//                 }
//                 else{
//                 j++;
//                 }
//         }
//         if(flag){
//         for(int k=0;k<arr2.length;k++){
// 	    j=k;
// 	    while(j>0 && arr2[j-1]>arr2[j]){
// 	        int temp= arr2[j-1];
//             arr2[j-1] = arr2[j];
//             arr2[j]= temp;
// 	        j--;
// 	    }
// 	}
//         }
//     }

//     for(int i: arr1)
//     System.out.print(i + " ");

//     System.out.println();
//     for(int j: arr2)
//     System.out.print(j + " ");
// }
// }