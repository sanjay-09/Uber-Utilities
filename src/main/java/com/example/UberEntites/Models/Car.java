package com.example.UberEntites.Models;


import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Car extends BaseModel{

    @Column(nullable = false,unique = true)
    private String plateNumber;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;

    private String brand;

    private String model;

    @OneToOne
    @JoinColumn(name="color_id")
    private Color colorId;

    @OneToOne
    @JoinColumn(name="driver_id",nullable = false)
    private Driver driver;


}

