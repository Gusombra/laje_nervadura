package com.gsvslhotmail.laje_nervurada;

/**
 * Created by Usuário on 01/03/2017.
 */

public class TabelasdeCoeficientes {

    public double arredondar(double lambda) {
        String s = "" + lambda;

        String split[] = new String[s.length()];
        split = s.split("");

        if (split.length == 3)
            return lambda;
        Double resultado = Double.parseDouble(split[0]);
        Double aux1 = Double.parseDouble(split[2]);
        Double aux2 = Double.parseDouble(split[3]);
        if (aux2 > 5) {
            aux1++;
            aux2 = 0.0;
        } else if (aux2 < 5)
            aux2 = 5.0;
        resultado = resultado + (aux1 / 10) + (aux2 / 100);
        return resultado;
    }
}

