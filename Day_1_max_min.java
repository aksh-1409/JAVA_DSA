import java.util.Scanner;
class Day_1_max_min {
   public static void main(String[] args) {
         int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array is empty");
            return;
        }
        array = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        findMaxMin(array);
    }

        static void findMaxMin(int[] array) {
            int max = array[0];
            int min = array[0];

         for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}