public class Day8Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }
}
