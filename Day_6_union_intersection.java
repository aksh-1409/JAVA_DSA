class Day_6_union_intersection {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4, 5};
        int[] arr2 = {4, 2, 6, 7, 6, 8};


        calUnion(arr1, arr2);
        calIntersection(arr1, arr2);
    }
        public static void calUnion(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int count = 0;
        for(int i = 0;i<arr1.length;i++){
            int j = i+1; 
            while(j<arr1.length){
                if(arr1[i]!=arr1[j]){
                    j++;
                }
                else break;
                }
                if(j == arr1.length){
                    union[count]= arr1[i];
                    count++;
                }
            }
            for(int i=0;i<arr2.length;i++){
                 int j=0;
                while(j<count){
                    if(arr2[i]!=union[j]){
                        j++;
                    }
                    else break;
                } 
                if(j==count){
                    union[count]= arr2[i];
                    count++;
                }
            }
            // Print the union array
            System.out.println("Union: ");
            for(int i=0;i<count;i++){
            System.out.print(union[i]+" ");
        }
        }


        public static void calIntersection(int[] arr1, int[] arr2) {
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int count = 0;
        for(int i = 0; i < arr1.length; i++) {
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]!=arr2[j]){
                    continue;
                }
                else{
                    int k=0;
                    while(k<count){
                        if(arr1[i]!=intersection[k]){
                            k++;
                        }
                        else break;
                    }
                    if(k==count){
                        intersection[count] = arr1[i];
                        count++;
                    }
                }
            }
        }
        // Print the intersection array
        System.out.println("\nIntersection: ");
        for(int i=0;i<count;i++){
            System.out.print(intersection[i]+" ");
        }


}
}