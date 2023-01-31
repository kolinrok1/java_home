import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class calc {
    
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(calc.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        boolean flag = true;
        while (flag != false) {
            int num_a = input();
            int num_b = input();
            String muve = inmove();
            char charMuve = muve.charAt(0);
            logger.log(Level.INFO, "LOG: " + num_a + " "+ charMuve + " " + num_b);
            switch (charMuve) {
                case '*':
                    System.out.println(num_a * num_b);
                    break;
                case '+':
                    System.out.println(num_a + num_b);
                    break;
                case '-':
                    System.out.println(num_a - num_b);
                    break;
                case '/':
                    if (num_b != 0) System.out.println(num_a / num_b);
                    break;
            }
            flag = exit();
            }
            
        }
    public static int input() {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.println("Введите число: ");
        int a = iScanner.nextInt();
        //iScanner.close();
        return a;
    }
    public static String inmove() {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.println("Введите математическое действие: ");
        String a = iScanner.next();
        //iScanner.close();
        return a;
    }  
    public static boolean exit() {
        String stop = "n";
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.println("Запустить снова y/n: ");
        String a = iScanner.next();
        //iScanner.close();
        return !a.equals(stop) ;
                 
           
    }
}



