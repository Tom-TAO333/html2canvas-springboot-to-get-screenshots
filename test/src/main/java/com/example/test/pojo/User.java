package com.example.test.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class User implements Serializable {

    private String product_name;
    private String official_price;
    private String image_url;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime create_time;

    public User() {
    }

    public User(String product_name, String official_price, String image_url, LocalDateTime create_time) {
        this.product_name = product_name;
        this.official_price = official_price;
        this.image_url = image_url;
        this.create_time = create_time;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getOfficial_price() {
        return official_price;
    }

    public void setOfficial_price(String official_price) {
        this.official_price = official_price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

}
