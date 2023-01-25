package fffffff;

import java.util.Scanner;

public class hw1_1 {
    public static void main(String[] args) {
        int j = 0;
        int fact = 1;
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.println("Ввежите число a: ");
        int num = iScanner.nextInt(); 
        iScanner.close();  
        for (int i = 1; i< num+1; i++){ 
            j = j + i;
            fact = fact * i;
        }
        System.out.print("сумма чисел от 1 до "+  num + ": ");
        System.out.println(j);
        System.out.print("факториал числа "+  num + ": ");
        System.out.println(fact);
        }      
}

