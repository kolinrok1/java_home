import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.*;

public class HW2_2 {
    
    public static void main(String[] args) {
        int [] arr = {8, 3, 1, 6, 6, 7, 4, 2, 9 ,10};
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                
                }
                log(arr);
            }
        }
    }
    
    public static void log(int [] arr) { 
        Path logTxt = Paths.get("log_arr.txt");
        String str = "";
        for (int i = 0; i < arr.length - 1; i++) {
            str+=(arr[i]);
        }
        str += "\n";
        try{
            Files.write(logTxt, str.getBytes(), StandardOpenOption.APPEND);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
