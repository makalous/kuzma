package pl.makalous.biggertest.factory;

import org.springframework.context.annotation.Bean;

public class SomeFunnyConfig {
    /*@Bean
    public BotAnswer funnyConfig() {
        return new BotAnswer();
    }*/

    @Bean
    public PplAnswer funnyPeople() {
        return new PplAnswer();
    }
}
