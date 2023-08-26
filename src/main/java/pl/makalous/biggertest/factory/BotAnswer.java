package pl.makalous.biggertest.factory;

public class BotAnswer implements RuleEngine {
    @Override
    public String answerByMessage(String message) {
        return "Answer From Bot by message: " + message;
    }

    @Override
    public String answerById(Long id) {
        return "Answer From Bot by ID: " + id;
    }
}
