import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day4Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(10);
            System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        int more8 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 8){
                more8++;
            }
        }
        System.out.println(more8);

        int equal1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                equal1++;
            }
        }
        System.out.println(equal1);

        int even = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
        }
        System.out.println(even);

        int odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                odd++;
            }
        }
        System.out.println(odd);

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}