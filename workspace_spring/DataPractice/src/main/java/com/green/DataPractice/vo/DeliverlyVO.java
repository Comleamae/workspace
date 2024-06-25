package com.green.DataPractice.vo;

public class DeliverlyVO {

    private String consumer;
    private String phNum;
    private String address;

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliverlyVO{" +
                "consumer='" + consumer + '\'' +
                ", phNum='" + phNum + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
