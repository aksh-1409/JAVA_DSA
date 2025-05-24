class Day_5_neg_pos{

    public static void main(String[] args) {
        int[] arr = {-23, 12, 0, -1, 2, 0, -34, 45, 0};
        rearrangeNegPos(arr);
    }

    public static void rearrangeNegPos(int[] arr) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            if (arr[low] < 0) {
                low++;
            }
            else if (arr[high] >= 0) {
                high--;
            }
            else if (arr[low] >= 0 && arr[high] < 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}                                                              