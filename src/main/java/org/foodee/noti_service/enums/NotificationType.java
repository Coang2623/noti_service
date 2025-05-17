package org.foodee.noti_service.enums;

public enum NotificationType {
    ORDER_CREATED("Order created"),
    ORDER_STATUS_CHANGED("Order status changed"),
    PAYMENT_SUCCESS("Payment success"),
    DELIVERY_UPDATED("Delivery updated");

    private final String NotificationType;

    NotificationType(String NotificationType) {
        this.NotificationType = NotificationType;
    }
}
