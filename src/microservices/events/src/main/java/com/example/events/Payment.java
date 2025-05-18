package com.example.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payment {

    @JsonProperty("payment_id")
    Integer paymentId;
    @JsonProperty("user_id")
    Integer userId;
    @JsonProperty("amount")
    Float amount;
    @JsonProperty("status")
    String status;
    @JsonProperty("timestamp")
    String timestamp;
    @JsonProperty("method_type")
    String methodType;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", userId=" + userId +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", methodType='" + methodType + '\'' +
                '}';
    }
}
