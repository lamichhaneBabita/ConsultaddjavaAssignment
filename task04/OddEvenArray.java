package task04;

public class OddEvenArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println("Even Numbers: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers: ");
        for (int i =0; i<arr.length;i++){
            if (arr[i]%2 !=0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}