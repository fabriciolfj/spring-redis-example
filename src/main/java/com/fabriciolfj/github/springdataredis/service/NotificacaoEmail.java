package com.fabriciolfj.github.springdataredis.service;

import com.fabriciolfj.github.springdataredis.config.beans.Notificacao;

public class NotificacaoEmail implements Notificacao {
    @Override
    public String send(String message) {
        return "Notificação por email";
    }
}
