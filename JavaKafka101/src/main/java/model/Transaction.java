package model;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {

    private String id;
    private Account payer;
    private Account payee;
    private BigDecimal amount;


}
