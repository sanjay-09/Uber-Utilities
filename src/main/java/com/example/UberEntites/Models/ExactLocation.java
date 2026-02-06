package com.example.UberEntites.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exactlocation")
public class ExactLocation extends BaseModel {

    @Column(nullable = false)
   private Double longitude;


    @Column(nullable = false)
   private Double latitude;


}




