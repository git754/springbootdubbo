package com.cskaoyan.springbootdubbo.bean;

import java.math.BigDecimal;

public class CinemaData {
    private int uuid;
    private String cinemaName;
    private String address;
    private BigDecimal minimumPrice;

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(BigDecimal minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    @Override
    public String toString() {
        return "CinemaData{" +
                "uuid=" + uuid +
                ", cinemaName='" + cinemaName + '\'' +
                ", address='" + address + '\'' +
                ", minimumPrice=" + minimumPrice +
                '}';
    }
}
