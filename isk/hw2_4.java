import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        String str = null;
        System.out.println("Введите значение");
        while (flag){
            try {

                Scanner scanner = new Scanner(System.in);
                str = scanner.nextLine();
                if (str.length() == 0) {
                    throw new Exception();
                }
                flag = false;
            } catch (Exception e){
                System.out.println("Пустую строку вводить нельзя, введите значение");
            }
        }
    }

    }
