import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class hw3_3 {
    public static void main(String[] args) {
        FillList();
    }
    
    public static void FillList() {
        Random random = new Random();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(5));
        }
        System.out.println(list);
        int max = 0;
        int min = 0;
        double count = 0;
        double sum = 0;
        for (Integer integer : list) {
            if (integer > max) max = integer;
            if (integer<min) min = integer;
            sum += integer;
            count++;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum / count);
    }
    }
