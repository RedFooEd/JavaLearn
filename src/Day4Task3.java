import java.util.Random;

public class Day4Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = rand.nextInt(50);
            }
        }
        int maxSum = 0;
        int sum = 0;
        int sumIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                sumIndex = i;
            }
        }
        System.out.println(sumIndex);
    }
}
