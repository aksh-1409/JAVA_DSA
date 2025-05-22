import java.util.Scanner;
// This program finds the kth largest and kth smallest elements in an array
class Day_3_Kth {

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

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        findKthLargest_min(array, k);
    }
    static void findKthLargest_min(int[] array, int k) {
        if (k > array.length) {
            System.out.println("k is larger than the size of the array");
            return;
        }
        if (k <= 0) {
            System.out.println("Invalid value of k");
            return;
        }
         for(int i = 0; i < array.length; i++) {     
            int count = 0;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nThe " + k + "th largest element is: " + array[array.length - k]);
        System.out.println("The " + k + "th smallest element is: " + array[k - 1]);
    }
}