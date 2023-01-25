package fffffff;

public class hw1_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) count++;
            }
            if (count < 3) System.out.println(i);
        }
    }
}
