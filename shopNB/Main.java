import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        nootbook ASUS = new nootbook("ASUS", 8, 500, "windows", 4500);
        nootbook Lenovo = new nootbook("Lenovo", 4, 250, "windows", 2000);
        nootbook Mac = new nootbook("Mac", 16, 1000, "iOS", 10000);
        nootbook MacBook = new nootbook("MacBook", 8, 500, "iOS", 8500);

        Scanner iScanner = new Scanner(System.in);
        ArrayList<nootbook> NB = new ArrayList<>();
        HashMap<String, Integer> listnum = new HashMap<>();
        NB.add(Lenovo);
        NB.add(ASUS);
        NB.add(Mac);
        NB.add(MacBook);

        while (true) {

            System.out.println("Ввыберите критерий фильтрации:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Обьем жесткого диска");
            System.out.println("3 - Цена");
            System.out.println("=> ");

            String move = iScanner.nextLine();

            if (move.equals("1")) {
                System.out.println("|Фирма || ОЗУ|");
                for (nootbook el : NB) {
                    System.out.println("|" + el.name + "||" + el.RAM + "|");
                }
            }
            if (move.equals("2")) {
                System.out.println("|Фирма || HDD|");
                for (nootbook el : NB) {
                    System.out.println("|" + el.name + "||" + el.HDD + "|");
                }
            }
            if (move.equals("3")) {
                System.out.println("|Фирма || Цена|");
                for (nootbook el : NB) {
                    System.out.println("|" + el.name + "||" + el.prise + "|");
                }
            }
            else System.out.println("Введите корректное значение");
            for (nootbook el : NB) {
                listnum.put("|" + el.name + "|" + el.RAM, el.prise);
            }
            System.out.println("Отсортировать по цене? \n 1-да \n 2-выйти");
            move = iScanner.nextLine();
            if (move.equals("1"))
            listnum.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
            if (move.equals("2")) break;
        }
    }
}
