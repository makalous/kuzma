package pl.makalous.sierpien.integrationwithorm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.makalous.sierpien.integrationwithorm.ruleengine.RealRuleEngine;
import pl.makalous.sierpien.integrationwithorm.ruleengine.RuleEnginePort;

@Configuration
public class SImpleConfig {
    /*@Bean
    public RuleEnginePort mocked() {
        return new MockedRuleEngine();
    }*/
    @Bean
    public RuleEnginePort real() {
        return new RealRuleEngine();
    }
}
