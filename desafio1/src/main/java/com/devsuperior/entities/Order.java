package com.devsuperior.entities;
import jakarta.persistence.Entity;
import org.jetbrains.annotations.NotNull;

@Entity
public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    public Order() {}

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }


}
