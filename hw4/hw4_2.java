package hw4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class hw4_2 {
    public static void main(String[] args) {
        LinkedList <Integer> ferstList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            ferstList.add(random.nextInt(5));
        }
        System.out.println("Исходный List");
        System.out.println(ferstList);
        enq(ferstList);
        denq(ferstList);
        fer(ferstList);
    }
    public static void enq(LinkedList <Integer> ferstList) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число(enqueue()): ");
        Integer num = iScanner.nextInt();
        ferstList.addLast(num);
        iScanner.close();
        System.out.println(ferstList);
    }
    public static void denq(LinkedList <Integer> ferstList) {
        System.out.println("denqueue(): ");
        System.out.println(ferstList.get(0));
        ferstList.remove(0);
        //System.out.println(ferstList);
    }
    public static void fer(LinkedList <Integer> ferstList) {
        System.out.println("denqueue(): ");
        System.out.println(ferstList.get(0));
    }
    
}
