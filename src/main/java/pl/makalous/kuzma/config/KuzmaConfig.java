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
}
