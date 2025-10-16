package com.example.payment.queue.dto;

import com.example.payment.model.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentProducerDTO {

    private String name;

    private PaymentStatus status;

    private Long userid;
}
