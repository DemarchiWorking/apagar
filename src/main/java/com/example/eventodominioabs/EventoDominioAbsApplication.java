package com.example.eventodominioabs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EventoDominioAbsApplication {
    public static void main(String[] args) throws InterruptedException {
        EventoRegistrado event = new EventoRegistrado("1", "antonio@usuario.com");
        Thread.sleep(100);
        log.info(event.obterDetalhesEvento());
        log.info("Evento: " + event.obterData());
        SpringApplication.run(EventoDominioAbsApplication.class, args);
    }

}
