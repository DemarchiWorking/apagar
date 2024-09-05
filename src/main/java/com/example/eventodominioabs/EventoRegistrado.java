package com.example.eventodominioabs;

public class EventoRegistrado extends EventoDominio {
    private final String userId;
    private final String email;
    public EventoRegistrado(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }
    public String getUsuarioId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String obterDetalhesEvento() {
        return "Usuario registrado: " + userId + " email: " + email;
    }
}

