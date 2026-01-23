class QuickSort {

    // Function to partition the array
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];   // choose last element as pivot
        int i = low - 1;         // index of smaller element

        for (int j = low; j < high; j++) {
            // if current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // return pivot index
    }

    // QuickSort function
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}