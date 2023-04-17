package tasks;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;

public class PutString {

    private PutString(){

    }
    public static void putString(String text, int row, int column) {
        Dispatch.call(ScreenEmulator.screen(),"PutString",text,row,column);
    }
}
