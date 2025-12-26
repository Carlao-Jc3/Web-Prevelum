package util;

public class GeradorID {

    private static int contador = 1;

    private GeradorID() {}

    public static int gerar() {
        return contador++;
    }
}
