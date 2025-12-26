package service;

import models.Usuario;

public class LoginService {

    public boolean autenticar(Usuario usuario, String senha) {
        if (usuario == null) return false;
        return usuario.getSenha().equals(senha);
    }
}
