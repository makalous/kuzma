package pl.makalous.sierpien.biggertest.factory;

public class PplAnswer implements RuleEngine {
    @Override
    public String answerByMessage(String message) {
        return "Answer From people by message: " + message;
    }

    @Override
    public String answerById(Long id) {
        return "Answer From people by ID: " + id;
    }
}
