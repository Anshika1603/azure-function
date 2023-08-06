package com.nashtech.functions.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    Integer carId;
    String brand;
    String model;
    Long year;
    String color;
    Double mileage;
    Double price;
}
