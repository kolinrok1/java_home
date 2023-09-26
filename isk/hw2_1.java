import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        float x =0;
        System.out.println("Введите тип ");
        while (flag){
            try {

                Scanner scanner = new Scanner(System.in);
                x = Float.parseFloat(scanner.nextLine());
                System.out.println(x);
                flag = false;
            } catch (Exception e){
                System.out.println("Введите тип float");
            }
        }
    }
}
