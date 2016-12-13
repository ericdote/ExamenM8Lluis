package test;


import java.util.Random;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class Test {

    public int[] llistaPreguntes(int tema) {
        Random rnd = new Random();
        String pregunta ="";
        int numero, numero2;
        int[] numeros = new int[2];
        switch (tema) {
            case 1:
                numero = (rnd.nextInt((100 - 0) + 100));
                numero2 = (rnd.nextInt((100 - 0) + 100));
                numeros[0] = numero;
                numeros[1] = numero2;
                break;
            case 2:
                numero = (rnd.nextInt((100 - 0) + 100));
                numero2 = (rnd.nextInt((100 - 0) + 100));
                numeros[0] = numero;
                numeros[1] = numero2;
                break;
            case 3:
                numero = (rnd.nextInt((100 - 0) + 100));
                numero2 = (rnd.nextInt((100 - 0) + 100));
                numeros[0] = numero;
                numeros[1] = numero2;
                break;
            case 4:
                numero = (rnd.nextInt((100 - 0) + 100));
                numero2 = (rnd.nextInt((100 - 0) + 100));
                numeros[0] = numero;
                numeros[1] = numero2;
                break;
        }
        return numeros;
    }


}
