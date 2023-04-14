package controller;

import com.jacob.activeX.ActiveXComponent;

public class SystemEmulator {
    private static ActiveXComponent ibmSystem5250;

    public static void putSystemIbmAccessClient(){
        ibmSystem5250 = new ActiveXComponent("PCOMM.autECLSession");
    }
    public static ActiveXComponent getIbmSystem5250(){
        return ibmSystem5250;
    }


}
