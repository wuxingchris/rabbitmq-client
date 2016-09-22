package com.chris.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by wuxing on 2016/9/21.
 */
public class WuxingConsumer implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(WuxingConsumer.class);

    @Override
    public void onMessage(Message message) {
        logger.info("wuxing receive message------->:{}", message);
    }
}