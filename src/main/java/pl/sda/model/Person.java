package pl.sda.model;

import lombok.*;

/**
 * @Data = EqualsAndHashCode ToString Setter Getter
 */


@AllArgsConstructor
@Data
public class Person {

    private int id;

    private String name;

    private String surname;


}
