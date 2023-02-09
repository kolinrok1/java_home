package hw4;

import java.util.LinkedList;
import java.util.Random;

public class hw4_1 {
    public static void main(String[] args) {
        LinkedList <Integer> ferstList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ferstList.add(random.nextInt(10));
        }
        System.out.println("Исходный List");
        System.out.println(ferstList);
        reversList(ferstList);
    }
    public static void reversList(LinkedList <Integer> ferstList) {
        LinkedList <Integer> secondList = new LinkedList<>();
        int i = ferstList.size()-1;
        while (i != -1) {
            secondList.add(ferstList.get(i));
            i--;
        }
        ferstList = secondList;
        System.out.println("Перевернутый List");
        System.out.println(ferstList);
    }
}
