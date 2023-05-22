package websocketdemo.demo.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer {

   // @Override
   // public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
   // registry.addHandler(new WebSocketHandler(), "/websocket");
   // }

   // @Override
   // public void configureMessageBroker(MessageBrokerRegistry registry) {
   // registry.setApplicationDestinationPrefixes("/app")
   // .enableSimpleBroker("/topic");
   // }

   @Override
   public void configureMessageBroker(MessageBrokerRegistry registry) {
      registry.enableSimpleBroker("/topic");
      registry.setApplicationDestinationPrefixes("/app");
   }

   @Override
   public void registerStompEndpoints(StompEndpointRegistry registry) {
      registry.addEndpoint("/websocket")
              .setAllowedOrigins("*")
              .withSockJS();
   }

}
