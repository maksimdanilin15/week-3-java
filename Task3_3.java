public class Main {
    public static void main(String[] args) {
        double[] arr = {38.0, 27.0, 43.0, 3.0, 9.0, 82.0, 10.0};
        
        System.out.print("До: [");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        System.out.println("]");
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.print("После: [");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        System.out.println("]");
    }

    public static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { arr[k] = L[i]; i++; }
            else { arr[k] = R[j]; j++; }
            k++;
        }
        while (i < n1) { arr[k] = L[i]; i++; k++; }
        while (j < n2) { arr[k] = R[j]; j++; k++; }
    }
}
