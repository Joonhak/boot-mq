package io.joonak.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketEventListener {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

//    private final SimpMessagingTemplate messageTemplate;
//    public WebSocketEventListener(SimpMessagingTemplate messagingTemplate) {
//        this.messageTemplate = messagingTemplate;
//    }

    @EventListener
    public void sessionConnectEvent(SessionConnectEvent e) {
        log.info("New Socket connected!, '{}'", e.getSource());
        var headerAccessor = StompHeaderAccessor.wrap(e.getMessage());
        log.info("Session id : '{}'", headerAccessor.getSessionId());
    }

    @EventListener
    public void sessionDisConnectEvent(SessionDisconnectEvent e) {
        var headerAccessor = StompHeaderAccessor.wrap(e.getMessage());
        log.info("Session disconnected.. Session id: {}", headerAccessor.getSessionId());
    }

}
