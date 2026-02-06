package com.example.UberEntites.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="dbconstant")
public class DBConstant extends BaseModel {
    @Column(nullable = false,unique = true)
    private String name;
    private String value;

}
