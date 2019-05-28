package io.joonak.dto;

import java.io.Serializable;

public class TradeData implements Serializable {

    private Double price;
    private Double volume;
    private Integer amount;
    private Double change_rate;
    private String code;

    public Double getPrice() {
        return price;
    }

    public Double getVolume() {
        return volume;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getChange_rate() {
        return change_rate;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "TradeData{" +
                "price=" + price +
                ", volume=" + volume +
                ", amount=" + amount +
                ", change_rate=" + change_rate +
                ", code='" + code + '\'' +
                '}';
    }

}
