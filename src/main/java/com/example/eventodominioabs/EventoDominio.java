package com.example.eventodominioabs;

public abstract class EventoDominio {

    private final long data;

    public EventoDominio() {
        this.data = System.currentTimeMillis();
    }



    public long obterData() {
        return data;
    }

    public abstract String obterDetalhesEvento();
}