import java.util.Scanner;

class Day_2_reverse_array{

    public static void main(String[] args){
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

        reverseArray(array);   
    }

    static void reverseArray(int[] array) {
        for (int start = 0, end = array.length-1 ; start<end; start++, end--) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];  
            array[end] = temp;
        }

        System.out.println("Reversed Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}