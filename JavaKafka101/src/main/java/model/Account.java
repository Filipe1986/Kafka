package model;

import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String email;
    private BigDecimal balance;
    private String password;

}
