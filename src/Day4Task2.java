import java.util.Random;

public class Day4Task2 {
    public static void main(String[] args) {
        int [] arr = new int [100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(1000);
        }
        max = 0;
        for(int i:arr) {
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);

        min = 1000;
        for(int i:arr) {
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);

        int count = 0;
        for(int i:arr) {
            if(i % 10 == 0){
                count++;
            }
        }
        System.out.println(count);

        int sum = 0;
        for(int i:arr) {
            if(i % 10 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}