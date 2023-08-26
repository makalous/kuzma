package pl.makalous.biggertest.strategy;

public class BotConversation implements Conversation {
    @Override
    public String answer(String message) {
        //logic here with message
        return "Answer from BOT";
    }
}
