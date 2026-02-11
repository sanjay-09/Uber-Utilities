package com.example.UberEntites.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends  BaseModel  {

    @Enumerated(value= EnumType.STRING)
    private BookingStatus bookingStatus;

    private Date StartTime;

    private Date endTime;

    private Long Distance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation startLocation;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation endLocation;


}