public class Task3_1 {
    public static void main(String[] args) {
        double[] arr = {1, 5, 10, 10, 0, -10};
        
        double max = arr[0];
        for (double v : arr) if (v > max) max = v;
        
        int count = 0;
        for (double v : arr) if (v == max) count++;
        
        System.out.print("Массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("Максимум: " + max + ", встречается " + count + " раз.");
    }
}
