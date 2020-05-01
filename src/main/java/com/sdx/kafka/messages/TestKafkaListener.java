package com.sdx.kafka.messages;

import com.sdx.kafka.KafkaListener;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

@Component
public class TestKafkaListener implements KafkaListener<String,String> {
    @Override
    public String topic () {
        return "wty1";
    }

    @Override
    public String partition() {
        return "1";
    }


    @Override
    public void onMessage(ConsumerRecord<String, String> consumerRecord, Consumer<?, ?> consumer) {
        System.out.println("===========receive test message:" + consumerRecord.value());
    }
}