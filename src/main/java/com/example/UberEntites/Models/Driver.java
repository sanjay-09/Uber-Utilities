package com.example.UberEntites.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String licenseNumber;


    @Column(nullable = false)
    private String email;

    @Column(nullable=false)
    private String password;

    private String adharNumber;


    @OneToOne(mappedBy = "driver")
    private Car car;

    @OneToOne
    private ExactLocation lastKnownLocation;

    @OneToOne
    private ExactLocation homeLocation;


    @Enumerated(value = EnumType.STRING)
    private DriverApprovedStatus driverApprovedStatus;



    @DecimalMin(value = "1.00")
    @DecimalMax(value = "4.99")

    private Double rating;








    @OneToMany(mappedBy = "driver")
    @Fetch(FetchMode.SUBSELECT)
    private List<Booking> booking;

    @Override
    public String toString() {
        return "Driver{" +
                "updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}