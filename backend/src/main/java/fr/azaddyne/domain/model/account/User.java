package fr.azaddyne.domain.model.account;

import fr.azaddyne.domain.model.location.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Created by jacky on 09/05/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String name;
    private String username;
    private String phone;
    private String website;
    private Address address;
    //    @JsonIgnore
    private String password;
    private boolean locked;


    /*
    { "name": "ADMIN",
"username": "ADMINZ",
"phone": "ADMIN",
"website": "ADMIN",
"address": null,
"password": "ADMIN",
"locked": false
}
     */

}
