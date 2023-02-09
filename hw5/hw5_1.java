package HW5;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class hw5_1 {
    public static void main(String[] args) {
        Map<String, String> tekBD = new HashMap<>();
        while (true) {
        System.out.print("Выбериет действие: \n 1 - добавитьновую запись \n 2 - вывести телефонную книгу \n:");
        Scanner iScanner = new Scanner(System.in);
        String move = iScanner.nextLine();
        if (move.equals("1"))addTel(tekBD);
        if (move.equals("2"))System.out.println(tekBD);
        else System.out.println("Введите корректную команду"); 
    }
}
    public static void addTel(Map<String, String> tekBD) {
        boolean flag = true;
        while (flag) {
            boolean flag2= true;
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите ФИО");
            String FIO = iScanner.nextLine();
            while (flag2) {
                System.out.println("Введите телефон");
                String tel = iScanner.nextLine();
                if (!tekBD.containsKey(tel)) tekBD.put(tel, FIO);
                else System.out.println("Данный номер есть в базе " + tekBD.get(tel));
                System.out.println("Добавить еще номер к данному человеку? (n/y): ");
                String swit = iScanner.nextLine();
                if (swit.equals("n")) flag2 = false;
                        }
            System.out.println("Добавить еще запись в телефонную книгу?(n/y): ");
            String swit = iScanner.nextLine();
            if (swit.equals("n")) flag = false;
        }
    }
}
