package model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String id;
    private String name;
    private String email;
    private String birthday ;

}
