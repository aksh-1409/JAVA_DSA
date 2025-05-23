class DNFP {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort(arr);
    }

    public static void sort(int[] arr) {
        int low = 0, mid = 0, High = arr.length - 1;

        while (mid <= High) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { 
                int temp = arr[mid];
                arr[mid] = arr[High];
                arr[High] = temp;
                High--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
