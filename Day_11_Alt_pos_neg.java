class Day_11_Alt_Pos_Neg{

    public static void main(String[] args) {
        int[] arr = {-23, 94, -54, -45, 23, 22, 0, -9};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        rearrangeAlternate(arr);

        System.out.println("\nRearranged Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rearrangeAlternate(int[] arr) {
        int n = arr.length; 
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

            for (int i = 0; i < n; i++) {
            if(arr[i] >= 0) {
                pos[p++] = arr[i];
            }else{
                neg[q++] = arr[i];
            }
        }

        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }
 
        while (i < p) {
            arr[k++] = pos[i++];
        }

        while (j < q) {
            arr[k++] = neg[j++];
        }
    }
}
