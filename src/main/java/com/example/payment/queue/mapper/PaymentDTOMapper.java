package com.example.payment.queue.mapper;

import com.example.payment.model.Payment;
import com.example.payment.queue.dto.OrderKafkaDTO;
import com.example.payment.queue.dto.PaymentProducerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentDTOMapper {

    PaymentProducerDTO toPaymentProducerDTO(Payment payment);
    Payment toPayment(OrderKafkaDTO paymentProducerDTO);

}
