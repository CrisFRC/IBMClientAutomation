package interactions;

import com.jacob.com.Dispatch;
import controller.ScreenEmulator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LocatingIn {

    private static Logger logger;

    public static void doLocatingIn(int starRow, int startCol, int endRow, int endCol){
        try {
            Dispatch.call(ScreenEmulator.screen(), "Select", starRow, starRow, endRow, endCol);
        }catch (Exception e){
            logger.log(Level.SEVERE,()->"CAN NOT LOCATE OBJECT");
        }
    }


}
