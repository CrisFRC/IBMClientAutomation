package tasks;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import controller.SystemEmulator;

public class CloseEmulator {

    public static void closeEmulator() {
        ActiveXComponent session = SystemEmulator.getIbmSystem5250().getPropertyAsComponent("ActiveSession");
        Dispatch.put(session,"Connected",false);
        ActiveXComponent sessions = SystemEmulator.getIbmSystem5250().getPropertyAsComponent("Sessions");
        Dispatch.call(sessions,"CloseAll");
    }

}
