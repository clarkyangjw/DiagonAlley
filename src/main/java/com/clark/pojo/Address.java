package com.clark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private Integer id;
    private String unit;
    private String street;
    private String city;
    private String province;
    private String postcode;

}
