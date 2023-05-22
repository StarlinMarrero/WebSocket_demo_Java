package websocketdemo.demo.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Handle incoming messages
        String payload = message.getPayload();
        // Process the payload as needed
        // Send a response back to the client
        String response = "Server received your message: " + payload;
        session.sendMessage(new TextMessage(response));
    }
}
