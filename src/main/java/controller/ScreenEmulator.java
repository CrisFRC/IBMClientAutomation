package controller;

import com.jacob.com.Dispatch;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ScreenEmulator {

    static Logger logger = Logger.getLogger(ScreenEmulator.class.getName());

    private ScreenEmulator(){

    }

    public static Dispatch screen(){
        try{
            return SystemEmulator.getIbmSystem5250().getPropertyAsComponent("ActiveSession").getProperty("Screen").toDispatch();
        }catch (Exception e){
            logger.log(Level.SEVERE,()->"ERROR SCREEN NOT EXEC");
            return null;
        }

    }

}
