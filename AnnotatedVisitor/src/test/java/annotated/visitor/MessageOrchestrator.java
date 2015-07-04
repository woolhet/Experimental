package annotated.visitor;

import annotated.messages.Message;
import annotated.strategy.IStrategy;
import annotated.strategy.OperatorStrategy;

import java.util.List;

/**
 * Created by Thomas on 7/3/2015.
 */
public class MessageOrchestrator {
    public List<Response> orchestrateMessages(List<Message> messages) {
        final MessageManager messageManager = new MessageManager(messages);

        final IStrategy strategy = new OperatorStrategy();
        final List<Response> processedMessages = messageManager.processMessagesWithStrategy(strategy);

        return processedMessages;
    }
}
