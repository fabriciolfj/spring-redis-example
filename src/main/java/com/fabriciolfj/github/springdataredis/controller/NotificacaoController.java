package com.fabriciolfj.github.springdataredis.controller;

import com.fabriciolfj.github.springdataredis.service.ProcessarNotificacao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notificacao")
public class NotificacaoController {

    private final ProcessarNotificacao processarNotificacao;

    @GetMapping
    public String execute() {
        return processarNotificacao.processar();
    }
}
