package io.joonak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMessageListener {

    private final Logger log = LoggerFactory.getLogger(RabbitMessageListener.class);

    @RabbitListener(queues = "crypto-currency")
    public void received(TradeData data) {
        log.info("Received Message: {}", data);
    }

}
