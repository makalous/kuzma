package pl.makalous.wrzesien.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.makalous.sierpien.anothertest.EntityOne;
import pl.makalous.sierpien.anothertest.EntityTwo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class NevermindConfiguration {

    @Bean
    public EntityOne entityOneBean() {
        return new EntityOne();
    }

    @Bean
    public EntityTwo entityTwoBean() {
        return new EntityTwo();
    }

    @PostConstruct
    public void init() {

    }

    @PreDestroy
    public void destroy() {

    }
}
