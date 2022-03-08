package pl.makalous.kuzma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import pl.makalous.kuzma.entity.KuzmaEntity;

@Configuration
@EnableWebSecurity
public class KuzmaConfig extends WebSecurityConfigurerAdapter {
    @Bean
    KuzmaEntity kuzmaEntity() {
        return new KuzmaEntity();
    }

    @Bean
    io.spring.guides.gs_producing_web_service.Kuzma kuzmaSoap() {
        return new io.spring.guides.gs_producing_web_service.Kuzma();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/**");
    }

}
