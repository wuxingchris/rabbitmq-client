package com.lin.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * 功能概要：消息产生,提交到队列中去
 *
 * @author linbingwen
 * @since 2016年1月15日
 */
@Service
public class MessageProducer {

    private Logger logger = LoggerFactory.getLogger(MessageProducer.class);

    @Resource(name="amqpTemplate")
    private AmqpTemplate amqpTemplate;

    public void sendMessage(Object message) throws IOException {
        logger.info("to send message:{}", message);
        amqpTemplate.convertAndSend("exchangeTest","queueTestKey", message);
        amqpTemplate.convertAndSend("exchangeTest","queueTestChris", message);
    }
}
