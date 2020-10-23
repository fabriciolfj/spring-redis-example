package com.fabriciolfj.github.springdataredis.service;

import com.fabriciolfj.github.springdataredis.config.beans.Notificacao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcessarNotificacao {

    private final Notificacao notificacao;

    public String processar() {
        return notificacao.send("Teste");
    }
}
