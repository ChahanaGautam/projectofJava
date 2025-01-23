public class Customsort {
        public static void main(String[] args) {
            // Initialize an array
            int[] array = {64, 34, 25, 12, 22, 11, 90};

            // Print the original array
            System.out.println("Original Array:");
            printArray(array);

            // Sort the array using Bubble Sort
            bubbleSort(array);

            // Print the sorted array
            System.out.println("Sorted Array:");
            printArray(array);
        }

        // Bubble sort algorithm
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        // Utility method to print the array
        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

