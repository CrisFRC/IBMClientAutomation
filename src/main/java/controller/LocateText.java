package controller;

import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import utils.GetBinaryNumber;

public class LocateText {

    private static short string = 8;

    private LocateText(){

    }
    public static String locateText(String tag){
        if(ScreenEmulator.screen() == null){
            return "1/1/1";
        }else{
            Variant zona = Dispatch.call(ScreenEmulator.screen(),"Search",tag);
            int finalCol = Dispatch.get(zona.toDispatch(),"Right").getInt();
            int initCol = Dispatch.get(zona.toDispatch(),"Left").getInt();
            int length = finalCol-initCol;
            int fila;
            for(fila = Dispatch.get(zona.toDispatch(), "Top").getInt(); "1".equals(GetBinaryNumber.getBinaryNumber(Integer.parseInt(Dispatch.call(ScreenEmulator.screen(), "FieldAttribute", fila, finalCol).changeType(string).getString())).substring(2, 3)); ++finalCol) {
            }
            return fila +"/"+initCol+"/"+(finalCol+1)+"/"+(length+1);



        }
    }

}
