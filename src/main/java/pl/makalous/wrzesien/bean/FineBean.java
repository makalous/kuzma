package pl.makalous.wrzesien.bean;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class FineBean {

    @PostConstruct
    public void init() {
        //do something funny
    }

    @PreDestroy
    public void destemido() {
        //nvm
    }
}
