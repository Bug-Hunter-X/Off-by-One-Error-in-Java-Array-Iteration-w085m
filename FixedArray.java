public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; 
        }
        System.out.println(arr[4]); //This line will now print 8 correctly
    }
}