class Day_16_Duplicate {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 3, 6, 1, 4, 7, 8, 9, 6, 2};  
        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

           
            boolean isDuplicatePresent = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicatePresent = true;
                    break;
                }
            }

            if (isDuplicatePresent) continue;

           
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; 
                }
            }
        }
    }
}
