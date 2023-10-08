import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        String str = null;
        String[] resSplit = null;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите через пробел ФИО, дату рождения, телефон и пол(f/m)");
            str = scanner.nextLine();
            resSplit = str.split(" ");
            if (chekData(resSplit) == -1) {
                System.out.println("код ошибки: " + chekData(resSplit) + " Вы ввели мало данных");
            } else if (chekData(resSplit) == -2) {
                System.out.println("код ошибки: " + chekData(resSplit) + " Вы ввели много данных");
            } else flag = false;
        }
        String fio = "";
        Integer tel = 0;
        String sex = "";
        String resData = "";
        for (int i = 0; i < resSplit.length; i++) {
            if (flagInt(resSplit[i]) == false && !(resSplit[i].equals("f")) && !(resSplit[i].equals("m")) ) {
                fio += resSplit[i] + ' ';
            }
            if (flagInt(resSplit[i])) {
                try {
                    tel = Integer.parseInt(resSplit[i]);
                } catch (NumberFormatException e) {

                }

            }
            if (resSplit[i].equals("f") || resSplit[i].equals("m") ) {
                sex += resSplit[i];
            }
            if (chekData(resSplit[i])){
                try {
                    resData += resSplit[i];
                } catch (NumberFormatException e) {

                }

            }

        }
        wdata(fio,tel,sex,resData);
    }


    public static Integer chekData(String[] x) {
        if (x.length == 6) {
            return 1;
        } else if (x.length < 6) {
            return -1;
        } else
            return -2;

    }

    public static Boolean flagInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            String[] resSplit2 = str.split( ",");
           if(resSplit2.length == 3){
               return true;
           }
            return false;
        }
    }

    public static boolean chekData (String data){
        String [] chek = data.split(",");
        if (chek.length != 3){
            return false;
        }
        if (Integer.parseInt(chek[0])<0 && Integer.parseInt(chek[1] )> 12) {
            return false;
        }

        return true;
    }
    public static void wdata (String fio, Integer tel, String sex, String resData) throws IOException {
        File myFile = new File(fio + ".txt");
        String wrf = fio + " "+ tel +" "+ sex+" "+ resData;
        FileOutputStream outputStream = new FileOutputStream(myFile);
        byte[] buffer = wrf.getBytes();
        outputStream.write(buffer);
        outputStream.close();
    }
}
