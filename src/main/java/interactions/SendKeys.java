package interactions;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;
import waits.WaitForSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SendKeys {

    private static String key;
    private static Logger logger = Logger.getLogger(SendKeys.class.getName());



    public static void sendKeys(String key){
        try {
            Dispatch.call(ScreenEmulator.screen(), "SendKeys", key);
            WaitForSystem.waitForTheSystem();
        }catch (Exception e){
            logger.log(Level.SEVERE,() -> "ERROR KEY NOT SEND");

        }
    }

}
