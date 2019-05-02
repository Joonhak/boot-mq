package io.joonak;

import java.io.Serializable;

public class TradeData implements Serializable {

    private Integer trade_price;
    private Double trade_volume;
    private Integer trade_amount;
    private Double change_rate;
    private String code;

    public Integer getTrade_price() {
        return trade_price;
    }

    public void setTrade_price(Integer trade_price) {
        this.trade_price = trade_price;
    }

    public Double getTrade_volume() {
        return trade_volume;
    }

    public void setTrade_volume(Double trade_volume) {
        this.trade_volume = trade_volume;
    }

    public Integer getTrade_amount() {
        return trade_amount;
    }

    public void setTrade_amount(Integer trade_amount) {
        this.trade_amount = trade_amount;
    }

    public Double getChange_rate() {
        return change_rate;
    }

    public void setChange_rate(Double change_rate) {
        this.change_rate = change_rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TradeData{" +
                "trade_price=" + trade_price +
                ", trade_volume=" + trade_volume +
                ", trade_amount=" + trade_amount +
                ", change_rate=" + change_rate +
                ", code='" + code + '\'' +
                '}';
    }

}
