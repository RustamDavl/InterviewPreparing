package com.rustdv.reflectionRepeating;

import com.rustdv.reflectionRepeating.annotation.Column;
import com.rustdv.reflectionRepeating.annotation.Table;

@Table(schema = "public", table = "car")
public class Car {
    @Column("brand")
    private String brand;

    @Column("model")
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
