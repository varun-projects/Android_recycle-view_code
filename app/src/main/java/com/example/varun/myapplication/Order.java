package com.example.varun.myapplication;
/**
 * Created by Ashok on 19/06/16.
 */
public class Order {
    private Integer orderId_;
    private String orderDeviceId_;
    private String description_;
    private Item menuItem_;
    private Integer orderStatusId_;
    private Integer quantity_;
    private Integer orderTime_;
    private Integer paymentStatusId_;


    public Order(Integer orderId, String orderDeviceId, String description, Item menuItem,
                 Integer orderStatusId,
                 Integer quantity, Integer orderTime, Integer paymentStatusId) {
        orderId_ = orderId;
        orderDeviceId_ = orderDeviceId;
        description_ = description;
        menuItem_ = menuItem;
        orderStatusId_ = orderStatusId;
        quantity_ = quantity;
        orderTime_ = orderTime;
        paymentStatusId_ = paymentStatusId;
    }

    public Long getOrderId() {
        return orderId_;
    }

    public String getOrderDeviceId() {
        return orderDeviceId_;
    }

    public String getDescription() {
        return description_;
    }

    public Item getMenuItem() {
        return menuItem_;
    }

    public Integer getOrderStatusId() {
        return orderStatusId_;
    }

    public Integer getQuantity() {
        return quantity_;
    }


    public Integer getPaymentStatusId() {
        return paymentStatusId_;
    }
}
