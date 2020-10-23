package com.fabriciolfj.github.springdataredis.service;

import com.fabriciolfj.github.springdataredis.config.beans.Notificacao;

public class NotificacaoSms implements Notificacao {
    @Override
    public String send(String message) {
        return "Notificação por sms";
    }
}
