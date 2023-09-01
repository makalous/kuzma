package pl.makalous.sierpien.biggertest.strategy;

public class PeopleConversation implements Conversation {
    @Override
    public String answer(String message) {
        //logic here with message
        return "Answer from a person";
    }
}
