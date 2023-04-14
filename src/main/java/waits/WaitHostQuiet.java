package waits;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;


public class WaitHostQuiet {

    private static short bool =11;

    private WaitHostQuiet() {
    }
    public static void waitHostQuiet(long time){
        Dispatch.call(ScreenEmulator.screen(),"WaitHostQuiet",time)
                .changeType(bool).getBoolean();
    }


}
