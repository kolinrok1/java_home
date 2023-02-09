package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class hw5_2 {
    public static void main(String[] args) {
        HashMap <String, Integer> listnum = new HashMap<>();
        String [] ferstList = {"Ivanov", "Petrov", "Sidorov", "Ivanov", "Sidorov", "Ivanov"};
        for (String string : ferstList) {
            Integer count = 0;
            for (String string2 : ferstList) {
                if (string.equals(string2))count++;
            listnum.put(string, count); 
            }
        }
        System.out.println(listnum);
                
        String [] arrfill = {" "};
        Integer max = 0;
        String maxValue = "";
        Integer count = 3;
        while( 0 != count) {
            for (var item : listnum.entrySet()){
                if (max < item.getValue()) max = item.getValue();
                System.out.println(max);   
            }
            count--;
        }

}
}
