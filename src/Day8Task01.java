public class Day8Task01 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i <= 20000; i++) {
            string = string + i + " ";
        }
        System.out.println(string);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }
}
