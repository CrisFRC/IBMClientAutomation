package tasks;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;
import waits.WaitForSystem;

public class GetString {

    private static short string = 8;

    public GetString(){

    }
    public static String getString(int row, int initialColumn, int length) {
        WaitForSystem.waitForTheSystem();
        return Dispatch.call(ScreenEmulator.screen(),"GetString",row,initialColumn,length).changeType(string).toString();
    }
}
