import java.util.Random;

public class Day4Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(10000);

        int sum = 0;
        int sumIndex = 0;
        int maxSum = 0;
        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
            if(sum > maxSum) {
                maxSum = sum;
                sumIndex = i;
            }
        }
        System.out.println(maxSum + " : " + sumIndex);
    }
}
