package sijang.project.madang.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class Users {

    @Id
    @GeneratedValue
    private Long id;

    private String password;

    private String username;


}
