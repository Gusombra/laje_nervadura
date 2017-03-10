package com.gsvslhotmail.laje_nervurada;


class TabelasdeCoeficientes {

    private static double [][] coeficientes =
            {{1.0,  4.23,   4.23,   2.5,    2.5},
            {1.05,  4.62,   4.25,   2.62,   2.5},
            {1.1,   5.0,    4.27,   2.73,   2.5},
            {1.15,  5.38,   4.25,   2.83,   2.5},
            {1.2,   5.75,   4.22,   2.92,   2.5},
            {1.25,  6.1,    4.17,   3.0,    2.5},
            {1.3,   6.44,   6.12,   3.08,   2.5},
            {1.35,  6.77,   4.06,   3.15,   2.5},
            {1.4,   7.1,    4.0,    3.21,   2.5},
            {1.45,  7.41,   3.95,   3.28,   2.5},
            {1.5,   7.72,   3.89,   3.33,   2.5},
            {1.55,  7.99,   2.82,   3.39,   2.5}};

    /**
     * Recebe um valor lambda e retorna a linha contendo os coeficientes correspondentes
     * @param lambda valor lambda
     * @return vetor de doubles contendo os coeficientes
     */
    static double[] getCoeficientes(double lambda){
        System.out.println("Tamanho: " + coeficientes.length);
        for(int i = 0; i < coeficientes.length; i++){
            if(coeficientes[i][0] > lambda){
                return coeficientes[i];
            }
        }
        return null;
    }
}

