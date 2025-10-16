package com.example.payment.queue.mapper;

import com.example.payment.queue.dto.OrderKafkaDTO;
import com.example.payment.model.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface PaymentMapper {
    Payment toPayment(OrderKafkaDTO dto);
    OrderKafkaDTO toDTO(Payment entity);
}
