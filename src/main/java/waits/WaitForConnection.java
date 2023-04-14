package waits;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;

public class WaitForConnection {

    public static void waitForConnection(){
        do{
            WaitHostQuiet.waitHostQuiet(1000L);
        }while (Dispatch.call(Dispatch.get(ScreenEmulator.screen(),"OIA")
                .toDispatch(),"ConnectionStatus").getInt() == 3);
    }
}
