package com.lin.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by wuxing on 2016/9/21.
 */
public class Chris implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(Chris.class);

    @Override
    public void onMessage(Message message) {
        logger.info("chris receive message------->:{}", message);
    }
}
