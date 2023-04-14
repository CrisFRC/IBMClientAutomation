package controller;

import com.jacob.com.Dispatch;

public class ScreenEmulator {

    public static Dispatch screen(){

        return SystemEmulator.getIbmSystem5250().getPropertyAsComponent("ActiveSession").getProperty("Screen").toDispatch();
    }

}
