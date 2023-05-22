package websocketdemo.demo.websocket.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public String getMessage(final String message) throws InterruptedException {

        Thread.sleep(1000);

        logger.info(message);

        return message;
    }

    @MessageMapping("/event1")
    @SendTo("/topic/events")
    public String handleEvent1(String event) {
        // Handle event1 logic
        logger.info(event + " event1");
        return event;
    }

    @MessageMapping("/event2")
    @SendTo("/topic/events")
    public String handleEvent2(String event) {
        // Handle event2 logic
        logger.info(event + " event2");
        return event;
    }

}
