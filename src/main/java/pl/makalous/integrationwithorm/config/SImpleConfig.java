package pl.makalous.integrationwithorm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.makalous.integrationwithorm.ruleengine.MockedRuleEngine;
import pl.makalous.integrationwithorm.ruleengine.RealRuleEngine;
import pl.makalous.integrationwithorm.ruleengine.RuleEnginePort;

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
