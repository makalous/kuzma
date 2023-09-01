package pl.makalous.sierpien.test.someAreaProblem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeAreaProblemConfig {
    @Bean
    KuzmaPort kuzmaPort() {
        return new KuzmaServiceReal();
        //return new KuzmaServiceMocked();
    }
}
