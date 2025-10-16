package com.example.payment.model.enums;

public enum PaymentStatus {
    PENDING("Не оплачено"),
    PAID("Оплачено"),
    CANCELED("Отменено");

    private final String description;

    PaymentStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
