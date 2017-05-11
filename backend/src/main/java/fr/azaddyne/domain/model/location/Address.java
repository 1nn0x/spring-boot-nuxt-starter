package fr.azaddyne.domain.model.location;

import lombok.Data;

/**
 * Created by jacky on 11/05/2017.
 */
@Data
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
