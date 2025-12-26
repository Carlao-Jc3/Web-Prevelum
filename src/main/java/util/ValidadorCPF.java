package util;

public class ValidadorCPF {

    private ValidadorCPF() {}

    public static boolean validar(String cpf) {
        if (cpf == null) return false;
        return cpf.matches("\\d{11}");
    }
}
