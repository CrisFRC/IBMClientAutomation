package interactions;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;
import waits.WaitForSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SendKeys {

    private String key;
    private Logger logger = Logger.getLogger(SendKeys.class.getName());

    public SendKeys(String key){
        this.key = key;
    }

    public void sendKeys(){
        try {
            Dispatch.call(ScreenEmulator.screen(), "SendKeys", key);
            WaitForSystem.waitForTheSystem();
        }catch (Exception e){
            logger.log(Level.SEVERE,() -> "ERROR KEY NOT SEND");

        }
    }

}
