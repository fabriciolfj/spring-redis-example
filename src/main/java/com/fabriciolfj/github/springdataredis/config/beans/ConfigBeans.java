package com.fabriciolfj.github.springdataredis.config.beans;

import com.fabriciolfj.github.springdataredis.service.NotificacaoEmail;
import com.fabriciolfj.github.springdataredis.service.NotificacaoSms;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

    @Bean(name = "smsNotificacao")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "sms")
    public Notificacao notificacaoSms() {
        return new NotificacaoSms();
    }

    @Bean(name = "emailNotificacao")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "email")
    public Notificacao notificacaoEmail() {
        return new NotificacaoEmail();
    }
}
