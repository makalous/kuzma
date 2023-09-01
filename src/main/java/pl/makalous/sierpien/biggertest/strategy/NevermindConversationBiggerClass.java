package pl.makalous.sierpien.biggertest.strategy;

import java.util.ArrayList;
import java.util.List;

public class NevermindConversationBiggerClass {
    private List<Conversation> conversationList = new ArrayList<>();

    void doSth() {
        conversationList.add(new BotConversation());
        conversationList.add(new PeopleConversation());
    }
}
