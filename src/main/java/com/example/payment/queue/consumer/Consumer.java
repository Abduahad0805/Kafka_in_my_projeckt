package com.example.payment.queue.consumer;


import com.example.payment.queue.dto.OrderKafkaDTO;
import com.example.payment.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Consumer {

    private final PaymentService paymentService;

    @KafkaListener(topics = "orders", groupId = "my-group")
    public void consumer(OrderKafkaDTO orderKafkaDTO){
        System.out.println("Получен OrderKafkaDTO: " + orderKafkaDTO);
        paymentService.paymentProcessing(orderKafkaDTO);

    }
}
