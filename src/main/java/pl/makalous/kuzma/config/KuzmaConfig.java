package pl.makalous.kuzma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.makalous.kuzma.entity.KuzmaEntity;

@Configuration
public class KuzmaConfig {
    @Bean
    KuzmaEntity kuzmaEntity() {
        return new KuzmaEntity();
    }

    @Bean
    io.spring.guides.gs_producing_web_service.Kuzma kuzmaSoap() {
        return new io.spring.guides.gs_producing_web_service.Kuzma();
    }
}
