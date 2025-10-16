package com.example.payment.queue.dto;


import com.example.payment.model.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderKafkaDTO {

    private String name;

    private Long id;

    private BigDecimal price;

    private PaymentStatus orderStatusPayment;
}
