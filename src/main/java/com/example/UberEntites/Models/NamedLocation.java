package com.example.UberEntites.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "namedlocation")
public class NamedLocation extends BaseModel{


    @OneToOne(optional = false)
    @JoinColumn(
            name = "exact_location_id",
            nullable = false
    )
    private ExactLocation exactLocation;

    private String name;


    private String zipCode;

    private String city;

    private String country;

    private String state;



}
