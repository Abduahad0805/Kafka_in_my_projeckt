package com.example.payment.queue.producer;

import com.example.payment.queue.dto.PaymentProducerDTO;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Producer {

    private final KafkaTemplate<String, PaymentProducerDTO> kafkaTemplate;
    private final String TOPIC = "payment";



    public void sendOrderDTO(String orders, PaymentProducerDTO paymentProducerDTO) {
        kafkaTemplate.send(TOPIC, paymentProducerDTO);
    }
}
