package utils;

import java.util.ArrayList;
import java.util.Iterator;

public class GetBinaryNumber {
    public GetBinaryNumber() {
    }

    public static String getBinaryNumber(int numero) {
        ArrayList<String> binarios = new ArrayList();
        StringBuilder binarioString = new StringBuilder();

        do {
            int resto = numero % 2;
            numero /= 2;
            binarios.add(0, Integer.toString(resto));
        } while(numero > 2);

        binarios.add(0, Integer.toString(numero));
        Iterator<String> var4 = binarios.iterator();

        while(var4.hasNext()) {
            String binario = var4.next();
            binarioString.append(binario);
        }

        return binarioString.toString().equals("00") ? "000000" : binarioString.toString();
    }

}
