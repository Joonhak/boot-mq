package io.joonak.rabbit;

import io.joonak.dto.TradeData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Component;

@Component
public class RabbitMessageListener {

    private static final String QUEUE = "crypto-currency";
    private static final String EXCHANGE = "data.trade";
    private static final String ROUTING_KEY = "krw.*";

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final SimpMessageSendingOperations messaging;
    public RabbitMessageListener(SimpMessageSendingOperations  messaging) {
        this.messaging = messaging;
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = QUEUE, durable = "false", autoDelete = "false"),
            exchange = @Exchange(value = EXCHANGE, type = "topic", durable = "false"),
            key = ROUTING_KEY
    ))
    public void bindingsTest(TradeData data) {
        log.info("Received Message: {}", data);
        messaging.convertAndSend("/market/data", data );
    }

}
