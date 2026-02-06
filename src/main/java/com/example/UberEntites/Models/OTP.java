package com.example.UberEntites.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP  extends BaseModel{

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String phoneNumber;

    public static OTP get(String phoneNumber){
        // initialize a Random object somewhere; you should only need one
        Random random = new Random();

// generate a random integer from 0 to 899, then add 100
        Integer x = random.nextInt(9000) + 1000;

        return OTP.builder().code(x.toString()).phoneNumber(phoneNumber).build();

    }
}
