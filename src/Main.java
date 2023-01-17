public class Main {

    static int [] arr = new int[15];
    public static void main(String[] args) {
        ArrayUtils.arrayInit(arr);
        ArrayUtils.arrayOut(arr);
        System.out.println("Sum of positive number = " + sum(arr));

    }
    public static int sum(int[] arr){
        int result = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > 0) {
                result = result + arr[i];
            } else
                result = result + 0;
        }
        return result;
    }
}