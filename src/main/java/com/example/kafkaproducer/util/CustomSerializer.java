package com.example.kafkaproducer.util;

import com.example.kafkaproducer.vo.PurchaseLogOneProduct;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class CustomSerializer implements Serializer<PurchaseLogOneProduct> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public byte[] serialize(String topic, PurchaseLogOneProduct data) {
        try {
            if (data == null){
                return null;
            }
            System.out.println("Serializing...");
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new SecurityException("Error when serializing MessageDto to byte[]");
        }
    }

    @Override
    public void close() {
    }

}