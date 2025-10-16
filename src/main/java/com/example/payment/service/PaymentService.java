package com.example.payment.service;


import com.example.payment.model.Payment;
import com.example.payment.queue.dto.OrderKafkaDTO;
import com.example.payment.queue.dto.PaymentProducerDTO;
import com.example.payment.queue.mapper.PaymentDTOMapper;
import com.example.payment.queue.mapper.PaymentMapper;
import com.example.payment.queue.producer.Producer;
import com.example.payment.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final Producer producer;
    private final PaymentMapper PaymentMapper;
    private final PaymentDTOMapper PaymentDTOMapper;

    public void paymentProcessing(OrderKafkaDTO orderKafkaDTO){
        Payment payment = PaymentMapper.toPayment(orderKafkaDTO);

        /*
        Здесь будеть логика проверка что оплачено или нет
         */

        paymentRepository.save(payment);

        PaymentProducerDTO paymentProducerDTO = PaymentDTOMapper.toPaymentProducerDTO(payment);
        producer.sendOrderDTO(/*TOPIC*/ "orders", paymentProducerDTO);
    }
}
