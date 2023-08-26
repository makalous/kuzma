package pl.makalous.biggertest.factory;

import org.springframework.beans.factory.annotation.Autowired;

public class FacadeClass {
    RuleEngine ruleEngine;
    //sth more

    @Autowired
    FacadeClass(RuleEngine ruleEngine) {
        this.ruleEngine = ruleEngine;
    }

    //Logic here something is going on

    void doSomethingFunny(String message) {
        ruleEngine.answerByMessage(message);
    }
}
