package waits;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;

public class WaitForSystem {

    private final static short bool = 11;

    private WaitForSystem(){

    }
    public static void waitForTheSystem() {
        while(Dispatch.call(ScreenEmulator.screen(), "Updated").changeType(bool).getBoolean()) {
            WaitHostQuiet.waitHostQuiet(1L);
        }
    }
}
