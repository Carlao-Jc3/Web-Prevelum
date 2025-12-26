package util;

public class GeradorId {

    private static int contador = 1;

    private GeradorId() {}

    public static int gerar() {
        return contador++;
    }
}
