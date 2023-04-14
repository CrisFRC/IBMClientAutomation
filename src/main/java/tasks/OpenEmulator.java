package tasks;

import com.jacob.com.Dispatch;
import controller.SystemEmulator;
import utils.StateOfMyExtraSession;
import waits.WaitForConnection;

public class OpenEmulator {

    public static void openTerminalEmulator(String pathSessionFile){
        SystemEmulator.putSystemIEmulator();
        Dispatch session = SystemEmulator.getIbmSystem5250().getPropertyAsComponent("Sessions"); // exec jacob library
        Dispatch sessionActive = Dispatch.call(session,"Open", pathSessionFile).toDispatch();
        Dispatch.put(sessionActive,"Visible",true);
        WaitForConnection.waitForConnection();
        StateOfMyExtraSession.setStateEmulator(true);




    }

}
