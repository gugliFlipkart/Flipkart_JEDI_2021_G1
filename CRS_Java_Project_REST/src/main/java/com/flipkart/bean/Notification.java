package com.flipkart.bean;


public class Notification {

    private String transactionID;
    private String studentId;
    private String message;
    private double amount;

    @Override
    public String toString() {
        return "Notification{" +
                "transactionID='" + transactionID + '\'' +
                ", studentId='" + studentId + '\'' +
                ", message='" + message + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Notification(){

    }

    public Notification(String transactionID, String studentId, String message, double amount) {
        this.transactionID = transactionID;
        this.studentId = studentId;
        this.message = message;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
