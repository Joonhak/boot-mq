package io.joonak.router;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class SocketRouter {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @MessageMapping("/chat")
    @SendTo("/public/chat")
    public Map<String, String> sendMessage(@Payload Map<String, String> message) {
        log.info("At SocketRouter.sendMessage: {}", message);
        return message;
    }

}
