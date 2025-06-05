class Day_17_Intersection{

    public static void main(String[] args){
       
        int arr[] = {2, 2, 3, 3, 4, 5, 6, 6, 6, 7, 8,};
        int arr1[] = {1, 2, 3, 3, 4, 4, 6, 8, 9};
         
        findIntersection(arr, arr1);
    }

    static void findIntersection(int [] arr, int [] arr1){
        
        boolean flag = false;
        int isDuplicatePresent = Integer.MIN_VALUE;

        int i=0;
        int j=0;
        
        while(i<arr.length && j<arr1.length){
            boolean isDuplicateIntersection = false;
            if(arr[i]<arr1[j]){
            i++;
            continue;
            }
            else if(arr1[j]<arr[i]){
            j++;
            continue;
            }
            else{
            flag = true;
            if(arr[i]!=isDuplicatePresent){
                isDuplicatePresent = arr[i];
                System.out.println(arr[i]);
            }
            i++;
            j++;
            }
           

            
        }

        if(!flag)
        System.out.println("No Intersection");
    }
}









    //     boolean flag = false;

    //     int i=0;
    //     int j=0;
        
    //     while(i<arr.length && j<arr1.length){
    //         boolean isDuplicateIntersection = false;
    //         if(arr[i]<arr1[j]){
    //         i++;
    //         continue;
    //         }
    //         else if(arr1[j]<arr[i]){
    //         j++;
    //         continue;
    //         }
    //         else{
    //         flag = true;
    //         for(int k=0;k<i;k++){
    //             if(arr[i]==arr[k]){
    //                 isDuplicateIntersection = true;
    //                 break;
    //             }
    //         }
    //         }
    //         if(isDuplicateIntersection){
    //         i++;
    //         j++;
    //         continue;
    //         }

    //         if(!isDuplicateIntersection){
    //         System.out.println(arr[i]);
    //         i++;
    //         j++;
    //         }
            
    //     }

    //     if(!flag)
    //     System.out.println("No Intersection");
    // }























        // boolean flag = false;
        // for(int i=0;i<arr.length;i++){
        //     boolean intersection = false;
        //     boolean isDuplicateIntersection = false;
        //     for(int j=0;j<arr1.length;j++){
        //         if(arr[i]==arr1[j]){
        //             flag = true;
        //             intersection = true;
        //             break;
        //         }
        //     }

        //    if(intersection){
        //      for(int k=0;k<i;k++){
        //         if(arr[i]==arr[k]){
        //             isDuplicateIntersection = true;
        //             break;
        //         }
        //     }
        //     }

        //     if(isDuplicateIntersection)
        //     continue;

        //     if(intersection){
        //     System.out.println(arr[i]);
        //     }
        // }

        // if(!flag)
        // System.out.println("No Intersection");
    //}
