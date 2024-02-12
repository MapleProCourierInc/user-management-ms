package com.maple.pro.courier.usermanagementms.core.models.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Address {

    private String streetNumber;

    private String streetName;

    private String unit;

    private String city;

    private String stateProvince;

    private String postalCode;

    private String country;
}
