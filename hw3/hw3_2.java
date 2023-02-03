import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        List <Integer> randnum = new ArrayList<>();
        FillList(randnum);
        System.out.println("Измененный список");
        for (Integer integer : randnum) {
            if (integer % 2 != 0) System.out.print(integer + " ");
        }
    }
    
    public static void FillList( List <Integer> randnum) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randnum.add(random.nextInt(20));
        }
        System.out.println("Изначальный список");
        System.out.println(randnum);
    }
    
}
