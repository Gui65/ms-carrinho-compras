package br.com.fiap.carrinhodecompras.utils.enums;

import lombok.Getter;

@Getter
public enum UsuarioRole {
    ADMIN("admin"),
    USER("user");

    private final String role;

    UsuarioRole(String role){
        this.role = role;
    }
}